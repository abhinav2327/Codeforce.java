import java.util.*;
public class boyorgirl {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        HashSet<Character> hs=new HashSet<>();
        for(int i=0;i<s.length();i++)
        {
            hs.add(s.charAt(i));
        }
        int a=hs.size();
        if(a%2!=0)
        {
            System.out.println("IGNORE HIM!");
            
        }
        else
        {
            System.out.println("CHAT WITH HER!");
        }
        
    }
}
