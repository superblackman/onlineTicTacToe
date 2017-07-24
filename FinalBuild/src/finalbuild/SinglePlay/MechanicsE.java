/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalbuild.SinglePlay;
import static finalbuild.SinglePlay.Easyboard.UpperLeftButtonE;
import static finalbuild.SinglePlay.Easyboard.UpperMiddleButtonE;
import static finalbuild.SinglePlay.Easyboard.UpperRightButttonE;
import static finalbuild.SinglePlay.Easyboard.MiddleLeftButtonE;
import static finalbuild.SinglePlay.Easyboard.MiddleMiddleButtonE;
import static finalbuild.SinglePlay.Easyboard.MiddleRightButtonE;
import static finalbuild.SinglePlay.Easyboard.BottomLeftButtonE;
import static finalbuild.SinglePlay.Easyboard.BottonMiddleButtonE;
import static finalbuild.SinglePlay.Easyboard.BottomRightButtonE;
import javax.swing.JOptionPane;
/**
 *
 * @author giovannikolo
 */
public class MechanicsE {
    
    public static String letter = "";
    private static String playerName = "";
    public static int count = 0;
    private static boolean win = false;
    
 public static void whosTurn()
    {
        if(count % 2 == 0 )
        {
            
            
            
            
            letter = "O";
            
        }
        else
        {
            
            
            
            letter = "X";
            
        }
    }
    
 public static void checkHorizontalE()
    {
        
     if(UpperLeftButtonE.getText() == UpperMiddleButtonE.getText() 
             && UpperMiddleButtonE.getText() == UpperRightButttonE.getText() 
             && UpperLeftButtonE.getText() != "") 
     {
        win = true; 
     }
     else if (MiddleLeftButtonE.getText() == MiddleMiddleButtonE.getText() 
             && MiddleMiddleButtonE.getText() == MiddleRightButtonE.getText() 
             && MiddleLeftButtonE.getText() != "")
     {
         win = true;
     } 
     else if (BottomLeftButtonE.getText() == BottonMiddleButtonE.getText() 
             && BottonMiddleButtonE.getText() == BottomRightButtonE.getText() 
             && BottomLeftButtonE.getText() != "")
     {
         win = true;
     }
     
    }
 
 public static void checkVerticalE()
    {
       if(UpperRightButttonE.getText() == MiddleLeftButtonE.getText() 
               && MiddleLeftButtonE.getText() == BottomLeftButtonE.getText() 
               && UpperLeftButtonE.getText() != "") 
     {
        win = true; 
     }
     else if (UpperMiddleButtonE.getText() == MiddleMiddleButtonE.getText() 
             && MiddleMiddleButtonE.getText() == BottonMiddleButtonE.getText() 
             && UpperMiddleButtonE.getText() != "")
     {
         win = true;
     } 
     else if (UpperRightButttonE.getText() == MiddleRightButtonE.getText() 
             && MiddleRightButtonE.getText() == BottomRightButtonE.getText() 
             && UpperRightButttonE.getText() != "")
     {
         win = true;
     }  
    }
 
 public static void checkDiagonalE()
    {
      if(UpperLeftButtonE.getText() == MiddleMiddleButtonE.getText() 
              && MiddleMiddleButtonE.getText() == BottomRightButtonE.getText() 
              && UpperRightButttonE.getText() != "") 
     {
        win = true; 
     }
     else if (UpperRightButttonE.getText() == MiddleMiddleButtonE.getText() 
             && MiddleMiddleButtonE.getText() == BottomLeftButtonE.getText() 
             && UpperRightButttonE.getText() != "")
     {
         win = true;
     } 
     
    }
 
 public static void DeclareWinOrDrawE()
    {
        if(win == true && count == 5|count==7|count==9)
        {
            
            JOptionPane.showMessageDialog(null, playerName +"   "+ "win");
            clearBoardE();
        }
        if(win == true && count ==6|count==8|count==10)
        {
            
            JOptionPane.showMessageDialog(null, playerName +"   "+ "win");
            clearBoardE();
        }
        if (count ==9 && win == false)
        {
            JOptionPane.showMessageDialog(null, "its a draw");
            clearBoardE();
        }
    } 
 
 public static void clearBoardE()
    {
        win = false;
        UpperLeftButtonE.setText("");
        UpperMiddleButtonE.setText("");
        UpperRightButttonE.setText("");
        MiddleLeftButtonE.setText("");
        MiddleMiddleButtonE.setText("");
        MiddleRightButtonE.setText("");
        BottomLeftButtonE.setText("");
        BottonMiddleButtonE.setText("");
        BottomRightButtonE.setText("");
        restardBoardE();
        count=0;
        
    }
 
   public static void enablequaresE()
    {
        
        UpperLeftButtonE.setEnabled(false);
        UpperMiddleButtonE.setEnabled(false);
        UpperRightButttonE.setEnabled(false);
        MiddleLeftButtonE.setEnabled(false);
        MiddleMiddleButtonE.setEnabled(false);
        MiddleRightButtonE.setEnabled(false);
        BottomLeftButtonE.setEnabled(false);
        BottonMiddleButtonE.setEnabled(false);
        BottomRightButtonE.setEnabled(false);
    }
   
   public static void restardBoardE()
    {
       
      UpperLeftButtonE.setEnabled(true);
      UpperMiddleButtonE.setEnabled(true);
      UpperRightButttonE.setEnabled(true);
      MiddleLeftButtonE.setEnabled(true);
      MiddleMiddleButtonE.setEnabled(true);
      MiddleRightButtonE.setEnabled(true);
      BottomLeftButtonE.setEnabled(true);
      BottonMiddleButtonE.setEnabled(true);
      BottomRightButtonE.setEnabled(true);
     
    }
   
   public static void EasyComputerPlayer()
    {
        /**
         * Computer will play to lose
         * and actively push human to a winning position
         * will lose based on 3 known popular strategies which;
         * vertical  where human tries vertical win
         * horizontal where the human tries to win horizontally
         * diagonal where the human tries to win diagonally 
         */
        count++;
        //scenario 1
        if( UpperLeftButtonE.getText() == "X" &&  UpperMiddleButtonE.getText() == "" && UpperRightButttonE.getText() == "")
        {
            MiddleLeftButtonE.setText("O");
            MiddleLeftButtonE.setEnabled(false);
        }
        
        else if( UpperLeftButtonE.getText() == "X" &&  UpperMiddleButtonE.getText() == "X" 
                && UpperRightButttonE.getText() == "" && MiddleLeftButtonE.getText()=="O")
        {
            MiddleMiddleButtonE.setText("O");
            MiddleMiddleButtonE.setEnabled(false);
        }
        
        // horizontal2
        else if( MiddleLeftButtonE.getText() == "X" &&  MiddleMiddleButtonE.getText() == "" &&  MiddleRightButtonE.getText() == "")
        {
            UpperLeftButtonE.setText("O");
            UpperLeftButtonE.setEnabled(false);
        } 
        
        else if( MiddleLeftButtonE.getText() == "X" &&  MiddleMiddleButtonE.getText() == "X" 
                &&  MiddleRightButtonE.getText() == "" && UpperLeftButtonE.getText()=="O")
        {
            UpperMiddleButtonE.setText("O");
            UpperMiddleButtonE.setEnabled(false);
        }
        // horizontal3
        else if( BottomLeftButtonE.getText() == "X" &&  BottonMiddleButtonE.getText() == "" &&  BottomRightButtonE.getText() == "")
        {
            MiddleLeftButtonE.setText("O");
            MiddleLeftButtonE.setEnabled(false);
        }
        
        else if( BottomLeftButtonE.getText() == "X" &&  BottonMiddleButtonE.getText() == "X" &&  BottomRightButtonE.getText() == "")
        {
            UpperLeftButtonE.setText("O");
            UpperLeftButtonE.setEnabled(false);
        }
        
        // diagonal
        else if( UpperLeftButtonE.getText() == "X" &&  MiddleMiddleButtonE.getText() == "" &&  BottomRightButtonE.getText() == "")
        {
            UpperMiddleButtonE.setText("O");
            UpperMiddleButtonE.setEnabled(false);
        }
        
        else if( UpperLeftButtonE.getText() == "X" &&  MiddleMiddleButtonE.getText() == "X" &&  BottomRightButtonE.getText() == "")
        {
            MiddleRightButtonE.setText("O");
            MiddleRightButtonE.setEnabled(false);
            
        }
        //diagonal 2
        else if( UpperRightButttonE.getText() == "X" &&  MiddleMiddleButtonE.getText() == "" &&  BottomLeftButtonE.getText() == "")
        {
            UpperLeftButtonE.setText("O");                                                                                                                                                                                                                                                                                                                                                                                                                                              
        }
        
        else if( UpperRightButttonE.getText() == "X" &&  MiddleMiddleButtonE.getText() == "X" &&  BottomLeftButtonE.getText() == "")
        {
            UpperMiddleButtonE.setText("O");
            UpperMiddleButtonE.setEnabled(false);
        }
        
    }
    
        
     
    
 
 
 
 
}
