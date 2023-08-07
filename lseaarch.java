public class lseaarch {


    public static void main(String[] args) {
        int[] a = new int[]{3,4,5,6,1,9};
        int x = 1;
        lsearch(a,x);

    }


     static void lsearch(int a[],int x){

        for(int i=0;i<a.length;i++){
            if(a[i]==x){
                System.out.println("element found at "+i +" position");
            }
         }
     }
}
