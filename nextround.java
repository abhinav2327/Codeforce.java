import java.util.*;
public class nextround {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=sc.nextInt();
        int[] arr=new int[n];
        int count=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            
        }
        int b=arr[a-1];
        for(int i=0;i<n;i++)
        {
            if(arr[i]>=b && arr[i]>0)count++;
           
        }
        System.out.println(+count);
        

    }
}
