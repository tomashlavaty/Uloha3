/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uloha3;

/**
 *
 * @author JA
 */
public class Skolnik {
    
    private Skrinka skrinka;
    
    public void zmenStavSkrinky(Skrinka paSkrinka) {
        if (paSkrinka.isOtvorena()) {
            paSkrinka.zatvor();
        } else {
            paSkrinka.otvor();
        }
        
    }
    
}
