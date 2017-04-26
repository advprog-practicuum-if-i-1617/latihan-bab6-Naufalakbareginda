/*
 * To change this   license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication76;
import java.util.*;
/**
 *
 * @author Eginda
 */
public class pekerja {
     private String name;
    private double bonus;
   private double gajipokok = 25000000;
   int masakerja;
  
   
   public pekerja (String name, double gajipokok, double bonus, int masakerja){
       this.name=name;
       this.gajipokok= gajipokok;
       
   

    
    }
   public String getname(){
       return name;
       
   }
   public void setbonus (int masakerja){
       if (masakerja > 5){
           this.bonus = 2500000;
           
       } 
       else{
           this.bonus = 0;
       }
       
   }
   public double getbonus(){
       return bonus;
   }
   public double getgajipokok(){
       return gajipokok;
   }
   public double gettotalgaji(){
       return gajipokok + bonus;
   }
   
   
}
