import java.util.Scanner;
public class integer 
{
    public static void main(String arg[]) 
    {
        int sum = 0;
        for (int i = 41; i < 250; i++) 
        {
            if (i % 5 == 0) 
            {
                System.out.println(i);
                sum = sum + i;
            }
        }
        System.out.println("the sum of intergers is \n" + sum);
    }
}
