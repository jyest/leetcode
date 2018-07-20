import java.util.Arrays;

public class BubbleSort {
	
	//do sort
	void doBubbleSort(int[] intArr) {
		for (int i =0; i < intArr.length-1; i++) {
			for (int j =0; j < intArr.length-i-1; j++) {
				if (intArr[j] > intArr[j+1]) {
					int tmp =0;
					tmp = intArr[j];
					intArr[j]= intArr[j+1];
					intArr[j+1] = tmp;
				}
			}
			System.out.println(Arrays.toString(intArr));
		}
	}
	
	public static void main (String args[]) {
		int[] intArr = {1,4,2,5,0};
		
		System.out.println(Arrays.toString(intArr));
		new BubbleSort().doBubbleSort(intArr);
		System.out.println(Arrays.toString(intArr));
	}

}
