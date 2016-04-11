package practise;
public class quicksort {

	private int array[];
	private int length;
	public void sort(int[] inputArr){
		
		if (inputArr == null ||inputArr.length==0){
			return;
		}
		this.array = inputArr;
		length = inputArr.length;
		quicksort(0, length-1);
	}
private void quicksort(int lowerindex, int higherindex){
	int i = lowerindex;
	int j = higherindex;
	
	int pivot = array[lowerindex+(higherindex-lowerindex)/2];
	while(i<=j){
		while(array[i]<pivot){
			i++;
		}
		while(array[j]>pivot){
			j--;
		}
		if (i<=j){
			exchangeNumbers(i,j);
			i++;
			j--;
		}
	}
	if (lowerindex<j)
		quicksort(lowerindex,j);
	if(i<higherindex)
		quicksort(i,higherindex);
}
	private void exchangeNumbers(int i, int j){
		int temp = array[i];
		array[i]=array[j];
		array[j]=temp;
	}
	
	
	public static void main(String[] args) {
	quicksort sorter = new quicksort();
	int[] input = {3,2,1,55,4};
	sorter.sort(input);
	for(int i:input){
		System.out.print(i);
		System.out.print("");
		}
	}

}
