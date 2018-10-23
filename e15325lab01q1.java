/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E15325lab01q1;
import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class e15325lab01q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        
        boolean weird=false ;
        boolean scary=false;
        boolean special=false;
        boolean big=false;
        boolean both=false;
        
        Scanner s =new Scanner(System.in);  //to get user inputs
      
        int num =s.nextInt();   //to get integer from user

        if(num%18 !=0){   //to check does number weird or not
            if(num%6 ==0){
               if(num%5 ==0){
                  weird=true;

               }
            }

        }
        if(num>990){    //to check does number big or not
            big=true;

        }
        if( big|weird){    //to check does number scary or not
             scary=true;

        }
        
        if(big & weird){  //to check does number weird and big
             both=true;
        
        }
        if(num%15 ==0){   //to check does number special or not
           special=true;

        }
        if(special){
            if(scary){
               if(both){
                  System.out.println(num+" is special, big, weird,  scary."); 
               }else if(weird){
                  System.out.println(num+" is special, weird, scary, but not big.");
               }else {
                  System.out.println(num+" is special, big, scary, but not weird.");
               }
              
            }else{

                System.out.println(num+" is special, but not scary.");
            }

            
        }else{
            if(scary){

                if(weird){
                   System.out.println(num+" is weird, scary, but not big.");
                }else{
                   System.out.println(num+" is big, scary, but not weird.");
                }
             }

        }

        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
