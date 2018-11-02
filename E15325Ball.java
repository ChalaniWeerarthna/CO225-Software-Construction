
package e15325ball;

import static java.lang.Math.cos;  //to import cos and sin 
import static java.lang.Math.sin;

class Ball{
    
    
    double x ; //to define global variables
    double y ;
    double speed ;
    double angleOfSpeedWithX ;
     
    static double currentTime =0.0;
    double time;
    
    
     Ball(double x, double y, double speed, double angleOfSpeedWithX) { // create a ball constructor to define instance variables
          this.x =x;
          this.y =y;
          this.speed = speed;
          this.angleOfSpeedWithX = (angleOfSpeedWithX * 3.14)/180;
          time = currentTime;
     
     }
    
    static void updateTime(double time){  //to update time
        
        currentTime = currentTime + time; //runtime of ball which is starded early
       
         
        
    }
    
    boolean willCollide(Ball b){

    
       double position_x_2 = this.x +(this.speed * cos(this.angleOfSpeedWithX))*(currentTime - this.time);
       double position_y_2 = this.y +(this.speed * sin(this.angleOfSpeedWithX))*(currentTime - this.time);
       double position_x_1 = b.x+(b.speed * cos(b.angleOfSpeedWithX))*(currentTime - b.time);
       double position_y_1 = b.y+(b.speed * sin(b.angleOfSpeedWithX))*(currentTime - b.time);
        
       if( ( position_x_2 == position_x_1) && (position_y_2 == position_y_1)){  //to check positions of balls equalor not
           return true;
             
           
       }else{
           return false;
       
       }
       
    }
    
    
}




public class E15325Ball {

    
    public static void main(String[] args) {
        
         Ball b1= new Ball(0.0, 1.0, 10.0, 45); // to create b1 ball object
         Ball.updateTime(5.0);                  // to call the function updateTime
         Ball b2= new Ball(0.0, 1.0, 20.0, 45); // to create b2 ball object
         Ball.updateTime(5.0);                  //to call the function updateTime
         
        if(b2.willCollide(b1)){             //to print b1 and b2 will collide or not
           
             System.out.println("B1 and B2 will collide");
        
        }else{
        
              System.out.println("B1 and B2 won’t collide");
        
        }
           
        Ball b3= new Ball(-10.0, 5.0, 3.0, 30);  // to create b3 ball object
        Ball.updateTime(20.0);                   //to call the function updateTime
       
         
        if(b3.willCollide(b2)){              //to print b2 and b3 will collide or not
         
                System.out.println("B2 and B3 will collide");
         
        }else{
         
              System.out.println("B2 and B3 won’t collide");
         
        }
    }
    
}