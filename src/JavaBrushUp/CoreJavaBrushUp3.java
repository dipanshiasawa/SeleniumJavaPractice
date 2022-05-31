package JavaBrushUp;

public class CoreJavaBrushUp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// String is an object that represents the sequence of characters
		
		
		//STRING LITERAL
		String s = "Rahul Shetty Academy";
		String s1 = "Rahul Shetty Academy"; 
		/* Java will not allocate the new memory. First it will check if this string is already exists 
		in my memory for any variable. If yes, then instead of creating again new object allocation,
		it will point this new variable to the value in the memory.
		If the text is same, no matter how many new variables you create, it will create only one object.*/
		
		
		//USING NEW KEYWORD
		String s2 = new String("welcome");
		String s3 = new String("welcome");
		/*Now  this will create a new object in the memory every time even if the value is same.*/
		
		
		String name = "Rahul Shetty Academy";
		String[] splits1 = name.split(" ");
		for(String spl : splits1)
		{
			System.out.println(spl);
		}
		
		String[] splits2 = name.split("Shetty");
		for(String spl : splits2)
		{
			spl = spl.trim();
			System.out.println(spl);
		}
		
		for(int i=0;i<name.length();i++)
		{
			System.out.println(name.charAt(i));
		}
	}

}
