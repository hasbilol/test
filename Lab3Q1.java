/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3q1;

/**
 *
 * @author User
 */
 class GeometricObject{
    
         String color;
         boolean filled;
        
        public GeometricObject(){
        
            color = "red";
            filled = true;
            
        }
        
        public GeometricObject (String color, boolean filled){
        
            this.color = color;
            this.filled = filled;
        }
        
        public String getColor(){
        
            return color;
        }
        
        public void setColor(String color){
        
            this.color=color;
        }
        
        public boolean getFilled(){
        
            return filled;
        }
        
        public void setFilled(boolean filled){
        
            this.filled=filled;
        }
        
        public String toString(){
        
            return "color: "+color + " filled: "+filled;
        }
    }
    
    class Circle extends GeometricObject{
    
        private double radius;
        
        public Circle(){
        
            radius = 1;
        }
        
        public Circle (double radius){this.radius=radius;}
        
        public Circle (double radius, String color, boolean filled){
        
            this.radius=radius;
            this.color= color;
            this.filled=filled;
        }
        
        public double getRadius(){
        
            return radius;
        }
        
        public void setRadius(){
        
            this.radius=radius;
        }
        
        @Override
        public String toString(){
        
            return "radius: "+radius+ " color: "+color + " filled: "+filled;
        }
    }

class Rectangle extends GeometricObject {


    private double height;
    private double width;
    
    public Rectangle(){
    
        height = 1;
        width = 1;
    }
    
    public Rectangle (double height, double width){
    
        this.height=height;
        this.width= width;
    }
    
    public Rectangle (double height, double width, String color, boolean filled){
    
        this.height=height;
        this.width=width;
        this.color = color;
        this.filled = filled;
    }
    
    public double height (){
    
        return height;
    }
    
    public void height(double height){
    
        this.height=height;
        
    }
    
    public double width(){
    
        return width;
    }
    
    public void width(double width){
    
        this.width=width;
    }
}

public class Lab3Q1 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        
        GeometricObject obj1 = new GeometricObject();
        Circle c1 = new Circle();
        Circle c2 = new Circle(9,"black", false);
        Rectangle r1= new Rectangle();
        
        System.out.println(obj1);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(r1);
    }
    
}
