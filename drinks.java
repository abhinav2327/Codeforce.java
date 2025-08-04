import java.util.*;
public class drinks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        double[] arr=new double[a];
        for(int i=0;i<a;i++)
        {
            arr[i]=sc.nextDouble();
        }
        double sum=0.0;
        for(int i=0;i<a;i++)
        {
            sum+=arr[i];
        }
        double ans=sum/a;
        System.out.println(ans);


    }
}
