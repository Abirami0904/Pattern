import java.util.Scanner;

public class Newpatt2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int ans;
        if(n%2==1){
            ans=n==1||n==3?n:((n*(n/2))-(n/2-1));
        }
        else{
            ans=((n*n/2)-(n-2));
        }
        for(int i=0;i<n;++i){
            System.out.print(ans+" ");
            ans+=2;
        }
    }
}
