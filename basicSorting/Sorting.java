package basicSorting;

public class Sorting {
    //PRINTING AN ARRAY
    public static void printArr(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    //BUBBLE SORT ---------------------------------------
    public static void bubbleSort(int num[]) {
        int n = num.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swap = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (num[j] > num[j + 1]) {
                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                    swap = true;
                }

            }
            if(swap == false){
                break;
            }
        }

    }
    //SELECTION SORT --------------------------------------
    public static void selectionSort(int num[]) {
        int n = num.length;
        for (int i = 0; i < n - 1; i++) {
            int minValue = i;
            for (int j = 1 + i; j < n; j++) {
                if (num[j] < num[minValue]) {
                    minValue = j;
                }
            }
            int temp = num[i];
            num[i] = num[minValue];
            num[minValue] = temp;
        }
    }
    //INSERTION SORT-------------------------------------
    public static void insertionSort(int num[]){
        int n = num.length;
        for(int i=1;i<n;i++){
            int key = num[i];
            int j = i-1;
            while(j>=0 && num[j] > key){
                num[j+1] = num[j];
                j--;
            }
            num[j+1] = key;
        }
    }
    //COUNTING SORT ---------------------------------------------------------------
    public static void countingSort(int num[])
    {
        int largest = 0;
        for(int i=0;i<num.length-1;i++)
        {
            largest = Math.max(num[i+1], num[i]);
        }
        //count Array
        int count[] = new int[largest+1];
        for(int i=0;i<num.length;i++){
            count[num[i]]++; //if num[i]=1 [0,1,0,0,0,0,0,0]
        }
        //sorting
        int j=0;
        for( int i=0;i<count.length;i++){
            while (count[i]>0) {
                num[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    public static void main(String[] args) {

        int num[] = { 1, 4, 1, 3, 2 ,4 ,3, 7};
        bubbleSort(num);
        printArr(num);
    }
}
