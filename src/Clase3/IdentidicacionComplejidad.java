package Clase3;

public class IdentidicacionComplejidad {

    //EJEMPLO1
    public void printFirstElement(int[] arr) { //O(1)
        if (arr.length > 0) {   //O(1)
            System.out.println(arr[0]);  //O(1)
        }
    }

    //EJEMPLO2
    public void printAllElements(int[] arr) {  //O(1)
        for (int element : arr) {  //O(n)
            System.out.println(element);  //O(1) por iteración
        }
    }

    //EJEMPLO3
    public void printAllPairs(int[] arr) {  //O(1)
        for (int i = 0; i < arr.length; i++) { //O(n)
            for (int j = 0; j < arr.length; j++) {  //O(n) por cada iteración del bucle externo
                System.out.println(arr[i] + ", " + arr[j]); //O(n) por cada iteración del bucle interno
            }
        }
    }

    //EJEMPLO4
    public int binarySearch(int[] arr, int target) {  //O(1)
        int low = 0; //O(1)
        int high = arr.length - 1; //O(1)

        while (low <= high) { //O(log n)
            int mid = (low + high) / 2; //O(1)
            if (arr[mid] == target) { //O(1) por iteración del bucle
                return mid; //O(1)
            } else if (arr[mid] < target) {  //O(1) por iteración del bucle
                low = mid + 1; //O(1)
            } else { //O(1) por iteración del bucle
                high = mid - 1; //O(1)
            }
        }
        return -1; //O(1)
    }

    //EJEMPLO5
    public int fibonacci(int n) { //O(1)
        if (n <= 1) { //O(1)
            return n;  //O(1)
        } else {   //O(1)
            return fibonacci(n - 1) + fibonacci(n - 2); //O(2^n)
        }
    }

    //EJEMPLO6
    //import java.util.Arrays; //O(1)

    public void sortAndPrint(int[] arr) { //O(1)
        Arrays.sort(arr); //O(n log n)
        for (int element : arr) { //O(n)
            System.out.println(element); //O(1) por iteración
        }
    }

}
