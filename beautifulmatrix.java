import java.util.*;
public class beautifulmatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[5][5]; 
        int x1=0,y1=0;
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                arr[i][j]=sc.nextInt();
                if(arr[i][j]==1)
                {
                   x1=i+1;
                   y1=j+1;
                }
            }
        }
        
        int ans=Math.abs(3-x1)+Math.abs(3-y1);
        System.out.println(+ans);

    }
}
