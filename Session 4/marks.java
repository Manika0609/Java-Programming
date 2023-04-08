import java.util.Scanner;

public class marks 
{
    public static void main(String args[])
    {
        int size;
        Scanner sc=new Scanner(System.in);  
        System.out.print("Enter marks of 10 students: ");   
        int[] array = new int[10];
        size=array.length;    
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
            if(array[i]>55)
            {
                System.out.print(" "+array[i]+ " "+"Merit\n");
            }
            else if(array[i]<55 && array[i]>41)
            {
                System.out.print(" "+array[i]+ " "+"Pass\n");
            }
            else 
            {
                System.out.print(" "+array[i]+ " "+"Fail\n");
            }

        }
    }  
}
