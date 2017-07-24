/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalbuild.SinglePlay;
import static finalbuild.SinglePlay.Intermediateboard.UpperLeftButtonI;
import static finalbuild.SinglePlay.Intermediateboard.UpperMiddleButtonI;
import static finalbuild.SinglePlay.Intermediateboard.UpperRightButtonI;
import static finalbuild.SinglePlay.Intermediateboard.MiddleLeftButtonI;
import static finalbuild.SinglePlay.Intermediateboard.MiddleMiddleButtonI;
import static finalbuild.SinglePlay.Intermediateboard.MiddleRightButtonI;
import static finalbuild.SinglePlay.Intermediateboard.BottomLeftButtonI;
import static finalbuild.SinglePlay.Intermediateboard.BottomMiddleButtonI;
import static finalbuild.SinglePlay.Intermediateboard.ButtomRIghtButtonI;
import javax.swing.JOptionPane;
/**
 *
 * @author giovannikolo
 */
public class MechanicsI {
    
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
 public static void checkHorizontalI()
    {
        
     if(UpperLeftButtonI.getText() == UpperMiddleButtonI.getText() 
             && UpperMiddleButtonI.getText() == UpperRightButtonI.getText() 
             && UpperLeftButtonI.getText() != "") 
     {
        win = true; 
     }
     else if (MiddleLeftButtonI.getText() == MiddleMiddleButtonI.getText() 
             && MiddleMiddleButtonI.getText() == MiddleRightButtonI.getText() 
             && MiddleLeftButtonI.getText() != "")
     {
         win = true;
     } 
     else if (BottomLeftButtonI.getText() == BottomMiddleButtonI.getText() 
             && BottomMiddleButtonI.getText() == ButtomRIghtButtonI.getText() 
             && BottomLeftButtonI.getText() != "")
     {
         win = true;
     }
     
    }
 
 public static void checkVerticalI()
    {
       if(UpperRightButtonI.getText() == MiddleLeftButtonI.getText() 
               && MiddleLeftButtonI.getText() == BottomLeftButtonI.getText() 
               && UpperLeftButtonI.getText() != "") 
     {
        win = true; 
     }
     else if (UpperMiddleButtonI.getText() == MiddleMiddleButtonI.getText() 
             && MiddleMiddleButtonI.getText() == BottomMiddleButtonI.getText() 
             && UpperMiddleButtonI.getText() != "")
     {
         win = true;
     } 
     else if (UpperRightButtonI.getText() == MiddleRightButtonI.getText() 
             && MiddleRightButtonI.getText() == ButtomRIghtButtonI.getText() 
             && UpperRightButtonI.getText() != "")
     {
         win = true;
     }  
    }
 
 public static void checkDiagonalI()
    {
      if(UpperLeftButtonI.getText() == MiddleMiddleButtonI.getText() 
              && MiddleMiddleButtonI.getText() == ButtomRIghtButtonI.getText() 
              && UpperRightButtonI.getText() != "") 
     {
        win = true; 
     }
     else if (UpperRightButtonI.getText() == MiddleMiddleButtonI.getText() 
             && MiddleMiddleButtonI.getText() == BottomLeftButtonI.getText() 
             && UpperRightButtonI.getText() != "")
     {
         win = true;
     } 
     
    }
 public static void DeclareWinOrDrawI()
    {
        if(win == true && count == 5|count==7|count==9)
        {
            
            JOptionPane.showMessageDialog(null, playerName +"   "+ "win");
            clearBoardI();
        }
        if(win == true && count ==6|count==8|count==10)
        {
            
            JOptionPane.showMessageDialog(null, playerName +"   "+ "win");
            clearBoardI();
        }
        if (count ==9 && win == false)
        {
            JOptionPane.showMessageDialog(null, "its a draw");
            clearBoardI();
        }
    }
 public static void clearBoardI()
    {
        win = false;
        UpperLeftButtonI.setText("");
        UpperMiddleButtonI.setText("");
        UpperRightButtonI.setText("");
        MiddleLeftButtonI.setText("");
        MiddleMiddleButtonI.setText("");
        MiddleRightButtonI.setText("");
        BottomLeftButtonI.setText("");
        BottomMiddleButtonI.setText("");
        ButtomRIghtButtonI.setText("");
        restardBoardI();
        count=0;
        
    }
 
 public static void enablequaresI()
    {
        
        UpperLeftButtonI.setEnabled(false);
        UpperMiddleButtonI.setEnabled(false);
        UpperRightButtonI.setEnabled(false);
        MiddleLeftButtonI.setEnabled(false);
        MiddleMiddleButtonI.setEnabled(false);
        MiddleRightButtonI.setEnabled(false);
        BottomLeftButtonI.setEnabled(false);
        BottomMiddleButtonI.setEnabled(false);
        ButtomRIghtButtonI.setEnabled(false);
    }
 
 public static void restardBoardI()
    {
       
      UpperLeftButtonI.setEnabled(true);
      UpperMiddleButtonI.setEnabled(true);
      UpperRightButtonI.setEnabled(true);
      MiddleLeftButtonI.setEnabled(true);
      MiddleMiddleButtonI.setEnabled(true);
      MiddleRightButtonI.setEnabled(true);
      BottomLeftButtonI.setEnabled(true);
     BottomMiddleButtonI.setEnabled(true);
      ButtomRIghtButtonI.setEnabled(true);
     
    }
 
 
 
    
}
