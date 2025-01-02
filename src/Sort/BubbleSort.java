package Sort;

public class BubbleSort {

    public static void main(String[] args) {
//     int a [] = {5,3,4,1,2};
     int a []={5,4,3,2,1};

//     bubbleSort(a);
     upperBubbleSort(a);
     for(int item: a){
         System.out.println("item = " + item);
     }
        System.out.println("a[4]+-5 = " + a[4]+-5);

    }

    public static void bubbleSort(int[] arr) {
        int count= 0;
            //버블 소트는 ,
            // s내림차순
        for(int i =0; i<arr.length-1; i++){
            for(int j = 0; j<arr.length-1; j++){
                if(arr[j]>arr[j+1]){
                    int tmp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                    count++;
                }
            }
        }
        arr[4]= arr[4]+count;
    }

    public static void upperBubbleSort(int[] arr) {
        for (int i =0; i<arr.length-1; i++) {
            for (int j = i+1; j < arr.length-1; j++) {
            if(arr[j]<arr[j+1]){
                int tmp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=tmp;
            }
            }
        }
    }
}
