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
public class run {
    public static void main(String [] args) {
        pekerja p = new pekerja ("misterA", 9);
        pekerja p1 = new pekerja ("misterB", 1);
        SoftwareEngineering s = new SoftwareEngineering ("ando", 3);
        SoftwareEngineering s1 = new SoftwareEngineering ("ganang", 14);
        ProjectManager m = new ProjectManager ("nyoman", 7);
        ProjectManager m1 = new ProjectManager ("yoga", 12);
    
        System.out.println("Total gaji" + p.getname() + " : " + p.getgajipokok());
         System.out.println("Total gaji" + p1.getname() + " : " + p1.getgajipokok());
         System.out.println("Total gaji" + s.getname() + " : " + s.getgajipokok());
          System.out.println("Total gaji" + s1.getname() + " : " + s1.getgajipokok());
           System.out.println("Total gaji" + m.getname() + " : " + m.getgajipokok());
            System.out.println("Total gaji" + m1.getname() + " : " + m1.getgajipokok());
            
    }
    
}
