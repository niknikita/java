public class Main {

    public static void main(String[] args) {

        //while, do while
        //факториал
        //сортировкак массива
        System.out.println(fact(10));

        int[] arr = new int[10];
        arr[0] = 1;
        arr[1] = 5;
        arr[2] = 5;
        arr[3] = 4;
        arr[4] = 6;
        arr[5] = 9;
        arr[6] = 7;
        arr[7] = 8;
        arr[8] = 2;
        arr[9] = 6;

        bubbleSort(arr);

        for (int i = 0; i < 10; i++) {
            System.out.printf("a[%d] = %d%n", i, arr[i]);
        }

        binerySearch(arr, 1);
        binerySearch(arr, 2);
        binerySearch(arr, 3);
        binerySearch(arr, 4);
        binerySearch(arr, 5);
        binerySearch(arr, 6);
        binerySearch(arr, 8);
        binerySearch(arr, 9);
        binerySearch(arr, 11);

    }

    static int fact(int x) {
        int rez = 1;
        for (int i = 1; i <= x; i++) {
            rez = rez * i;
        }
        return rez;
    }

    static int[] bubbleSort(int[] array) {
        int t;

        for (int i = 0; i <= 9; i++) {
            for (int j = i + 1; j <= 9; j++) {
                if (array[i] > array[j]) {
                    t = array[i];
                    array[i] = array[j];
                    array[j] = t;
                }
            }
        }
        return array;
    }

    static void binerySearch(int[] array, int search) {
        bubbleSort(array);

        int left = 0;
        int right = 9;
        int middle;
        //System.out.printf("%nсреднее a[%d] = %d%n", middle, array[middle]);

        while (true) {

            middle = (left + right) / 2;
            if (array[middle] == search) {
                System.out.printf("УРА!!! array[%d] = %d%n", middle, array[middle]);
                break;
            }
            if (array[middle] != search) {

                if (search > array[middle]) {
                    left = middle + 1;
                } else {
                    right = middle - 1;
                }

                if (right < left || array[middle] == search) {
                    System.out.printf("Облом, элемент %d не найден!%n", search);
                    break;
                } else {
                    middle = (left + right) / 2;
                }
            }
        }


    }
}
