/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

/**
 *
 * @author litong
 */
public class ArrayMaxSum {

    public static int maxSum(int arr[], int l, int m, int h) {

        int sum = 0;

        int sumLeft = Integer.MIN_VALUE;

        for (int a = m; a >= l; a--) {

            sum = sum + arr[a];

            if (sum > sumLeft) {
                sumLeft = sum;
            }

        }

        sum = 0;

        int sumRight = Integer.MIN_VALUE;

        for (int a = m + 1; a <= h; a++) {

            sum = sum + arr[a];

            if (sum > sumRight) {
                sumRight = sum;
            }

        }
        return Math.max(sumLeft + sumRight, Math.max(sumLeft, sumRight));

    }

    public static int maxSubArray(int arr[], int l, int h) {
        if (l == h) {
            return arr[l];
        }

        int m = ((l + h) / 2);
        return Math.max(Math.max(maxSubArray(arr, l, m),
                maxSubArray(arr, m + 1, h)),
                maxSum(arr, l, m, h));

    }

    public static void main(String [] args) {

        int array[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int max = maxSubArray(array, 0, array.length - 1);
        System.out.println(max);

    }
}
