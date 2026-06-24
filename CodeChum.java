// Lesson 2 topic 2

//lesson 2 

//item 1 Triangle Area Calculation

import java.util.Scanner;

public class getCalculation{
    
    // gama una ug function nga mo kalkyulit sa triangol
    
  
    
    public static void getCalculation(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the base of the triangle: ");
        double base = sc.nextDouble();
        
        System.out.print("Enter the height of the triangle: ");
        double height = sc.nextDouble();
        
        double result = (base * height) / 2.0;
        
        System.out.printf("Result: %.2f" , result);
        
    }
    
    public static void main(String[] args){
        getCalculation();
    }
    
}

//item 2 Display Message Function

  public class Main{
    
    public static void display(){
        
        System.out.print("I love programming");
        
        
    }
    
    public static void main(String[] args){
        display();
    }
    
}


//item 3 Pass or Fail

import java.util.Scanner;


public class Main{
     static void printFail(){
        //sir wana tuyo control z 
        System.out.print("Fail");
       
    }
    
     static void printPass(){
        
       
            System.out.println("Pass");
    
    } 
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the grade (between 0 and 100): ");
        int grado = sc.nextInt();
        
        if(grado >= 60){
            printPass();
        }else{
            printFail();
        }
        
    }
    
    
}


