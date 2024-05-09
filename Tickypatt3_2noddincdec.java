import java.util.Scanner;

public class Tickypatt3_2noddincdec {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        for(int i=1;i<=n;++i){
            int ans=1;
            for(int j=1;j<2*i;++j){
                System.out.print(ans);
                ans=i>j?ans+2:ans-2;
            }
            System.out.println();
        }
    }
}
