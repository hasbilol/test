/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3q4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Lab3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> distinctNum = new ArrayList<>();
        
        
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Enter 10 numbers: ");
        for (int i=0; i<10; i++){
        
            int number = sc.nextInt();
            numbers.add(number);
            
            
        }
        
        for (int number : numbers){
        
            if(!distinctNum.contains(number)){
            
                distinctNum.add(number);
            }
           
        }
        
        
        System.out.println("The sorted numbers are: ");
        for(int distinctNumber : distinctNum){
        
            System.out.print(distinctNumber+" ");
        }
        
    }
    
}
