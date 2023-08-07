public class MergeSort {


        public static void main(String[] args) {
            int[] a = new int[]{4,2,1,7,8,9};
            int h = a.length-1;
            int l = 0;
            mergeSort(a,l,h);

            for(int i=0;i<a.length-1;i++){
                System.out.println(a[i]);
            }
        }


        static void  mergeSort(int a[],int l,int h){
            if(l<h){
                int m = (l+h)/2;
                mergeSort(a,l,m);
                mergeSort(a,m+1,h);
                merge(a,l,m,h);
            }
        }


            static void merge(int a[],int l,int m,int h){

            int n1 = m-l+1;
            int n2 = h-m;

            int L[] = new int[n1];
            int R[] = new int[n2];

            for(int i=0;i<n1;i++){
                L[i]=a[l+i];
            }

                for(int j=0;j<n2;j++){
                    R[j]=a[m+1+j];
                }

                //MERGE ARRAYS
                int i=0,j=0,k=1;

                while(i<n1 && j<n2) {

                    if (L[i] <= R[j]) {
                        a[k] = L[i];
                        i++;
                    } else {
                        a[k] = R[j];
                        j++;
                    }
                    k++;
                }
              while(i<n1){
                  a[k]=L[i];
                  i++;
                  k++;
                }
                    while(j<n2){
                    a[k]=R[j];
                    j++;
                    k++;
                }


                }
     }


