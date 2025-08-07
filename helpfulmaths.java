import java.util.*;
public class helpfulmaths {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
       if(s.length()==1)
       {
        System.out.println(s);
        return;
       }
       int one=0;
       int two=0;
       int three=0;
       for(int i=0;i<s.length();i++)
       {
        char c=s.charAt(i);
        if(c=='1')one++;
        if(c=='2')two++;
        if(c=='3')three++;
        
       }
       char[] arr=new char[s.length()];
        int plus=one+two+three-1;
        int j=1;
        while(plus>0)
        {
           arr[j]='+';
           j+=2;
           plus--;
        }
        int k=0;
        while(one>0)
        {
            arr[k]='1';
            k=k+2;
            one--;
        }
        int l=k;
        while(two>0)
        {
            arr[l]='2';
            l=l+2;
            two--;
        }
        int m=l;
        while(three>0)
        {
            arr[m]='3';
            m=m+2;
            three--;
        }
        String str=new String(arr);
        System.out.println(str);

    }
}
