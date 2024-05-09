import java.util.Scanner;
public class Pattern16_Snakepattern {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt(),ans=1;
        for(int i=0;i<n;++i){
            for(int j=0;j<n;++j){
                if(i%2==0){
                    System.out.printf("%3d",ans++);
                }
                else{
                    System.out.printf("%3d",ans--);
                }
            }
            ans=i%2==0?ans+n-1:ans+1+n;
            System.out.println();
        }
    }
}
