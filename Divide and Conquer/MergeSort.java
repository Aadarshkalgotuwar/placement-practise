public class MergeSort{
    public static void PrintArr(int arr[]){
        for(int i =0 ; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void mergesort(int arr[], int si , int ei ){
        //base case 
        if(si>= ei ){
            return ;
        }
        //kaam 
        int mid = si +(ei-si)/2;//(si+ei )/2
        mergesort(arr, si, mid);//left part 
        mergesort(arr, mid+1, ei);//right part 

       merge(arr,si,mid,ei);
    }
    public static void merge(int arr[], int si ,int mid , int ei){
        int temp[]= new int[ei-si+1];
        int i = si;//iterator for the left part 
        int j = mid + 1 ;// iterator for right part
        int k = 0; //iterator for temporary arr
        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;k++;
            }else{
                temp[k]=arr[j];
                j++;k++;
            }
        }
        //left part 
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        //right part
        while(j<=ei){
            temp[k++]=arr[j++];
        }
        //copy temp to original arr
        for(k=0,i=si; k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
    }

    public static void main(String[] args){
       int arr[]={6,4,3,4,2,7,8,9,3};
       mergesort(arr, 0,arr.length-1);
       PrintArr(arr);
    }
}
