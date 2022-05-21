import java.util.Scanner;
import java.util.ArrayList;

public class CodeForOne{
     static ArrayList<Integer> al=new ArrayList();
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
         
        int a=sc.nextInt();
        
        int f=sc.nextInt();
         int l=sc.nextInt();
       int sum=0;
        codeOne(a);
         for(int i=f-1;i<l;i++){
             sum+=al.get(i);
         }
         System.out.print(sum);
         
    }
    public static int codeOne(int n){
        if(n==0){
            al.add(0);
            return 0;}
        if(n==1){
            al.add(1);
            return 1;}
        return codeOne(n/2)+codeOne(n%2)+codeOne(n/2);
    }
}
