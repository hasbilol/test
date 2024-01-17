
package lab1q1;

import org.w3c.dom.ls.LSOutput;

/**
 *
 * @author User
 */



public class Fan {
public static final int SLOW =1, MEDIUM = 2, FAST= 3;
    private int speed;
    private boolean on;
    private double radius;
    String color;
    
    public Fan(){
    
        speed = 1;
        on= false;
        radius = 5;
        color = "blue";
        
    }
    
    int getSpeed (){
    
        return speed;
    }
    
    void setSpeed (int speed){
    
        this.speed= speed;
    }
    
    boolean getOn (){
    
        return on;
    }
    
   void setOn(boolean on){
    
        this.on= on;
    }
    
    double getRadius (){
    
        return radius;
    }
    
    void setRadius ( double radius){
    
        this.radius = radius;
        
    }
    String getColor (){
    
    
        return color;
    }
    
    void setColor (String color){
    
        this.color= color;
    }
    
    public String toString (){
    
        if (on){
        return "Speed: "+ speed+ " Color: "+ color+ " Radius: "+ radius; 
        }
        else {
        return "Color: "+ color+ " Radius: "+ radius+ " The fan is off";
        }
    }
  
    public static void main(String[] args) {
        // TODO code application logic here
        Fan fan1 = new Fan();
        fan1.setSpeed(FAST);
        fan1.setRadius(10.0);
        fan1.setColor("yellow");
        fan1.setOn(true);

        Fan fan2 = new Fan();
        fan2.setSpeed(MEDIUM);
        fan2.setRadius(5.0);
        fan2.setColor("blue");
        fan2.setOn(false);

        Fan fan3 = new Fan();
        fan2.setSpeed(SLOW);
        fan2.setRadius(5.0);
        fan2.setColor("blue");
        fan2.setOn(true);

        System.out.println("Fan 1: " + fan1.toString());
        System.out.println("Fan 2: " + fan2.toString());
        System.out.println("Fan 2: " + fan3.toString());
    }

    
}
