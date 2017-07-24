/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalbuild;

//import finalbuild.Online.OMenu1;
//import finalbuild.Online.OMenu2;
import finalbuild.Online.chat_client;
import finalbuild.Online.chat_server;
import finalbuild.Online.connect;
import finalbuild.Online.host;
import finalbuild.Online.omenu;
import finalbuild.SinglePlay.Easyboard;
import finalbuild.SinglePlay.Hardboard;
import finalbuild.SinglePlay.Intermediateboard;
import finalbuild.SinglePlay.Menu;
import finalbuild.Versus.VMenu;
import finalbuild.Versus.versusboard;

/**
 *
 * @author giovannikolo
 */
public class Navigation {
 
 /*
    this first method deals with the main menu game start
    */   
   
public static void mainMenu()
{
    MainMenu mm = new MainMenu();
        mm.setVisible(true);
        mm.dispose();
}

/*
    these methods set the navigation for the the main category menus 
    single play
    versus play
    and online play
    */ 

public static void connect()
{
    connect cn = new connect();
        cn.setVisible(true);
        
       
}

public static void host()
{
    host ht = new host();
        ht.setVisible(true);
        
}

public static void client()
{
    chat_client cc = new chat_client();
    cc.setVisible(true);
}

public static void server()
{
    chat_server cs = new chat_server();
    cs.setVisible(true);
}

public static void omenu()
{
    omenu om = new omenu();
    om.setVisible(true);
}
public static void SinglePlayMenu()
{
    Menu sm = new Menu();
        sm.setVisible(true);
        sm.dispose();
}

public static void VersusMenu()
{
    VMenu vm = new VMenu();
        vm.setVisible(true);
        vm.dispose();
}

/*
these set of methods deal with the navigation of the 
versus category menus 
*/

public static void Easyboard()
{
    Easyboard eb = new Easyboard();
        eb.setVisible(true);
        eb.dispose();
}

public static void Intermediateboard()
{
    Intermediateboard ib = new Intermediateboard();
        ib.setEnabled(true);
        ib.dispose();
}

public static void Hardboard()
{
    Hardboard hb = new Hardboard();
        hb.setVisible(true);
        hb.dispose();
}

/*
these set of methods seals with the versus navigation
*/

public static void VersusBoard()
{
versusboard vpgb = new versusboard();
        vpgb.setVisible(true);
        vpgb.dispose();
}

}
