/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalbuild.Versus;




import static finalbuild.Versus.VMenu.jTextField1;
import static finalbuild.Versus.VMenu.jTextField2;
import static finalbuild.Versus.versusboard.UpperLeftButtonV;
import static finalbuild.Versus.versusboard.UpperMiddleV;
import static finalbuild.Versus.versusboard.UpperRightV;
import static finalbuild.Versus.versusboard.MiddleLeftV;
import static finalbuild.Versus.versusboard.MiddleMiddleButtonV;
import static finalbuild.Versus.versusboard.MiddleRightButtonV;
import static finalbuild.Versus.versusboard.BottomLeftButtonV;
import static finalbuild.Versus.versusboard.ButtomMiddleButtonV;
import static finalbuild.Versus.versusboard.BottomRightButtonV;
import static finalbuild.Versus.versusboard.jLabel1;
import javax.swing.JOptionPane;
/**
 *
 * @author giovannikolo
 */
public class Mechanics {
   
    public static String letter = "";
    private static String playerName = "";
    public static int count = 0;
    private static boolean win = false;
    
 public static void whosTurn()
    {
        if(count % 2 == 0 )
        {
            
            
            playerName = VMenu.jTextField2.getText();
            
            letter = "O";
            
        }
        else
        {
            
            playerName = VMenu.jTextField1.getText();
            
            letter = "X";
            
        }
    }
/**
 * This method will check to see if there is 3 icons in a row that are the same horizontally
 * if there is, it will change the games state from no win to a win via boolean function
 */
public static void checkHorizontal()
    {
        
     if(UpperLeftButtonV.getText() == UpperMiddleV.getText() && UpperMiddleV.getText() == UpperRightV.getText() && UpperLeftButtonV.getText() != "") 
     {
        win = true; 
     }
     else if (MiddleLeftV.getText() == MiddleMiddleButtonV.getText() && MiddleMiddleButtonV.getText() == MiddleRightButtonV.getText() && MiddleLeftV.getText() != "")
     {
         win = true;
     } 
     else if (BottomLeftButtonV.getText() == ButtomMiddleButtonV.getText() && ButtomMiddleButtonV.getText() == BottomRightButtonV.getText() && BottomLeftButtonV.getText() != "")
     {
         win = true;
     }
     
    }
/**
 * like the above method, this method checks for vertical wins
 */
public static void checkVertical()
    {
       if(UpperRightV.getText() == MiddleLeftV.getText() 
               && MiddleLeftV.getText() == BottomLeftButtonV.getText() 
               && UpperLeftButtonV.getText() != "") 
     {
        win = true; 
     }
     else if (UpperMiddleV.getText() == MiddleMiddleButtonV.getText() 
             && MiddleMiddleButtonV.getText() == ButtomMiddleButtonV.getText() 
             && UpperMiddleV.getText() != "")
     {
         win = true;
     } 
     else if (UpperRightV.getText() == MiddleRightButtonV.getText() 
             && MiddleRightButtonV.getText() == BottomRightButtonV.getText() 
             && UpperRightV.getText() != "")
     {
         win = true;
     }  
    }
    /**
     * this method checks for wins along the diagonal plane
     */
    public static void checkDiagonal()
    {
      if(UpperRightV.getText() == MiddleMiddleButtonV.getText() 
              && MiddleMiddleButtonV.getText() == BottomRightButtonV.getText() 
              && UpperRightV.getText() != "") 
     {
        win = true; 
     }
     else if (UpperRightV.getText() == MiddleMiddleButtonV.getText() 
             && MiddleMiddleButtonV.getText() == BottomLeftButtonV.getText() 
             && UpperRightV.getText() != "")
     {
         win = true;
     } 
     
    }
    
    public static void DeclareWinOrDraw()
    {
        if(win == true && count == 5|count==7|count==9)
        {
            
            JOptionPane.showMessageDialog(null, playerName +"   "+ "win");
            clearBoard();
        }
        if(win == true && count ==6|count==8|count==10)
        {
            
            JOptionPane.showMessageDialog(null, playerName +"   "+ "win");
            clearBoard();
        }
        if (count ==9 && win == false)
        {
            JOptionPane.showMessageDialog(null, "its a draw");
            clearBoard();
        }
    }   
    
    public static void clearBoard()
    {
        win = false;
        UpperLeftButtonV.setText("");
        UpperMiddleV.setText("");
        UpperRightV.setText("");
        MiddleLeftV.setText("");
        MiddleMiddleButtonV.setText("");
        MiddleRightButtonV.setText("");
        BottomLeftButtonV.setText("");
        ButtomMiddleButtonV.setText("");
        BottomRightButtonV.setText("");
        restardBoard();
        jLabel1.setText("");
        count=0;
        
    }
    
    public static void enablequares()
    {
        
        UpperLeftButtonV.setEnabled(false);
        UpperMiddleV.setEnabled(false);
        UpperRightV.setEnabled(false);
        MiddleLeftV.setEnabled(false);
        MiddleMiddleButtonV.setEnabled(false);
        MiddleRightButtonV.setEnabled(false);
        BottomLeftButtonV.setEnabled(false);
        ButtomMiddleButtonV.setEnabled(false);
        BottomRightButtonV.setEnabled(false);
    }
    
    public static void restardBoard()
    {
       
      UpperLeftButtonV.setEnabled(true);
      UpperMiddleV.setEnabled(true);
      UpperRightV.setEnabled(true);
      MiddleLeftV.setEnabled(true);
      MiddleMiddleButtonV.setEnabled(true);
      MiddleRightButtonV.setEnabled(true);
      BottomLeftButtonV.setEnabled(true);
      ButtomMiddleButtonV.setEnabled(true);
      BottomRightButtonV.setEnabled(true);
     
    }



    public static void updateBanner()
    {
        if(count == 1|count==3|count==5|count==7|count==9)
        {
            
            jLabel1.setText("it is..." + jTextField2.getText()+"' turn");
            
        }
        if(count == 2|count==4|count==6|count==8)
        {
            
            jLabel1.setText("it is..." + jTextField1.getText()+"' turn");
            
        }
    }














}
