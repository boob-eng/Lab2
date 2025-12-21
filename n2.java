import java.io.PrintStream;
import java.util.Scanner;
public class n2
{
    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;
    public static void main(String[] args)
    {
        int n=in.nextInt();
        int a=0;
        int b=1;
        for (int i=0;i<n;i++){
            a+=b;
            b*=3;
        }
        out.println(a);
    }
}
