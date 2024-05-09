import java.util.Scanner;
public class Pattern11_numspace {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int printnum=1;
        for(int i=0;i<n;++i){
            for(int j=0;j<n;++j){
                System.out.printf("%3d ",printnum++);
            }
            System.out.println();
        }
    }
}
