import java.util.Scanner;

public class combination
{
    public static void main(String[] args)
    {
        int a, b, c;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first digit: ");
        a = s.nextInt();
        System.out.print("Enter the second digit: ");
        b = s.nextInt();
        System.out.print("Enter the third digit: ");
        c = s.nextInt();
        int[] ar = { a, b, c };
        for (int x = 0; x < 3; x++)
        {
            for (int y = 0; y < 3; y++)
            {
                for (int z = 0; z < 3; z++)
                {
                    if (x != y && y != z && z != x)
                    {
                        System.out.println(ar[x] + "" + ar[y] + "" + ar[z]);
                    }
                }
            }
        }
    }
}