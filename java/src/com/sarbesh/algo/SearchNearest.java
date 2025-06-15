package com.sarbesh.algo;

public class SearchNearest {
    public static void main(String[] args) {

        int[] arr = { 12, 16, 22, 30, 35, 39, 42, 45, 48, 50, 53, 55, 56 };
        int result = linerSearchNearest(arr, 35);
        System.out.println(result);
        int result2 = binarySearchNearest(arr, 50, 0, arr.length - 1)[1];
        System.out.println("index: "+result2+", value:"+arr[result2]);
    }

    /**
     * time O(n)
     * space O(1)
     * @param arr
     * @param x
     * @return
     */
    static int linerSearchNearest(int[] arr, int x) {
        int diff = Integer.MAX_VALUE;
        int res = 0;
        for (int j : arr) {
            if (Math.abs(j - x) < diff) {
                diff = Math.abs(j - x);
                res = j;
            }
        }
        return res;
    }

    /**
     * arr[2,3,5,7,11,13]
     * find 9 or its nearest, if middle then dynamic largest,least;
     * search[0,5]
     * mid = (5+0)/2 = 2
     * arr[2] = 5
     *     diff = 9-5 = 4 > 0
     *     search[3,5]
     *         mid = (5+3)/2 = 3
     *         arr[3] = 7
     *         diff = 9-7 = 2 >0
     *         search[4,5]
     *             mid = (5+4)/2 = 4
     *             arr[4] = 11
     *             diff = 9-11 = -2 < 0
     *             search[5,5]
     *                 mid = 5
     *                 arr[5] = 13
     *                 diff = 9-13 = -4 <0
     *                 return [-4, 5];
     *             compare[-4, -2]
     *             return [-2,4];
     *         compare[2,-2]
     *         return [2,3];
     *     compare[4,2]
     *     return [2,3];
     *
     *
    * */
    static int[] binarySearchNearest(int[] arr, int x, int l, int e){
        int[] resArr = {Integer.MAX_VALUE, -1};
        if(l<=e){
            int mid = l+(e-l)/2;
            int diff = Math.abs(arr[mid] - x);
            if(arr[mid] > x){
                resArr = binarySearchNearest(arr, x, l, mid - 1);
            } else if(arr[mid] < x){
                resArr = binarySearchNearest(arr, x, mid + 1, e);
            } else {
                resArr[0] = diff;
                resArr[1] = mid;
            }

            if(diff < resArr[0]){
                resArr[0] = diff;
                resArr[1] = mid;
            } else if(diff == resArr[0]){
                resArr[1] = mid;
            }
        }
        return resArr;
    }
}
