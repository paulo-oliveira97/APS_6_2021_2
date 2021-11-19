/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controller;

import view.DataTableScreen;
import view.AuthScreen;

/**
 *
 * @author paulo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //DataTableScreen dataSelectionScreen = new DataTableScreen();
        AuthScreen authScreen = new AuthScreen();
        //dataSelectionScreen.setVisible(true);
        authScreen.setVisible(true);
    }
    
}
