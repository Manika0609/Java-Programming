import java.util.Scanner;

public class Sorting 
{
    public static void main(String args[])
    {
        int size;
        Scanner sc=new Scanner(System.in);  
        System.out.print("Enter 10 numbers: ");   
        int[] array = new int[10];
        size=array.length;  
        System.out.println("Enter the elements of the array: ");  
        for(int i=1; i<10; i++)  
        {  
            array[i] = sc.nextInt();  
        }  
        for (int i = 0 ;i< size-1; i++)
        {
            int min = i;
            for (int j = i+1; j<size; j++)
            {
                if (array[j] < array[min])
                {
                    min = j;
                }
            }
            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
        for (int i = 0 ;i< size; i++)
        {
          System.out.print(" "+array[i]);
        }
    }  
 }
 
