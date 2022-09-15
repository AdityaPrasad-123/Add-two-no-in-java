import java.util.Scanner;
public class Addition_input 
{
    public static void main(String args[])
    {
      int a,b,c;
      System.out.println("enter your two no");
      Scanner s=new Scanner(System.in);
      a=s.nextInt();
      b=s.nextInt();
      c=a+b;
      s.close();
      System.out.println(c);
      
    }
    
}
