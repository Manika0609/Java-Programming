import java.util.Scanner;
public class Pattern {
    public static void main(String[] args)
    {
		Scanner num = new Scanner(System.in);
		int n;
		System.out.print("\nEnter Number of rows: ");
		n = num.nextInt();
        int i,j;
        for(i=1;i<=n;i++)
        {
	        for(j=1;j<=i;j++)
	        System.out.print(j);
            System.out.println("");
        }
    }
}
