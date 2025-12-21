import java.io.PrintStream;
import java.util.Scanner;
public class n4
{
    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;
    public static void main(String[] args)
    {
        int n=in.nextInt();
        if (n<10){
            out.println("NO");
        }else {
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }
            int[] dss = new int[101];
            for (int i = 0; i < n; i++) {
                dss[arr[i]]++;
            }
            boolean boo = false;
            for (int j = 10; j <= 100; j++) {
                if (dss[j] == j) {
                    out.print(j + " ");
                    boo = true;
                }
            }
            if (!boo) {
                out.println("NO");
            }
        }
    }
}
