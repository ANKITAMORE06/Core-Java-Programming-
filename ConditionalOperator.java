class ConditionalOperator
{

 public static void main (String [] args)
 {
 
  int num = new java.util.Scanner(System.in).nextInt();
  String op = num(num%2==0)?(num+" is Even"):(num+" is ODD");
  System.out.println(op);

 }

}



