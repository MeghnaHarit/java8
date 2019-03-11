import java.util.Arrays;
import java.util.List;
public class LambdaDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Thread(new Runnable()
		{
			public void run()
			{
				System.out.println("Before java8, too much code for to little to do");
			}
		}).start();
		
		//java 8 way:
		new Thread( () -> System.out.println("In java8,Lambda expression rocks!!") ).start();
		System.out.println("________________*********************_______________");
		//iterating over list using lambda expressions
		
		List features = Arrays.asList("Lambdas","Default Method","Stream API", "Date and Time API");
		features.forEach(n -> System.out.println(n));
		System.out.println("_______________*********************________________");
		//even better use method reference feature of java 8 
		//method reference is denoted by ::(double colon) operator
		//looks similar to scope resolution operator of c++
		features.forEach(System.out::println );
	}

}
