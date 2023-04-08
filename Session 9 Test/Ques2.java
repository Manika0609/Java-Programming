import java.text.DecimalFormat;
class sunlight {
    public static void main(String[] args)
    {
        double kmFromSun=150000000;
        double lightSpeed =299792458;
        double mFromSun=kmFromSun*1000;
        double seconds=mFromSun/lightSpeed;
        System.out.print("light will use "+seconds);
        //printTime(seconds);
        System.out.println(" to travel from sun to the earth");
        printTime(seconds);

    }
    public static void printTime(Double sec){
        double min=sec/60;
        sec=sec%60;
        DecimalFormat df= new DecimalFormat("#.##");
        //sec=sec-(min*60);
        System.out.println(df.format(min)+" minutes and "+df.format(sec)+" seconds "); 
    }
}