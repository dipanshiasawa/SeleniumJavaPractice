package JavaBrushUp;

public class CoreJavaBrushUp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Variables
		int myNum = 5;
		String website = "Rahul Shetty Academy";
		char letter = 'r';
		float dec = (float)5.99;
		double dec1 = 5.33;
		boolean myCard = true;
		
		System.out.println(myNum + " is stored in myNum variable");
		System.out.println(website);
		
		// Arrays
		
		int[] arr = new int[5];
		arr[0] = 101;
		arr[1] = 102;
		arr[2] = 103;
		arr[3] = 104;
		arr[4] = 105;
		
		int[] arr2 = {201,202,203,204,205};
		
		System.out.println(arr2[3]);
				
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("arr length is = "+arr.length);
		
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
				
		String[] name = {"One","Two","Three","Four"};
		System.out.println(name[0]);
		System.out.println(name[1]);
		System.out.println(name[2]);
		
		for(int i=0;i<name.length;i++)
		{
			System.out.println(name[i]);
		}
		for(String s:name)
		{
			System.out.println("Name array: "+s);
		}
	}

}
