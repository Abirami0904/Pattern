import java.util.Scanner;
public class Pattern4_Outer1inner0square {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s= in.nextLine();
        int n=Integer.parseInt(s);
        for(int i=0;i<n;++i){
            for(int j=0;j<n;++j){
                if(i==0||j==0||i==n-1||j==n-1){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
