import java.io.PrintStream;
import java.util.Scanner;
public class n3
{
    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;
    public static void main(String[] args)
    {
        int p =in.nextInt();
        int g=in.nextInt();
        int m=in.nextInt();
        int Cap=in.nextInt();
        int y=0;
        boolean boo =true;
        while (boo){
            int prevP= p;
            int increase=(p*g)/100;
            p=p+increase+m;
            if (p>Cap) {
                p=Cap;
                y++;
                break;
            }
            if (p<=prevP){
                p=prevP;
                boo =false;
            }else{
                y++;
            }
        }
        out.println(y);
        out.println(p);
    }
}
