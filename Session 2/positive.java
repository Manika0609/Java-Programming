import java.util.Scanner;
public class positive
{
    public static void main(String[] args) 
    {
        Scanner number = new Scanner(System.in);
        //Scanner num = new Scanner(System.in);
		int a,b;
		System.out.print("Enter starting point");
        a = number.nextInt();
        System.out.print("Enter end point");
		b = number.nextInt();
        int sum = 0;

        for(int i = a; i <= b; ++i)
        {
            if(i>0)
            sum += i;
        }

        System.out.println("Sum = " + sum);
    }
}
