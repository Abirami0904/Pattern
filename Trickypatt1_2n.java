import java.util.Scanner;

public class Trickypatt1_2n {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        for(int i=1;i<=n;++i){
            int ans=1;
            for(int j=0;j<2*i-1;++j){
                System.out.print(ans++);
            }
            System.out.println();
        }
    }
}
