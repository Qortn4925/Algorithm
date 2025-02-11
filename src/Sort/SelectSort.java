package Sort;

// 선택 정렬의 아이디어는 ,가장 큰 , 작은 수를 찾아서 , 기억한 후에 , 직접 집어 넣는다

import java.util.Arrays;

public class SelectSort {
    public static void main(String[] args) {
//        int a[] = {5,4,3,2,1};
        int a[] = {1,3,4,5,2};
//        int b[] ={1,2,3,4,5};


        selectSort(a);
        System.out.println("Arrays.toString(a) = " + Arrays.toString(a));
//        upperSelectSort(b);
//        for(int item: b){
//            System.out.println("itemb = " + item);
//        }
    }

    private static int[] selectSort(int[] numbers) {

        // 전체 요소를 순회 한다. 마지막 공간은 자동으로 위치 교환을 통해 정렬된다.
        for (int index = 0; index < numbers.length - 1; index++) {
            int min = index;

            // 다음 요소를 현재요소와 비교한다. 다음요소가 현재의 요소보다 작을 경우 요소의 인덱스를 바꿔준다.
            for (int scan = index + 1; scan < numbers.length; scan++) {
                if (numbers[scan] < numbers[min]) {     // 2 가 11보다 작으니
                    min = scan;                         // 작은 인덱스를 min에 할당 0 = 1;
                }
            }

            int smaller = numbers[min];                 // 1번째 공간값인 2가 가장 작은값이므로 smaller 에 저장
            numbers[min] = numbers[index];              // 1번째 공간에 0번째 값을 할당
            numbers[index] = smaller;                   // 0번째 공간에 가장 작은값을 할당

        }

        return numbers;
    }
    public static void upperSelectSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            // 똑같이 한 자리수를 고정 시켜놓았으니 시작값도 그 이상부터
            int index = i;

            for (int j = i; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
    }

}