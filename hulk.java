import java.util.*;
public class hulk {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        if(n==1)
        {
            System.out.println("I hate it");
            return ;
        }
        if(n==3)
        {
            System.out.println("I hate that I love that I hate it");
            return;
        }
        if((n&1)==0)
        {
            StringBuffer sb=new StringBuffer();
           for(int i=0;i<n/2-1;i++)
           {
            sb.append("I hate that");
            sb.append(" ");
            sb.append("I love that");
            sb.append(" ");
           }
           
           sb.append("I hate that");
           sb.append(" ");
           sb.append("I love it");
           System.out.println(sb);
           return;
        }
        else
        {
            StringBuffer sb1=new StringBuffer();
            for(int i=0;i<n/2;i++)
            {
              sb1.append("I hate that");
              sb1.append(" ");
              sb1.append("I love that");
              sb1.append(" "); 
            }
            sb1.append("I hate it");
            System.out.println(sb1);
        }
        
        
    }
}
