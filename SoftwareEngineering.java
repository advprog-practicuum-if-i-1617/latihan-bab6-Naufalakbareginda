/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication76;

/**
 *
 * @author Eginda
 */
public class SoftwareEngineering extends pekerja  {
    private double tunjangan = 5500000;
   private double bonus = 300000;
     public SoftwareEngineering(String name, double gajipokok, double bonus, int masakerja) {
        super(name, gajipokok, bonus, masakerja);
        
  
    


  
    }
    @Override
    public double getgajipokok() {
        return super.getgajipokok() + this.tunjangan;
    } 
    
    @Override
    public double getbonus(){
        return super.getbonus() + this.bonus;
    }
    
}
