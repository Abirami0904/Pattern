import java.util.Scanner;

public class Hackerrank_Stringpatt {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        // int n=in.nextInt();
        String str=in.nextLine();
        int n=str.length();
//        n=n%2==0?n:n+1;
        int len=n%2==0?n/2:n/2+1;
        for(int i=0;i<n;++i){
            //int ind=0;
            for(int sp=0;sp<i;++sp){
                System.out.print(" ");
            }
            for(int j=0;j<n-i;++j){
                if(j+n/2<n){
                    System.out.print(str.charAt(j+(n/2)));
                }
                else{
                    System.out.print(str.charAt(j-n/2));
                }
            }
            System.out.println();
        }
    }
}
