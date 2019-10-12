package sorting;

    /*
    Одномерные массивы. Сортировки.
    Задача №2.
    Даны две последовательности A1 <= A2 <=   ... <= An и B1 <= B2 <= ... Bm.  Образовать из них новую
    последовательность чисел так; чтобы она тоже была неубывающей. Примечание. Дополнительный массив не использовать

     */

public class TaskTwo {

    public static void main(String[] args) {
        //Т.к. не указан метод ввода, оставил заккоментированный хард-код, использованный мной для проверки

//        double[] arrayOne = {-3.3, -1, 0, 2, 4, 78, 111, 8923};
//        double[] arrayTwo = {-55.2,0, 77, 91, 126, 99999};
//        System.out.println("Итоговый ряд по возрастающей: ");
//        combineArrays(arrayOne,arrayTwo);
    }

    private static void combineArrays(double[] arrayOne, double arrayTwo[]){        //Метод вывода результата
        for ( int i = 0, n = 0, m = 0; i < arrayOne.length+arrayTwo.length;i++){    //Цикл сортировки
            if(n == arrayOne.length ){              //Проверка окончания первого массива
                for( int x = m; x < arrayTwo.length;x++){   //Вывод остатков второго массива
                  double min = arrayTwo[x];
                    System.out.print(min + " ");
                }
                break;
            } else if ( m == arrayTwo.length){      //Проверка окончания второго массива
                for( int y = n; y < arrayOne.length;y++){   //Вывод остатков первого массива
                    double min = arrayOne[y];
                    System.out.print(min + " ");
                }
                break;
            } else {
                double min = Math.min(arrayOne[n], arrayTwo[m]);    //Вывод минимума если массивы не кончились
                if (min == arrayOne[n]) {
                    n++;
                } else {
                    m++;
                }
                System.out.print(min + " ");
            }
        }
    }
}
