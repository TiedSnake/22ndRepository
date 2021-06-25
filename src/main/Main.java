/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author m-w-n
 */
public class Main
{
    public static void main(String[] args)
    {
        kthSmallest ob = new kthSmallest();
        int arr[] = {12, 3, 5, 7, 4, 19, 26};
        int n = arr.length, k=1;
        System.out.println("K'th smallest element is " + ob.kthSmallest(arr, 0, n-1, k));
    }
}
//3, 4, 5, 7, 12, 19, 26        items sorted from smallest to greatest.
//1 ,  2,  3, 4,   5, 6, 7        indexes