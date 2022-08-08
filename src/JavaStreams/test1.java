package JavaStreams;

import java.util.ArrayList;
import java.util.stream.Stream;

import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class test1 {

	public static void main(String[] args) {
		
//		regular();
		streamsFilter();
	}
	
	
	public static void regular()
	{	// Count the number of names starting with alphabet A in list
	
			ArrayList<String> names = new ArrayList<String>();
			names.add("Abhijeet");
			names.add("Don");
			names.add("Alekhya");
			names.add("Adam");
			names.add("Ram");
			
			int count = 0;
			
			for (int i = 0; i < names.size(); i++) {
				String name = names.get(i);
				if(name.startsWith("A"))
				{
					count++;
				}
			}
			System.out.println(count);
    }
		
	public static void streamsFilter()
	{	// Count the number of names starting with alphabet A in list
	
			ArrayList<String> names = new ArrayList<String>();
			names.add("Abhijeet");
			names.add("Don");
			names.add("Alekhya");
			names.add("Adam");
			names.add("Ram");
			
			//There is no life of intermediate operation if there is no terminal operation(ex. count)
			//Terminal operator only executes if intermediate operation (ex. filter) returns true
			//How to use filter in Stream API
			Long count = names.stream().filter(s->s.startsWith("A")).count();
			
			System.out.println(count);
			
			//Another way of creating a stream 
			Long count2 = Stream.of("Abhijeet","Don","Alekhya","Adam","Ram").filter(s->
			{
				s.startsWith("A");
				return false;
				
			}).count();
			System.out.println(count2);
			
			//print all names of ArrayList
			names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
			
			//see the sample of only few results
			names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
			
			
    }
		
}
