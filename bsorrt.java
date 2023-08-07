public class bsorrt {

    public static void main(String[] args) {
        int[] a = new int[]{1,2,3};
        int n = a.length;
        bsort(a,n);

        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }

    }



     static void bsort(int a[],int n){
        int t,count=0;

        for(int i=0;i<n;i++){

            for(int j=0;j<n-1;j++){

                if(a[j]>a[j+1]){

                    t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                    count ++;
                }
            }
            if(count==0){
                break;}
        }
         System.out.println("inner loop swap count is "+count);



     }
}
