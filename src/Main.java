public class Main {

    public static void main(String[] args) {

        //while, do while
        //факториал
        //сортировкак массива
        System.out.println(fact(10));

        int[] arr =  new int[10];
        arr[0] = 1;
        arr[1] = 5;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 6;
        arr[5] = 9;
        arr[6] = 7;
        arr[7] = 8;
        arr[8] = 2;
        arr[9] = 6;

        bubbleSort(arr);

        for (int anInt : arr){
            System.out.println(anInt);
        }

    }

    static int fact(int x) {
        int rez = 1;
        for (int i = 1; i <= x; i++) {
            rez = rez * i;
        }
        return rez;
    }

    static int[] bubbleSort(int[] array){
        int t;

        for (int i=0; i<=9; i++){
            for (int j=i+1; j<=9; j++){
                if (array[i]>array[j]){
                    t = array[i];
                    array[i] = array[j];
                    array[j] = t;
                }
            }
        }
        return array;
    }
}
