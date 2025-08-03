import java.util.*;
public class bit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=0;
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++)
        {
            String s=sc.nextLine();
            {
                if(s.contains("+"))
                {
                   a=a+1;
                }
                else
                {
                    a=a-1;
                }
            }

        }
        System.out.println(+a);
    }
}
