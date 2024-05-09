import java.util.Scanner;
public class Pattern15_rotateincdec {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        for(int i=0;i<n;++i){
            int print=i+1,after1=2;
            for(int j=0;j<n;++j){
                if(print>=1){
                    System.out.print(print--);
                }
                else{
                    System.out.print(after1++);
                }
            }
            System.out.println();
        }
    }
}
