import java.util.Scanner;

public class Trianglepatt10_repeati {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt(),ans=0;//num=n%2==0?n-1:n;
        for(int i=0;i<n;++i){
            ans=i<n/2+1?ans+1:ans-1;
            ans=n%2==0&&i==n/2?n/2:ans;
            for(int j=0;j<=i;++j){
                System.out.print(ans);
            }
            System.out.println();
        }
    }
}
