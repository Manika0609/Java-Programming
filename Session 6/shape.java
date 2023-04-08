class Shape  
 {  
      public int length = 10; 
 } 
   
 class Square extends Shape  
 {  
      void area()  
      {    
           int area = length * length;  
           System.out.println("Area of square : "+area);  
      }  
 }  
   
 class Rectangle extends Shape  
 {  
      void area()  
      {    
           int breadth = 4;    
           int area = length * breadth;   
           System.out.println("Area of rectangle : "+area);  
      }  
 }  
   
 class Circle extends Shape  
 {  
      void area()  
      {  
           float area = 3.14f * length * length; 
           System.out.println("Area of circle : "+area);  
      }  
 }  
 class Inherit
 {  
      public static void main(String[] args)  
      {  
           Square sq = new Square();  
           Rectangle rec = new Rectangle();  
           Circle cir = new Circle();  
           sq.area();  
           rec.area();  
           cir.area();  
      }  
 }
