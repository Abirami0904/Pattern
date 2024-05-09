import java.util.Scanner;
public class Pattern1_All1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int n = Integer.parseInt(s);
        for(int i=0;i<n;++i){
            for(int j=0;j<n;++j){
                System.out.print("1");
            }
            System.out.println();
        }
    }
}
