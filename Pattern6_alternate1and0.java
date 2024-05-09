import java.util.Scanner;

public class Pattern6_alternate1and0 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s=in.nextLine();
        int n=Integer.parseInt(s);
        for(int i=0;i<n;++i){
            int print=(i+1)%2;
            for(int j=0;j<n;++j){
                System.out.print(print);
                print=1-print;
            }
            System.out.println();
        }
    }
}
