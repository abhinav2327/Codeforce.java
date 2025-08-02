import java.util.*;
public class candiesandtwosisters {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n>0)
        {
           int a=sc.nextInt();
           if((a&1)==0)
           {
            int ans=(a/2)-1;
            System.out.println(+ans);
           }
           else
           {
             int ans=(a/2);
             System.out.println(+ans);
           }
           n--;
        }
    }
}
