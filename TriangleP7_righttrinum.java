import java.util.Scanner;

public class TriangleP7_righttrinum {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for(int i=0;i<n;++i){
            int ans=n-i;
            for(int j=0;j<=i;++j){
                System.out.print(ans++);
            }
            System.out.println();
        }
    }
}
