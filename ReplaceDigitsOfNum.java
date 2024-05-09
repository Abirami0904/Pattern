import java.util.Scanner;

public class ReplaceDigitsOfNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("num:");
        int n = in.nextInt();
        System.out.print("dig1,dig2:");
        int dig1 = in.nextInt(), dig2 = in.nextInt();
        int add = dig2 - dig1;
        int div = 1;
        int cnt = (int)Math.log10(n)+1;
        //System.out.println(n+" "+dig1+" "+dig2+" "+add+" "+div+" "+cnt);
        while(cnt > 0)
        {
            --cnt;
            if(((n/div)%10) == dig1)
            {
                n = n + (div * add);
            }
            div *= 10;
            //System.out.println(n+" "+div+" "+cnt);
        }
        System.out.println(n);
    }
}
