
public class Driver {

	public static void main(String[] args) {
		
		System.out.println(concatIntegerListToLargestInt(new int[]{23, 8, 45, 123 }));

	}
	public static String concatIntegerListToLargestInt(int[] list)
	{
		String result = new String("");
		
		
		int mostDigits = 0;
		//Get the longest integer..
		for (int i =0; i < list.length; i++)
		{
			String num = new String(String.valueOf(list[i]));
			if (num.length() > mostDigits)
			{
				mostDigits = num.length();
			}
		
		}
		//Basically gets all the numbers to be the same length
		//use this formala newInt = oldInt * 10^(mostDigits - length(oldInt))
		int[] newIntList = new int[list.length];
		for (int i = 0; i <list.length; i++)
		{
			newIntList[i] = (int) (list[i] * Math.pow(10, mostDigits - new String(String.valueOf(list[i])).length()));
		}
		
		//Sort the array and apply any sort operation to the original list
		//Use a simple insertion sort
		
		for (int i = 1; i < list.length; i++)
		{
			int j = i;
			while (j > 0 && newIntList[j -1] < newIntList[j])
			{
				//Apply sort on the list of numbers that are all 
				//the same length
				int tmp = newIntList[j];
				newIntList[j] = newIntList[j -1];
				newIntList[j-1] = tmp;
				
				//Apply sort to the list that is the original list
				int tmp2 = list[j];
				list[j] = list[j -1];
				list[j-1] = tmp2;
				
				j = j - 1;
			}
		}
		
		
		//Go from 0 to list.length and concat integers
		
		for (int i = 0; i < list.length; i++)
		{
			result += new String(String.valueOf(list[i]));
		}
		return result;
		
	}

}
