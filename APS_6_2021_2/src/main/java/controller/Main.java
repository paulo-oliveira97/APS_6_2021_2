/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controller;

import view.AcessoPublico.AcessoPublicoDataScreen;
import view.AcessoDiretores.AcessoDiretoresDataScreen;
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
        //AcessoPublicoDataScreen screen = new AcessoPublicoDataScreen();
        AcessoDiretoresDataScreen screen = new AcessoDiretoresDataScreen();
        //AuthScreen screen = new AuthScreen();
        screen.setVisible(true);
        
    }
    
}
