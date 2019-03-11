import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<Integer> s = Stream.of(1,2,3,4,5,6);
		s.forEach(p -> System.out.println(p) );
		List<Integer> I=new ArrayList<Integer>();
		for(int i=1;i<10;i++)
		{
			I.add(i);
		}
		Stream<Integer> s1=I.parallelStream();
		s1.forEach(p -> System.out.println(p));

		
		//convert stream to collections - pipelining
		Stream<Integer> s2=I.parallelStream();
	List<Integer> el = s2.filter(i -> i%2 == 0).collect(Collectors.toList());
	
	System.out.println(el);
	}

}
