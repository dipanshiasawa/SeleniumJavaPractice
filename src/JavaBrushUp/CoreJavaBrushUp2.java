package JavaBrushUp;
import java.util.ArrayList;

public class CoreJavaBrushUp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// TODO Auto-generated method stub

		int[] arr2 = {1,2,4,5,6,7,8,9,10,122};
		
		//Print values which are multiple of 2
		for(int i=0;i<arr2.length;i++)
		{
			if( arr2[i] % 2 == 0 )
			{
				System.out.println(arr2[i] +" number is multiple of 2");
				break;
			}
			else
			{
				System.out.println(arr2[i] +" not a multiple of 2");
			}
		}
		
		ArrayList<String> listname = new ArrayList<String>();
		listname.add("Test1");
		listname.add("Test2");
		listname.add("Test3");
		listname.add("Test4");
		listname.remove(2);
		System.out.println("Output of 0 is: "+listname.get(0));
		
		for(String a : listname)
		{
			System.out.println(a);
		}
	}

}
