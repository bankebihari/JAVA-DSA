import java.util.*;
public class sieveofErathenes {

    public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean []isprime=new isprime[n];
        for(int i=2;i<n;i++){
            isprime[i]=true;

        }

        for(int p=2;p*p<=n;p++){
            if(isprime[p]){
                for(int i=p*p;i<=n;i=i+p){
                    isprime[i]=false;

                }
            }
        }
        
    }
}
