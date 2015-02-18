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
public class Skrinky {
    
    public int pocet;
    public Skrinka skrinka;
    public Skrinka[] pole;;
   
    public Skrinky(int paPocet){
      pocet=paPocet; 
      pole=new Skrinka[pocet];
      
        for (int i = 0; i < pocet; i++) {
            pole[i]=new Skrinka();
        }
    
    }
    
    public Skrinka getSkrinka(int paIndex){
        return pole[paIndex];
    }

    @Override
    public String toString() {
        String vypis="";
        for (int i = 0; i < pocet; i++) {
            vypis+=i+" "+pole[i].toString()+"\n";
        }
        return  vypis;
                
    }
            
    
}
