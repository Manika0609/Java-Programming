import java.util.Scanner;  
import java.util.Calendar;
public class date 
{  
public static void main(String[] args)   
{  
    int a, days; 
    Scanner scl = new Scanner(System.in);   
    System.out.println("Enter the date (DD MM YYYY)");  
    a = scl.nextInt(); 
    long seconds = a.getTime().getTime();
    LocalDateTime now = LocalDateTime.now(ZoneOffset.UTC);
LocalDateTime then = LocalDateTime.of(1970, Month.JANUARY, 1, 0, 0);

Duration duration = Duration.between(then, now);
System.out.println(duration.toDays());
    System.out.println("Number of days "+days);
    
}
}