/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;
import java.util.Random;
/**
 *
 * @author sonhu
 */
public class SortModel {
    private int[] array;

 public void setArray(int[] customArray) {
        this.array = customArray;
    }
    public int[] getArray() {
        return array;
    }

    public void bubbleSort() {
        int n = array.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (array[i - 1] > array[i]) {
                    // Swap array[i-1] and array[i]
                    int temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                    swapped = true;
                }
            }
            n--;
        } while (swapped);
    }
 

}


