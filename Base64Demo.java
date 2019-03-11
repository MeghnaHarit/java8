package JavaFeatures;

import java.util.Base64.Encoder;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Base64Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	java.util.Base64.Encoder encoder = Base64.getEncoder();
		String normalString = "username:password";
		String encodedString = encoder.encodeToString(normalString.getBytes(StandardCharsets.UTF_8));
		System.out.println(encodedString);
		System.out.println("************************************************");
		Base64.Decoder decoder = Base64.getDecoder();
		byte[] decodeByteArray = decoder.decode(encodedString);
		//verify the decoded string
		System.out.print(new String(decodeByteArray));
	}

}
