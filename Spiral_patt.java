import java.util.*;
public class Spiral_patt {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int start=0,end=n-1,ans=1;
        int[][] arr=new int[n][n];
        while(start<end){
            for(int i=start;i<end;++i){
                //System.out.print(ans+" ");
                arr[start][i]=ans++;
            }
            //System.out.println();
            for(int i=start;i<end;++i){
                //System.out.print(ans+" ");
                arr[i][end]=ans++;
            }
            //System.out.println();
            for(int i=end;i>start;--i){
                //System.out.print(ans+" ");
                arr[end][i]=ans++;
            }
            //System.out.println();
            for(int i=end;i>start;--i){
                //System.out.print(ans+" ");
                arr[i][start]=ans++;
            }
            ++start;--end;
        }
        if(n%2!=0)arr[start][end]=ans;
        for(int i=0;i<n;++i){
            for(int j=0;j<n;++j){
                System.out.printf("%-3d ",arr[i][j]);
            }
            System.out.println();
        }
    }
}
