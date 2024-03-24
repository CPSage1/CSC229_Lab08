/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MoaathAlrajab
 */
public class BubbleSort {

    public static void bubbleSort(int a[], int size) {
        int outer, inner, temp;
        for (outer = size - 1; outer > 0; outer--) { // counting down
            for (inner = 0; inner < outer; inner++) { // bubbling up
                //ToDo 3: complete this algorithm, test it, provide its time complexity
                if (a[inner] > a[inner + 1]) {
                    // Swaps the elements if they are in the wrong order
                    temp = a[inner];
                    a[inner] = a[inner + 1];
                    a[inner + 1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] array = {5, 3, 8, 1, 9, 2};
        int size = array.length;

        bubbleSort(array, size);

        // Prints out the sorted array
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
    
    