public class Main {

    public static void main(String[] args) {

        double b = 9;
        b += 1; // тоже самое что и a = a+1;
        b -= 1; // тоже самое что и a = a-1;
        System.out.println(b % 2); // результат = 1


        int r,t = 5;



        int i = Integer.MAX_VALUE;
        System.out.println(i);
        i++;
        System.out.println(i);
        // при выходе из диапазона допустимых значений значение переменная i сбросится на минимально допустимое значение

        int j = Integer.MIN_VALUE;
        System.out.println(j);
        j--;
        System.out.println(j);
        // аналогично как в примере выше


        int a = 10;
        boolean res = a < 10;
        if (res) {

        }

        //почему boolean = 1 байт
        //иначе никак, минимальный размер ячейки памяти = 1 байт


//        {
//            int m = 10;
//        }
//        System.out.println(m);
        //не чего не получится будет ошибка.
        //Использование переменной за пределами области видимости(за пределами фигурных скобок в которых она была инициализирована) невозможно


    }
}
