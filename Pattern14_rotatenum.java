import java.util.Scanner;

public class Pattern14_rotatenum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        for(int i=0;i<n;++i){
            int start=1,ans=i+1;
            for(int j=0;j<n;++j){
                if(ans==n+1){
                    System.out.print(start++);
                }
                else{
                    System.out.print(ans++);
                }
            }
            System.out.println();
        }
    }
}
