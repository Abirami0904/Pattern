import java.util.Scanner;

public class TriangleP11_uppertri {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        for(int i=0;i<n;++i){
            int ans=1;
            for(int j=0;j<n-i;++j){
                System.out.print(ans++);
            }
            System.out.println();
        }
    }
}
