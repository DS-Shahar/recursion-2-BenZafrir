public class Main {
		public static int q14 (int[] arr, int i) {
			if(i==-1) {
				return 0;
			}
			return arr[i]+q14(arr,i-1);
		}
		
		public static int q15 (int[] arr, int i) {
			if(i==-1) {
				return 0;
			}
			if(arr[i]>0) {
				return 1+q15(arr,i-1);
			}
			else {
				return q15(arr,i-1);
			}	
		}
		
		public static int q16 (int[] arr, int n, int i) {//i is arr.length-1
			if(i==-1) {
				return -1;
			}
			if(arr[i]==n) {
				return i;
			}
			else {
				return q16(arr,n,i-1);
			}
		}
		
		//n is last number in arr , i is arr.length-1
		public static boolean q17 (int[] arr, int n, int i) {
			if(i==-1) {
				return true;
			}
			if(arr[i]>=n) {
				return false;
			}
			else {
				return q17(arr,arr[i],i-1);
			}
		}
		
		//helper function
		public static boolean q8(int n, int z) {//z=n-1
			if (z<=1) {
				return true;
			}
			if (n%z==0) {
				return false;
			}
			z--;
			boolean a=q8(n,z);
			return a;
		}
		public static boolean q18 (int[] arr, int i) {//i is arr.length-1
			if(i==-1) {
				return true;
			}
			if(q8(arr[i],arr[i]-1)==true) {
				return false;
			}
			else {
				return q18(arr,i-1);
			}
		}
		
		//helper function
		public static boolean doWhat(int[] arr , int n, int i) {//i is arr.length-1
			if (i<0) {
				return false;
			}
			if(arr[i]==n) {
					return true;
			}
			else {
				return doWhat(arr,n,i-1);
			}
		}
		public static int q19 (int[][] arr, int n, int i) {//i is arr.length-1
			if(i==-1) {
				return 0;
			}
			if(doWhat(arr[i],n, arr[i].length-1)==true) {
				return 1+q19(arr,n,i-1);
			}
			else {
				return q19(arr,n,i-1);
			}
		}
		
	public static void main(String[] args) {
		int[][] arr = {{5,1,2},
				       {3,4,5},
				       {6,7,5}};
		System.out.println(q19(arr,21,2));
	}

}
