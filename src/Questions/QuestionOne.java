package Questions;
// Perform a bubble sort on the following integer array: 1,0,5,6,3,2,3,7,9,8,4
public class QuestionOne 
{
	public void BubbleSort(){
		// Declare the array of integers
		int[] arr = {1,0,5,6,3,2,7,8,4,25,2};
		int n = arr.length;
		
		
		
		//print original array
		System.out.println("Original Array: ");
		for(int x=0;x<n;x++) {
			System.out.print(arr[x]);
		}
		
		
		// for a bubble sort two loops are used
		for(int i=0;i<n;i++) // first for loop to iterate array
		{
			for(int j=i;j<n;j++){
				if(arr[i]>arr[j])
				{
					int temp;
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		System.out.println("\n Sorted Array: ");
		for(int x=0;x<n;x++) {
			System.out.print(arr[x] );
		}
	}
  }
}


