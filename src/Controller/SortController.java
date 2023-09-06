/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.SortModel;
import View.SortView;
import java.util.Scanner;
/**
 *
 * @author sonhu
 */
public class SortController {
    
    private SortModel model;
    private SortView view;

    public SortController(SortModel model, SortView view) {
        this.model = model;
        this.view = view;
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
//nhap du lieu
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        if (size <= 0) {
            System.out.println("Please enter a positive integer.");
            scanner.close();
            return;
        }

        // nhap cac phan tu
        int[] customArray = new int[size];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            customArray[i] = scanner.nextInt();
        }

        // truyen mang vao de sap xep
        model.setArray(customArray);

        // hien thi mang chua duoc sap xep
        System.out.println("Unsorted Array:");
        view.displayArray(model.getArray());

        // su dung bubblesort de săp xep 
        model.bubbleSort();

        // hien thi mang da sap xep
        System.out.println("\nSorted Array:");
        view.displayArray(model.getArray());

        scanner.close();
    }

    public static void main(String[] args) {
        SortModel model = new SortModel();
        SortView view = new SortView();
        SortController controller = new SortController(model, view);
        
        controller.run();
    }
    
}
