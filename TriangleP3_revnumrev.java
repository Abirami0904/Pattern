import java.util.Scanner;
public class TriangleP3_revnumrev {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        for(int i=1;i<=n;++i){
            for(int j=0;j<=n-i;++j){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
