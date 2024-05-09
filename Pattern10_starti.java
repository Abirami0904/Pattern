import java.util.Scanner;
public class Pattern10_starti {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        for(int i=0;i<n;++i){
            int cnt=i+1;
            for(int j=0;j<n;++j){
                System.out.print(cnt+" ");
                ++cnt;
            }
            System.out.println();
        }
    }
}
