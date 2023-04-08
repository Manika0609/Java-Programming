import java.util.Scanner;
public class pattern   
{   
    public static void main(String args[])   
    {   
        int i, j, row=6;   
        for(i=0; i<row; i=i+2)   
        {   
            for(j=0; j<=i; j++)   
            {   
            System.out.print("* ");   
            }   
            System.out.println();   
        }   
    }   
}
