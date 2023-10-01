class gfg_no_of_occurences{
    public static void main(String[] args) {
       int  N = 7, X = 2;
        int[] arr= {1, 1, 2, 2, 2, 2, 3};
        System.out.println(count(arr, N, X));
    }
    
    // static int count(int[] arr, int n, int x) {
    //     int m=bs(arr, x);
    //     int cnt=0;
    //     // code here
    //     if(m==-1){
    //         return 0;
    //     }
    //     else{
    //        m=bs(arr, x);
    //          int i=m,j=m;
    //          while (i >= 0 && arr[i] == x) {
    //             cnt++;
    //             i--;
    //         }
    //         while (j < n && arr[j] == x) {
    //             cnt++;
    //             j++;
    //         }
    //     }
    //     return cnt-1;

    // }
    // static int bs(int[] arr,int x){
    //     int start=0;
    //     int end=arr.length-1;
    //     while(start<=end){
    //         int mid=end-(start+end)/2;
    //         if(arr[mid]>x){
    //             end=mid-1;
    //         }
    //         if(arr[mid]<x){
    //             start=mid-1;
    //         }
    //         if(arr[mid]==x){
    //             return mid;
    //         }
    //     }
    //     return -1;
    // }

    
       static int count(int[] arr, int n, int x) {
            // code here
            int mid;
            int count=0;
            
            if(n%2==0){
                mid=n/2;
            }else{
                mid=(n/2)+1;
            }
            
            if(x<arr[mid]){
               for(int i=0;i<mid;i++){
                   if(arr[i]==x){
                       count++;
                   }
               }
            }else if(x==arr[mid]){
                for(int i=0;i<n;i++){
                    if(arr[i]==x){
                       count++;
                   }
                }
            }else{
                for(int i=mid+1;i<n;i++){
                    if(arr[i]==x){
                       count++;
                   }
                }
            }
            
            return count;
        }
    
}
