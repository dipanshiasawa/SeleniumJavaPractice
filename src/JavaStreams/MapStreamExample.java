package JavaStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MapStreamExample {

	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhijeet");
		names.add("Don");
		names.add("Alekhya");
		names.add("Adam");
		names.add("Rama");
		
		//print all names of ArrayList in uppercase which ends with A
		//Whenever any modification required after the filter is done, we need to choose map method
		names.stream().filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		System.out.println("------");
		names.stream().map(s->s.toLowerCase()).forEach(s->System.out.println(s));
		System.out.println("------");
		//print all names of ArrayList in uppercase which starts with A in sorted order
		List<String> namelist = Arrays.asList("Abhijeet1","Don","Alekhya1","Adam1","Ram1");
		namelist.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase())
		.forEach(s->System.out.println(s));
		System.out.println("------");
		//merging 2 different lists
		Stream<String> newStream = Stream.concat(names.stream(), namelist.stream());
//		newStream.sorted().forEach(s->System.out.println(s));
//		newStream.filter(s->s.equalsIgnoreCase("Adam")).forEach(s->System.out.println(s));
		System.out.println("------");
		boolean flag = newStream.anyMatch(s->s.equalsIgnoreCase("Adam"));
		System.out.println(flag);
		
		
		
	}

}
