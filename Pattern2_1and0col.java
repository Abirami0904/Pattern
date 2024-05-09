import java.util.Scanner;
public class Pattern2_1and0col {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int n= Integer.parseInt(s);
        for(int i=0;i<n;++i){
            int print=0;
            for(int j=0;j<n;++j){
                System.out.print(print);
                print=1-print;
            }
            System.out.println();
        }
    }
}
