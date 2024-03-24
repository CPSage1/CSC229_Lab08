/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MoaathAlrajab
 */
public class LinearSearch {

    public static int search(int arr[], int x)
    {
        int n = arr.length;
        // Todo 01: - complete the implementation of linear search and test your code
        //         - prvoide asymptotic analysis of the developed solution
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                return i; // if the element is found, it returns its index
            }
        }
        return -1; // if element isn't found
    }
}