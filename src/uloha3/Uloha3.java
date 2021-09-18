/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uloha3;

import java.util.ArrayList;

/**
 *
 * @author JA
 */
public class Uloha3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Skrinky skrinky=new Skrinky(100);
         
     
        int dlzkaKroku = 1;//master

        do {
            for (int i = 0; i < skrinky.pocet; i += dlzkaKroku) {
                if (skrinky.getSkrinka(i).isOtvorena()) {
                    skrinky.getSkrinka(i).zatvor();
                } else {
                    skrinky.getSkrinka(i).otvor();
                }
            }
            dlzkaKroku++;

        } while (dlzkaKroku < skrinky.pocet);

       System.out.println(skrinky);  

    }

}
