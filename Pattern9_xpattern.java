import java.util.Scanner;

public class Pattern9_xpattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s= in.nextLine();
        int n=Integer.parseInt(s);
        for(int i=0;i<n;++i){
            for(int j=0;j<n;++j){
                System.out.print((i==0||j==0||i==n-1||j==n-1)&&i!=j&&i+j!=n-1?"1":"0");
            }
            System.out.println();
        }
    }
}
