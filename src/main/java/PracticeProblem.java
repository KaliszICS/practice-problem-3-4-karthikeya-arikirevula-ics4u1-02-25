public class PracticeProblem {
	static int[] arr;
	static boolean[] inSeq = new boolean[1000000];
	static int recamanNum(int n){
		if(n == 0){
			return 0;
		}
	
		int x = recamanNum(n-1);
			if(x-n > 0 && !inSeq[x-n]){
				arr[n-1] = x-n;
				inSeq[x-n] = true;
				return x-n;}
			else{
				arr[n-1] = x+n;
				inSeq[x+n] = true;
				return x+n;}
		}
		static int[] recaman(int n){
			if(n < 0){
				return new int[0];}
		
			arr = new int[n];
			inSeq = new boolean[99999999];
			recamanNum(n);
			return arr;
		}
	}
