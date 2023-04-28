

// Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
// каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке. Если длины массивов
// не равны, необходимо как-то оповестить пользователя.

import java.lang.reflect.Array;
public class Exception {
    public static void main(String[] args) {
        int [] arr1 = new int []{1,12,3,1,7};
        int [] arr2 = new int []{5,3,1,1,11};
        
        for (int i : differens(arr1, arr2)) {
            System.out.printf("%d ", i);
        }
        System.out.println();
    }


    public static int [] differens(int [] arr1, int [] arr2 ) {
        int [] arr = new int [arr2.length];
        if (arr2.length != arr1.length)  throw  new RuntimeException("Lengths of arrays are different!");
        else {
            for (int i = 0; i < arr.length; i++) {
                if (arr1[i] > arr2[i]) arr [i] = arr1[i] - arr2[i];
                else arr [i] = arr2[i] - arr1[i];
            }
        }
        return arr;
    }


}