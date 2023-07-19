import java.util.Scanner;

public class FactorsSort {

    static int[] factorSort(int[] arr, int n){
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(factorCount(arr[i])==factorCount(arr[j])){
                    int max=Math.max(arr[i],arr[j]);
                    int min= Math.min(arr[i],arr[j]);
                    arr[i]=min;
                    arr[j]=max;
                }

                if(factorCount(arr[i])>factorCount(arr[j])){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }

            }
        }
        return arr;
    }

    static int factorCount( int n){
        int count=0;
        for(int i=1;i*i<=n;i++){
            if(n%i ==0) {
                if (n / i == i) {
                    count++;
                } else {
                    count += 2;
                }
            }
        }
return count;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        arr=factorSort(arr, n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
