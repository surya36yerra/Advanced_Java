package basic;

public class selectionSorrt {

    public static void main(String[] args) {
        int[] a = new int[]{4,2,1,7,8,9};
        int n = a.length;
        selSort(a,n);

        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
    }


    static void selSort(int a[],int n){

        for(int i=0;i<n-1;i++){
            int min = i;

            for(int j=i+1;j<n;j++){

                if(a[j]<a[min]){
                    min = j;

                    int temp = a[min];
                    a[min] = a[i];
                    a[i]= temp;
                }
            }




        }
    }


    }
