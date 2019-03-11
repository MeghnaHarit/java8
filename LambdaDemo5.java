import java.util.HashMap;
import java.util.Map;
public class LambdaDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<String, String> books = new HashMap<> ();
books.put("Let Us C", "Yashwant Kanetkar");
books.put("oop java", "Simon Kendal");
books.put("java:GUI", "David Etheridge");
books.forEach((key, value) -> System.out.println("Book Name:- " + key + ",Author:- " + value));
System.out.println();
books.forEach((key, value) -> {
	System.out.println("Book Name:- " + key + " Author:- " + value);
});
System.out.println();
	}

}
