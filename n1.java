import java.io.PrintStream;
import java.util.Scanner;
public class Dis
{
    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;
    public static int Sum(int a)
    {
        int s=0;
        while (a>0){
            s+=a%10;
            a/=10;
        }
        return s;
    }
    public static void main(String[] args)
    {
        int a0=Math.abs(in.nextInt());
        int n=in.nextInt();
        for (int i=0;i<n;i++){
            a0=2*Sum(a0);
            out.print(a0);
            if (i<n-1){
                out.print(", ");
            }
        }
    }
}
