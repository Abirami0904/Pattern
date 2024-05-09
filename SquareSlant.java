import java.util.*;
public class SquareSlant {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; ++i)
        {
            for(int sp = 0; sp < n-i-1; ++sp)
            {
                System.out.print(" ");
            }
            for(int j = 0; j < n; ++j)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
