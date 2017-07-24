/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalbuild.SinglePlay;
import static finalbuild.SinglePlay.Hardboard.UpperLeftButtonH;
import static finalbuild.SinglePlay.Hardboard.UpperMiddleButtonH;
import static finalbuild.SinglePlay.Hardboard.UpperRightButtonH;
import static finalbuild.SinglePlay.Hardboard.MiddleLeftButtonH;
import static finalbuild.SinglePlay.Hardboard.MiddleMiddleButtonH;
import static finalbuild.SinglePlay.Hardboard.MiddleRightButtonH;
import static finalbuild.SinglePlay.Hardboard.BottomLeftButtonH;
import static finalbuild.SinglePlay.Hardboard.BottomMiddleButtonH;
import static finalbuild.SinglePlay.Hardboard.BottomRightButtonH;
import javax.swing.JOptionPane;
/**
 *
 * @author giovannikolo
 */
public class MechanicsH {
    
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
 
 public static void checkHorizontalH()
    {
        
     if(UpperLeftButtonH.getText() == UpperMiddleButtonH.getText() 
             && UpperMiddleButtonH.getText() == UpperRightButtonH.getText() 
             && UpperLeftButtonH.getText() != "") 
     {
        win = true; 
     }
     else if (MiddleLeftButtonH.getText() == MiddleMiddleButtonH.getText() 
             && MiddleMiddleButtonH.getText() == MiddleRightButtonH.getText() 
             && MiddleLeftButtonH.getText() != "")
     {
         win = true;
     } 
     else if (BottomLeftButtonH.getText() == BottomMiddleButtonH.getText() 
             && BottomMiddleButtonH.getText() == BottomRightButtonH.getText() 
             && BottomLeftButtonH.getText() != "")
     {
         win = true;
     }
     
    }
 
 public static void checkVerticalH()
    {
       if(UpperRightButtonH.getText() == MiddleLeftButtonH.getText() 
               && MiddleLeftButtonH.getText() == BottomLeftButtonH.getText() 
               && UpperLeftButtonH.getText() != "") 
     {
        win = true; 
     }
     else if (UpperMiddleButtonH.getText() == MiddleMiddleButtonH.getText() 
             && MiddleMiddleButtonH.getText() == BottomMiddleButtonH.getText() 
             && UpperMiddleButtonH.getText() != "")
     {
         win = true;
     } 
     else if (UpperRightButtonH.getText() == MiddleRightButtonH.getText() 
             && MiddleRightButtonH.getText() == BottomRightButtonH.getText() 
             && UpperRightButtonH.getText() != "")
     {
         win = true;
     }  
    }
 
 public static void checkDiagonalH()
    {
      if(UpperRightButtonH.getText() == MiddleMiddleButtonH.getText() 
              && MiddleMiddleButtonH.getText() == BottomRightButtonH.getText() 
              && UpperRightButtonH.getText() != "") 
     {
        win = true; 
     }
     else if (UpperRightButtonH.getText() == MiddleMiddleButtonH.getText() 
             && MiddleMiddleButtonH.getText() == BottomLeftButtonH.getText() 
             && UpperRightButtonH.getText() != "")
     {
         win = true;
     } 
     
    }
 
 public static void DeclareWinOrDrawH()
    {
        if(win == true && count == 5|count==7|count==9)
        {
            
            JOptionPane.showMessageDialog(null, playerName +"   "+ "win");
            clearBoardH();
        }
        if(win == true && count ==6|count==8|count==10)
        {
            
            JOptionPane.showMessageDialog(null, playerName +"   "+ "win");
            clearBoardH();
        }
        if (count ==9 && win == false)
        {
            JOptionPane.showMessageDialog(null, "its a draw");
            clearBoardH();
        }
    }   
 
  public static void clearBoardH()
    {
        win = false;
        UpperLeftButtonH.setText("");
        UpperMiddleButtonH.setText("");
        UpperRightButtonH.setText("");
        MiddleLeftButtonH.setText("");
        MiddleMiddleButtonH.setText("");
        MiddleRightButtonH.setText("");
        BottomLeftButtonH.setText("");
        BottomMiddleButtonH.setText("");
        BottomRightButtonH.setText("");
        restardBoardH();
        count=0;
        
    }
  
  public static void enablequaresH()
    {
        
        UpperLeftButtonH.setEnabled(false);
        UpperMiddleButtonH.setEnabled(false);
        UpperRightButtonH.setEnabled(false);
        MiddleLeftButtonH.setEnabled(false);
        MiddleMiddleButtonH.setEnabled(false);
        MiddleRightButtonH.setEnabled(false);
        BottomLeftButtonH.setEnabled(false);
        BottomMiddleButtonH.setEnabled(false);
        BottomRightButtonH.setEnabled(false);
    }
  
  public static void restardBoardH()
    {
       
      UpperLeftButtonH.setEnabled(true);
      UpperMiddleButtonH.setEnabled(true);
      UpperRightButtonH.setEnabled(true);
      MiddleLeftButtonH.setEnabled(true);
      MiddleMiddleButtonH.setEnabled(true);
      MiddleRightButtonH.setEnabled(true);
      BottomLeftButtonH.setEnabled(true);
      BottomMiddleButtonH.setEnabled(true);
      BottomRightButtonH.setEnabled(true);
     
    }
  
  
    
}
