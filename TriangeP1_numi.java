import java.util.Scanner;
public class TriangeP1_numi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        for(int i=1;i<=n;++i){
            for(int sp=0;sp<n-i;++sp){
                System.out.print(" ");
            }
            for(int j=0;j<i;++j){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
