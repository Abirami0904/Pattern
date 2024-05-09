import java.util.Scanner;

public class Newpatt1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int ans=((n*(n-1))/2);
        for(int i=0;i<n;++i){
            System.out.print(++ans+" ");
        }
    }
}
