import java.util.Scanner;
public class Pattern5_center0 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s=in.nextLine();
        int n=Integer.parseInt(s);
        for(int i=0;i<n;++i){
            for(int j=0;j<n;++j){
                System.out.print((i==j&&i==n/2?"0":"1"));
            }
            System.out.println();
        }
    }
}
