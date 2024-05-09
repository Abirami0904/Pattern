import java.util.Scanner;

public class Tricky2patt2_oddeven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        for(int i=0;i<n;++i){
            int ans=(i+1)%2==0?2:(i+1)%2;
            for(int j=0;j<=i;++j){
                System.out.print(ans);
                ans+=2;
            }
            System.out.println();
        }
    }
}
