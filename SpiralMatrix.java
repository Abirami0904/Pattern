import java.util.*;
public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; ++i)
        {
            for(int j = 0; j < n; ++j)
            {
                arr[i][j] = in.nextInt();
            }
        }
        int start = 0, end = n-1;
        for(int i = start; i <= end; ++i)
        {
            for(int j = start; j < end; ++j)
            {
                System.out.print(arr[start][j]+" ");
            }
            for(int j = start; j < end; ++j)
            {
                System.out.print(arr[j][end]+" ");
            }
            for(int j = end; j > start; --j)
            {
                System.out.print(arr[end][j]+" ");
            }
            for(int j = end; j > start; --j)
            {
                System.out.print(arr[j][start]+" ");
            }
            //System.out.println();
            ++start; --end;
        }
    }
}
