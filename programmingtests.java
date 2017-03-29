/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student
 */
public class programmingtests {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        fizzBuzz2(1,100);
    }
    
    
    public static void variableSwitch(float a, float b){
        a = a + b;
        System.out.println("value in a is: " + a);
        b = a - b;
        System.out.println("value in b is: " + b);
        a = a- b;
        System.out.println("value in a is: " + a);
    }
    
    public static void fizzBuzz2(int startNumber, int endNumber){
        boolean mult3;  //current number = multiple of 3
        boolean mult5;  //current number = multiple of 5
        for(int i = startNumber; i <= endNumber; i++) {
            if(i % 15 == 0){   //if it is a multiple of both
                System.out.println("FizzBuzz");
            }
            else if(i % 3 == 0){
                System.out.println("Fizz");
            }
            else if(i % 5 == 0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(i);
            }
        }
    }
}
