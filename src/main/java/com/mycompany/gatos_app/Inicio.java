/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gatos_app;

import javax.swing.JOptionPane;

/**
 *
 * @author carlos
 */
public class Inicio {
    public static void main(String[] args){
        
        int opcion_menu = -1;
        String[] botones = {" 1. ver gatos", "2. salir"};
        
        do{
            //Menu principal
            String opcion = (String) JOptionPane.showInputDialog(null, "Gatitos java", "Menu principal", JOptionPane.INFORMATION_MESSAGE,
                    null, botones, botones[0]);
            //Validamos que opción selecciona el usuario
            for(int i=0; i<botones.length; i++){
                if(opcion.equals(botones[i])){
                    opcion_menu = i;
                }
            }
            switch(opcion_menu){
                case 0:
                    GatosService.verGatos();
                    break;
                default:
                break;
                
            }
        }while(opcion_menu!=1);
    }
    
}
