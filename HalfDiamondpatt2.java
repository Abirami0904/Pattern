import java.util.Scanner;

public class HalfDiamondpatt2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        for(int i=1;i<2*n;++i){
            int lim=i>n?2*n-i:i;
            int ans=1;
            for(int j=1;j<2*lim;++j){
                System.out.print(ans++);
            }
            System.out.println();
        }
    }
}
