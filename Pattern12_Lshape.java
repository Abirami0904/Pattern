import java.util.Scanner;

public class Pattern12_Lshape {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        for(int i=0;i<n;++i){
            int ans=n;
            for(int j=0;j<n;++j){
                if(j<i){
                    System.out.print((ans--));
                }
                else{
                    System.out.print(ans);
                }
            }
            System.out.println();
        }
    }
}
