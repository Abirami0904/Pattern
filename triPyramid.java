import java.util.*;
public class triPyramid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; ++i)
        {
            int ans = i;
            for(int sp = 0; sp < n-i-1; ++sp)
            {
                System.out.print(" ");
            }
            for(int j = 0; j <= 2*i; ++j)
            {
                System.out.print(ans);
                ans = j < i ? --ans : ++ans;
            }
            System.out.println();
        }
    }
}
