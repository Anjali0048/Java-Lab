package Anant;

public class BinarySearch {

	public static int binarysearch(int []array ,int target, int start, int end)
	{
		
		if(start<=end)
		{
			int mid=start+(end-start)/2;
			if(array[mid]==target)
			{
				return mid;
			}
			else if(array[mid]>target)
			{
				return binarysearch(array,target,start,mid-1);
			}
			else if(array[mid]<target)
			{
				return binarysearch(array,target,mid+1,end);
			}
		}
		return -1;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []array={1,2,3,4,5,6,7,8,9};
		int target=5;
		int result=binarysearch(array,target,0,array.length-1);
		System.out.println("the index is "+ result);

	}

}


