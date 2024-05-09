import java.util.*;
public class Spiral_tripatt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int start=0,end=n-1;
        int[][] arr=new int[n][n];
        int ans=1;
        while(start<=end){
            for(int i=start;i<end;++i){
                arr[start][i]=ans++;
            }
            int col=end;
            for(int i=start;i<end;++i){
                arr[i][col--]=ans++;
            }
            for(int i=end;i>start;--i){
                arr[i][start]=ans++;
            }
            ++start;end-=2;
        }
        for(int i=0;i<n;++i){
            for(int j=0;j<n-i;++j){
                System.out.printf("%-3d",arr[i][j]);
            }
            System.out.println();
        }
    }
}
