public class Merge {

    public static void merge(int[] a,int[] aux, int lo, int mid, int hi) {
		int j=mid+1;
		for(int k=lo; k<=hi; k++) aux[k] = a[k];
		
		for(int k=lo; k<=hi; k++) {
			if(lo>mid) 				 a[k] = aux[j++];
			else if(j>hi) 			 a[k] = aux[lo++];
			else if(aux[j] < aux[lo]) a[k] = aux[j++];
			else 					 a[k] = aux[lo++];
		}
	}

    public static void sort(int[] array, int[] aux, int lo, int hi){
        if(hi<=lo) return;
        int mid = lo + (hi - lo) / 2; // pivot

        sort(array, aux, lo, mid);
        sort(array, aux, mid+1, hi);

        merge(array, aux, lo, mid, hi);
    }

    
    private static void sort(int[] array) {
        int[] aux = new int[array.length];
        sort(array, aux, 0, array.length-1);
    }

    public static void printArray(int[] array){
        for(int i=0; i<array.length; i++)
            System.out.println(array[i] + " ");
    }

    public static void main(String[] args) {
        int[] array = {16,21,11,8,12,22};
        sort(array);
        printArray(array);
        
    }    
}
