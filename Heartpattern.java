import java.util.Scanner;

public class Heartpattern {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n=in.nextInt();
            int num=n/2;
            int cnt=n+n/2;
            //System.out.print(cnt+" "+num);
            for(int i=0;i<=n/4;++i){
                for(int sp=0;sp<(n/4)-i;++sp){
                    System.out.print(" ");
                }
                for(int j=0;j<cnt;++j){
                    if(j<num||j>=n){
                        System.out.print("*");}
                    else{
                        System.out.print(" ");
                    }
                }
                cnt+=2;num+=2;
                System.out.println();
            }
            for(int i=0;i<n;++i){
                for(int sp=0;sp<i;++sp){
                    System.out.print(" ");
                }
                for(int j=0;j<2*(n-i)-1;++j){System.out.print("*");}
                System.out.println();
            }
        }
    }
