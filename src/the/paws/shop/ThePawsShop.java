/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package the.paws.shop;

import GUI.LoginFrame;
import GUI.MainFrame;
import GUI.ManagerFrame;
import com.formdev.flatlaf.FlatDarkLaf;

/**
 *
 * @author User
 */
public class ThePawsShop { //ok ok maliya last project

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FlatDarkLaf.setup();
        //MainFrame Splash = new MainFrame();
        //Splash.setVisible(true);
        
        LoginFrame dbcon = new LoginFrame();
        dbcon.setVisible(true);
        //Splash.setVisible(false);
     
//        try {
//        for(int x = 0;x<=100;x++){
//            Thread.sleep(50);
//            Splash.loadingText.setText(Integer.toString(x)+"%");
//            Splash.ProgressBar.setValue(x);
//        }
//        LoginFrame dbcon = new LoginFrame();
//        dbcon.setVisible(true);
//        Splash.setVisible(false);
//     }catch (Exception ex){
//         
//     }
    }
    
}
