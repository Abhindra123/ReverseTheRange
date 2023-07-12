import java.util.*;


public class ReverseTheRange {
    public static int[] reverseRange(int arr[],int r1,int r2){
        while (r1<r2){
            int temp=arr[r1];
            arr[r1]=arr[r2];
            arr[r2]=temp;
            r1++;
            r2--;
        }
        return arr;
    }


    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the range");
        int r1=sc.nextInt();
        int r2=sc.nextInt();
      int ans[]=  reverseRange(arr,r1,r2);
    for(int i=0;i<ans.length;i++){
        System.out.println(ans[i]);
    }
    }
}