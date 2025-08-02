import java.util.*;
public class watermelon4A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a==2)
        {
            System.out.println("NO");
        }
        
        if(a%2==0 && a!=2)
        {
            System.out.println("YES");
        }
        else if(a!=2)
        {
            System.out.println("NO");
        }

    }
}
