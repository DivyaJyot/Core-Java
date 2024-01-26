public class Subarray {
    public static void main(String[] args) {
        int[] x= {1,2,4,7};
        System.out.println("hi ");
       // printAllSubarray(x);
        //printAllSubarrayK(x,0);
        printAllSubarraySumK(x,0);
    }
    //Print all subarray, subarraysum starting at length index k
    public static void printAllSubarraySumK(int[] A,int k){
        int n= A.length;
        int s=k;
        for(int e=s;e<n;e++){
            int sum=0;
            for(int p=s;p<=e;p++){
                sum+=A[p];
                System.out.print(A[p]+" ");
            }
            System.out.println("sum"+sum);
        }

    }
    public static void printAllSubarrayK(int[] A,int k){
        int n= A.length;
        int s=k;
            for(int e=s;e<n;e++){
                for(int p=s;p<=e;p++){
                    System.out.print(A[p]+" ");
                }
                System.out.println("\n");
            }

    }

    public static void printAllSubarray(int[] A){
        int n= A.length;
        for(int s=0;s<n;s++){
            for(int e=s;e<n;e++){
                for(int p=s;p<=e;p++){
                    System.out.print(A[p]+" ");
                }
                System.out.println("\n");
            }
        }
    }
}