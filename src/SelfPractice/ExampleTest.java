package SelfPractice;

public class ExampleTest {

	public static void main(String[] args) {

		//input = [1,2,3,4,5,6,3]
		//sum=6
		//output=[1,5][2,4][3,3]
		
		
		int[] input = {1,2,3,4,5,6,3};
		int sum = 6;
		
		for(int i=0;i<input.length;i++)
		{
			for(int j=i+1;j<input.length;j++)
			{
				if(input[i]+input[j]==sum)
				{
					System.out.println("Sum of :"+input[i]+" and "+input[j]);
					
				}
			}
//			input[i]=sum+1;
		}
		

	}

}
