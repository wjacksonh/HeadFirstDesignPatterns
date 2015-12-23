package net.charter.wjackson.testfeatures;

public class TestJavaFeatures {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TestGeneric<String> s = new TestGeneric<String>("Some String");
		TestGeneric<Integer> I = new TestGeneric<Integer>(5);
		
		System.out.format("String is %s and Integer is %d%n", s.get(), I.get());
	}
}
