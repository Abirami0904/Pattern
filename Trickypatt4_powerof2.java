import java.util.Scanner;

public class Trickypatt4_powerof2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt(),ans=1;
        for(int i=0;i<n;++i){
            for(int j=0;j<(Math.pow(2,i));++j){
                System.out.print(ans);
                ans=ans==9?1:++ans;
            }
            System.out.println();
        }
    }
}
