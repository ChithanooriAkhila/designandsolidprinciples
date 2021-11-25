//sorting array in reverse order
import java.util.*;
public class BubbleSort {
    static int n,arr[];
    public void swap(int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String args[]){
        BubbleSort obj=new BubbleSort();
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        arr=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        for(int i=0;i<n-1;i++){
            boolean flag=false;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    /*int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;*/
                    obj.swap(j,j+1);
                    flag=true;
                }
            }
            if(!flag) break;
        }
        for(int i=0,j=n-1;i<j;i++,j--){
            /*int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;*/
            obj.swap(i,j);
        }
        System.out.println(Arrays.toString(arr));
    }
}
