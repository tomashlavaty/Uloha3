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
public class Skrinka {

    private boolean otvorena = true;

    public void zatvor() {
        this.otvorena = false;
    }

    public void otvor() {
        this.otvorena = true;
    }

    public boolean isOtvorena() {
        return otvorena;
    }

    public void setOtvorena(boolean otvorena) {
        this.otvorena = otvorena;
    }

    @Override
    public String toString() {

        return this.otvorena ? "Skrinka je otvorena" : "Skrinka je zatvorena";
    }

}
