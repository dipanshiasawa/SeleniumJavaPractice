package JavaStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PracticeExample {

	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(3,2,2,7,5,1,9,7);
		//Print unique values
		//Sort the array and print 3rd index
		
		values.stream().distinct().forEach(s->System.out.println(s));
		List<Integer> li = values.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(li.get(2));
	}

}
