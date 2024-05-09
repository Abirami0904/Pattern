import java.util.Scanner;

public class HalfDiamondpatt4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        System.out.println("*");
        for(int i=1;i<2*n;++i){
            int lim=i>n?2*n-i:i;
            int ans=1;
            System.out.print("*");
            for(int j=1;j<2*lim;++j){
                System.out.print(ans);
                ans=j<lim?ans+1:ans-1;
            }
            System.out.println("*");
        }
        System.out.println("*");
    }
}
