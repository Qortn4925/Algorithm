package Sort;

// 선택 정렬의 아이디어는 ,가장 큰 , 작은 수를 찾아서 , 기억한 후에 , 직접 집어 넣는다

public class SelectSort {
    public static void main(String[] args) {
        int a[] = {5,4,3,2,1};

        selectSort(a);
        for(int item: a){
            System.out.println("item = " + item);
        }
    }

    public static  void selectSort(int[] arr) {
    // 가장 작은수 찾기
        for(int i =0;i<arr.length -1;i++) {
            int index=i;

            for(int j=i; j<arr.length-1; j++){
                if(arr[j]>arr[j+1]) {
                     index = j+1;
                }
            }
            // 교환 해야하니까, 원래 값도 기억해야하잖아,
             int temp =arr[index];
            arr[index]=arr[i];
            arr[i]=temp;

        }

    }
    public static void upperSelectSort(int[] arr) {
        for(int i =0;i<arr.length -1;i++) {

        }
    }

}
