package JavaStreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectStreamExample {

	public static void main(String[] args) {

		List<String> ls = Stream.of("Abhijeet","Don","Alekhya","Adam","Rama").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
		.collect(Collectors.toList());
		System.out.println(ls.get(0));

	}

}
