
// //selction sort
// import java.util.*;
// public class sorting {
//     int main(String [] args){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int []arr = new int[n];
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
// int min=0;
//         for(int i=0;i<n;i++){
//             if(arr[i]>in)
//         }
//     }
// }


//bubble sort
import java.util.*;
public class Sorting{
        
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int flag=0;
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                    flag=1;

                }
                
            }
            if(flag==0){
                break;
            }
        }

        for(int val:arr){
            System.out.print(val+" ");
        }
         
    }
}