public class FrequencyArray1{
	public static void main(String[] args) {
		
		int arr[] = new int[]{1,2,8,3,2,1,5,2,2};
		int freq[] = new int[arr.length];

		int i, j, visited = -1;

		System.out.print("Original Array : ");
		for(int element : arr)
			System.out.print("  "+element);


		for(i=0; i<arr.length; i++){

			int count = 1;
			for(j=i+1; j<arr.length; j++){
				if(arr[i] == arr[j]){
					count++;
					freq[j] = visited;
				}
			}
			if(freq[i] != visited)
				freq[i] = count;
		}

		System.out.println("\nelement | Frequency ");

		for(i=0; i<freq.length; i++){
			if(freq[i] != visited)
				System.out.println("  "+arr[i]+" | "+freq[i]);
		}
	}
}
// output :
// Original Array :   1  2  8  3  2  1  5  2  2
// element | Frequency
//   1 | 2
//   2 | 4
//   8 | 1
//   3 | 1
//   5 | 1
