package hello;

public class JavaHello {

	public static void main(String[] args) {
		System.out.println("Hello from Java");
		HelloKt.kprint("Java call Kotlin");
	}

	public static void jprint(String message) {
		System.out.println(message);
	}

}
