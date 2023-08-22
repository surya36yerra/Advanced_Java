package basic;

import java.util.Arrays;

public class bsearch {


    public static void main(String[] args) {
        int[] a = new int[]{2,4,5,6,3,9};
        int x = 99;

        Arrays.sort(a);
        int index = bsearch(a,x);
        if(index == -1){
            System.out.println("nott found");
        }
        else{
            System.out.println("element found at position "+index);
        }

    }


    static int bsearch(int a[],int x){
        int mid;
        int low = 0;
        int high = a.length-1;


        while(high>=low) {

            mid = (low+high)/2;

            if (a[mid] == x) {
                return mid;
            } else if (x < a[mid]) {
                high = mid - 1;
            } else if (x > a[mid]) {
                low = mid + 1;
            }
        }

        return -1;


    }
}
