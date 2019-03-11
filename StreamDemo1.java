import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names=new ArrayList<>();
		names.add("Meghna");
		names.add("Shekhar");
		names.add("Aman");
		names.add("Rahul");
		names.add("Sonam");
		names.add("Salman");
		names.add("Lokesh");
		names.add("Navin");
		
		//core stream operations
		//filter
		names.parallelStream().filter((s) -> s.startsWith("S")).forEach(System.out::println);
		System.out.println("\n");
		//map
		names.stream().filter((s) -> s.startsWith("S")).map(String::toUpperCase).forEach(System.out::println);
		System.out.println("\n");
		//sorted
		names.stream().sorted().map(String::toUpperCase).forEach(System.out::println);
		System.out.println("\n");
		//terminal operations
		//foreach
		names.forEach(System.out::println);
		System.out.println("\n");
		//collect
		List<String> namesUpperCase=names.stream().sorted().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(namesUpperCase);
		System.out.println("\n");
		//count
		long tm = names.parallelStream().filter((s) -> s.startsWith("S")).count();
		System.out.println("total names starts with A:" +tm);
		System.out.println("\n");
		//reduce
		Optional<String> r=names.stream().reduce((s1,s2) -> s1 + "#" +s2);
		r.ifPresent(System.out::println);
		
	}

}
