import java.util.Scanner;
class week
{
    public static void main(String[] args)
    {
        Scanner day = new Scanner(System.in);
        int n;
        System.out.print("\n Enter an integer ");
        n = day.nextInt();
        switch(n)
        {
            case 1:
                    System.out.print("\nMonday");
                    break;
            case 2:
                    System.out.print("\nTuesday");
                    break;
            case 3:
                    System.out.print("\nWednesday");
                    break;
            case 4:
                    System.out.print("\nThursday");
                    break;
            case 5:
                    System.out.print("\nFriday");
                    break;
            case 6:
                    System.out.print("\nSaturday");
                    break;
            case 7:
                    System.out.print("\nSunday");
                    break;
            default:
                    System.out.print("\nIt is not a weekday\n");
                    break;
        }
    }
}
