public class Insertion{
	public static void sort(int[] a) {
		int N = a.length;
		
		for(int i=1; i<N; i++) {
			for(int j=i; j>0 && a[j]<a[j-1]; j--) {
				int temp = a[j];
				a[j] = a[j-1];
				a[j-1] = temp;
			}
		}
	}
	static void printArray(int[] a1) {
		//int[] a1 = {22,27,16,2,18,6};
		for(int i=0;i<a1.length;i++)
            System.out.print(a1[i] + " ");        		
	}
    
	public static void main(String[] args) {
		int[] m = {22,27,16,2,18,6};
		sort(m);
		printArray(m);
	}
}