public class date
{

 public static void main(String args[])
 {
 int d = Integer.parseInt(args[0]);
 int m = Integer.parseInt(args[1]);
 int y = Integer.parseInt(args[2]);
 int monthDays[] = {31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334,
365};
 int dyear = y - 1970;
 int x, num = 0;

 for(x = 1970; x<=y; x++)
 {
 if(x%4 == 0 && x%400 == 0 && x%100 != 0){
 num++;
 }
 }
 int days;
 days = dyear*365 + monthDays[m-2] + d + num;
 System.out.println("Total days = " + days);
 }
}
