import java.util.*;
public class DiamondSpace {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; ++i)
        {
            int lim = i < n/2 ? i : n  - i - 1;
            for(int sp = 0; sp < (n/2)-lim; ++sp)
            {
                System.out.print(" ");
            }
            for(int j = 0; j <= 2*lim; ++j)
            {
                if(j == 0 || j == 2*lim)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
