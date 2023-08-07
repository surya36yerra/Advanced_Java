
public class InsertionSort {
    public static void main(String[] args) {
        int[] a = new int[]{4,2,1,7,8,9};
        int n = a.length;
        isort(a,n);

        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
    }


    static void isort(int a[],int n){

        for(int i=1;i<n;i++){

            int key = a[i];
            int j = i-1;

            while(j>=0 && a[j]>key){
                a[j+1]=a[j];
                j = j-1;
            }
            a[j+1]=key;

        }



    }
}
