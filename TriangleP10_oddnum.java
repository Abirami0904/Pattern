import java.util.Scanner;

public class TriangleP10_oddnum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        for(int i=0;i<n;++i){
            int ans=(i+1)%2==0?i+2:i+1;
            for(int j=0;j<n-i;++j){
                System.out.print(ans);
                ans+=2;
            }
            System.out.println();
        }
    }
}
