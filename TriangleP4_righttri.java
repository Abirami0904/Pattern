import java.util.Scanner;

public class TriangleP4_righttri {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j <= i; ++j) {
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
}