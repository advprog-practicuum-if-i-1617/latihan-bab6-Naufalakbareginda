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
public class ProjectManager extends pekerja {
private double tunjangan = 6000000;
private double bonus =  4500000;
 public ProjectManager(String name, double gajipokok, double bonus, int masakerja) {
        super(name, gajipokok, bonus, masakerja);
}

    

    @Override
    public double getbonus(){
        return super.getbonus() + this.bonus;
}
    @Override
    public double getgajipokok() {
        if (masakerja>= 10 ) {
            return super.getgajipokok() + this.tunjangan + 700000;
            
        }else{
            return super.getgajipokok() + this.tunjangan + 225000;
        }
    }
    
}
