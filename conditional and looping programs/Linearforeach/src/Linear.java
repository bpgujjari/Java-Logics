
public class Linear {
	public static int Lin(int[]arr,int target) {
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==target)
			return i;
	}
	return -1;
	}

	public static void main(String[] args) 
	{
		int[] arr= {2,5,6,7,8};
		for(int target:arr) {
		int res=Linear.Lin(arr, target);
		if(res!=-1)
			System.out.println("Element found at index no"+res);
		}
	}

}
