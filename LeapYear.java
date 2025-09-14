class LeapYear
{
 public static void main(String [] args)
 {
   int yr = 2100;
   boolean op = (yr%400==0 || yr%100!=0) && yr%4==0;

   System.out.println(yr+":" op);
   System.out.println(yr%100);
  }

}