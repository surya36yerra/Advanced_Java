import java.util.Arrays;

class Solution {


    public static void main(String[] args) {
        int a[] = new int[]{2,1,1,2,3,1};
        int  l  = a.length;
         findduplicates(a,l);



}


    static void findduplicates(int a[],int l){

        int count = 0,i;

        int j[] = new int[l];

        Arrays.sort(a);

        for(i=0;i<l-1;i++){
            if(a[i]!=a[i+1]){
                count++;
            }
        }

       // j[i] = a[l];

        System.out.println("unique elemlemts count is"+ count);
    }


}
