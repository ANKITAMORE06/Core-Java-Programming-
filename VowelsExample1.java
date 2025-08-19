class VowelsExample
{
 public static void main(String [] args)
{
 String str = "U";
 char ch = str.toLowerCase().charAt(0);
 boolean op = ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u';
 System.out.println(str+ ":" +op);
 }
}
