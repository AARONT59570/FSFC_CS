package StringTesting;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "String1";
		String str2 = "String2";
		String str3 = new String("String1");
		Strings str4 = new Strings();
		Strings str5 = str4;
		Strings str6 = new Strings();
		System.out.println(Integer.toHexString(str1.hashCode()));
		System.out.println(Integer.toHexString(System.identityHashCode(str1)));
		System.out.println(str3.hashCode());
		System.out.println(str4.toString());
		System.out.println(Integer.toHexString(str4.hashCode()));
		System.out.println(Integer.toHexString(str5.hashCode()));
		System.out.println(Integer.toHexString(System.identityHashCode(str6)));
	}

}