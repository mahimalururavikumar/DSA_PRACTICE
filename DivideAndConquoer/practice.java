package DivideAndConquoer;

public class practice {

    public static void printArr(int arr[])
    {
        System.out.print("[ ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.print("]");
    }

    //MERGE SORT
    public static void mergeSort(int arr[],int si,int ei){
        if(si >= ei)
        {
            return;
        }
        int mid = si + (ei-si)/2;
        mergeSort(arr, si, mid);
        mergeSort(arr,mid+1,ei);

        merge(arr, si, ei, mid);
    }
    public static void merge(int arr[],int si,int ei,int mid){
        int temp[] = new int[ei-si+1];
        int i = si;
        int j = mid+1;
        int k = 0;

        while (i<=mid && j <= ei) {
            if(arr[i] < arr[j])
            {
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i<=mid){
            temp[k++] = arr[i++];
        }

        while (j<=ei) {
            temp[k++] = arr[j++];
        }

        for(k=0,i=si;k<temp.length;k++,i++)
        {
            arr[i] = temp[k];
        }
    }
    
    //QUICK SORT
    public static void quickSort(int arr[],int si,int ei){
        if(si >= ei)
        {
            return;
        }

        int pdx = partition(arr, si, ei);
        quickSort(arr, si, pdx-1);
        quickSort(arr, pdx+1, ei);
    }

    public static int partition(int arr[],int si,int ei){
        int pivot = arr[ei];
        int i = si-1;
        for(int j=si;j<ei;j++)
        {
            if(arr[j]<pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[ei] = temp;
        return i;
    }

    public static int rotatedSortedSearch(int arr[],int si,int ei,int target){
        if(si > ei){
            return -1;
        }
        int mid = si + (ei-si)/2;

        if(arr[mid] == target){
            return mid;
        }

        if(arr[si] < arr[mid]){
            if(arr[si]<=target && target<=arr[mid-1]){
                return rotatedSortedSearch(arr, si, mid-1, target);
            }else{
                return rotatedSortedSearch(arr, mid+1, ei, target);
            }
        }else{
            if(arr[mid]<=target && target<=arr[ei]){
                return rotatedSortedSearch(arr, mid+1, ei, target);
            }else{
                return rotatedSortedSearch(arr, si, mid-1, target);
            }
        }
    }
    public static void main(String[] args) {
        
        int arr[] = { 4, 5, 6, 7, 0, 1, 2};
        //mergeSort(arr, 0, arr.length-1);
        //quickSort(arr, 0, arr.length-1);
        System.out.println(rotatedSortedSearch(arr, 0, arr.length-1, 0));
    }
}
