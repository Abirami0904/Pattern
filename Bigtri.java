import java.util.*;
public class Bigtri {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; ++i)
        {
            int lim = i < n/2 ? i : n-i-1;
            int space = i <= n/2 ? i : (n-i-1);
            for(int j = 0; j < ((n+1)/2) - lim; ++j)
            {
                System.out.print("*");
            }
            for(int sp = 0; sp < 2*space; ++sp)
            {
                System.out.print(" ");
            }
            for(int j = 0; j < ((n+1)/2) - lim; ++j)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
