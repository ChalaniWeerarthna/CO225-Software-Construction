/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E15325lab01q2;

/**
 *
 * @author Windows 10
 */
import java.util.Scanner;
public class e15325lab01q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        int comp;    //to store basic complement values
        int diff;    //to hold differnce between orginal and complement
        int count=0;  //as a counter 
        
        int [] colors=new int[3]; //to store orginal
        int [] complement=new int[3];  //to store complement
        
        Scanner s=new Scanner(System.in);   //to get input from user
        System.out.print("Enter the color: ");
        
        
        for(int x=0;x<3;x++){   //to get input from user and store in array colors 
          
            colors[x]=s.nextInt();
       
        }
        
        for(int x=0;x<3;x++){ //to check is differece between  less than 32 or not 
          
           comp=255-colors[x];
           diff=colors[x]-comp;
           
           if(diff<0){
             diff=-1*diff;
           }
           
           if(diff<32){
               count=count+1;
           
           }
        }
        if(count!=0){ //to calculate the complement
            
            for(int x=0;x<3;x++){   //to calculate and store the complement whose difference between orginal and normal complement less than 32 
                if(colors[x]<128){
                   complement[x]=colors[x]+128;
                }else{
                   complement[x]=colors[x]-128;
                }
            }

        }else{     //to calculate and store the complement whose difference between orginal and normal complement greater than or equal 32 
            for(int x=0;x<3;x++){
                 complement[x]=255-colors[x];  
            }
        }
        
        System.out.print("The complement is: ");
        
        for(int x=0;x<3;x++){  //toprint output
               System.out.print(complement[x]+" ");   
        
        }
        
        
        System.out.println();

        
        
        
        
        
        
        
        
        
        
        
    }
    
}
