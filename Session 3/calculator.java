import java.util.Scanner;  
public class calculator 
{  
    public static void main(String[] args)   
    {  
        int num1, num2, c,ans;  
        Scanner scl = new Scanner(System.in);   
        System.out.println("Enter the first number:");  
        num1 = scl.nextInt();  
        System.out.println("Enter the second number:");     
        num2 = scl.nextInt(); 
        System.out.println("1. ADD \n 2. SUBTRACT \n 3.MULTIPLY \n 4. DIVIDE");
        c=scl.nextInt();
        switch(c){
        case 1:
        {
            ans=num1+num2;
            System.out.println("Sum of "+num1+" and "+num2+" is "+ans);
            break;
        }
        case 2:
        {
            ans=num1-num2;
            System.out.println("difference of "+num1+" and "+num2+" is "+ans);
            break;
        }case 3:
        {
            ans=num1*num2;
            System.out.println("multiplication of "+num1+" and "+num2+" is "+ans);
            break;
        }case 4:
        {
            ans=num1%num2;
            System.out.println("division of "+num1+" and "+num2+" is "+ans);
            break;
        }
        default:
        System.out.println("ENTERED WRONG CHOICE!!!!");
    }

} 
}