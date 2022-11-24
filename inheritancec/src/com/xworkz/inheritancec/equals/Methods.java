package com.xworkz.inheritancec.equals;

public class Methods {

	public static void main(String[] args) {
		String str = "java is an object oriented language";
		String str1 = "HTML";

		System.out.println(str);
		str = str.concat(str1); // concat method
		System.out.println(str);

		System.out.println(System.lineSeparator());
		int length = str.length(); // length method
		System.out.println("length os string is " + str);

		System.out.println(System.lineSeparator());
		boolean result = str.equals(str1); // equals method, comapre
		System.out.println("both the string are equal " + result);

		System.out.println(System.lineSeparator());
		result = str.contains("object"); // contains method
		System.out.println(result);

		System.out.println(System.lineSeparator());
		String value = str.substring(4, 6); // substring method
		System.out.println("substring " + value);

		System.out.println(System.lineSeparator());
		int value1 = str.indexOf('o'); // indexOf()
		System.out.println("the index of character is " + value1);

		System.out.println(System.lineSeparator());
		int val = str.charAt(1); // charAt()
		System.out.println(val); ///

		System.out.println(System.lineSeparator());
		String sent = "  method removes any leading (starting) and trailing (ending) whitespaces from the specified string  ";
		value = sent.trim(); // trim()
		System.out.println(value);

		System.out.println(System.lineSeparator());
		String a = "method replaces each matching occurrence of the old character/text in the string with the new character/text";
		value = a.replace('m', 'M'); // replace()
		System.out.println(value);

		System.out.println(System.lineSeparator());
		String b = "method replaces each substring that matches the regex of the string with the specified text.";
		value = b.replaceAll("regex", "value"); // replaceAll()
		System.out.println(value);

		System.out.println(System.lineSeparator());
		String c = "Method Converts All Characters In The String To Lowercase Characters";
		value = c.toLowerCase(); // tolowercase()
		System.out.println(value);

		System.out.println(System.lineSeparator());
		String d = "method converts all characters in the string to uppercase characters";
		value = d.toUpperCase(); // touppercase()
		System.out.println(value);

		System.out.println(System.lineSeparator());
		String e = "method checks whether the string begins with the specified string or not";
		System.out.println(e.startsWith("method")); // strtswith()
		System.out.println(e.endsWith("not")); // endswith()

		System.out.println(System.lineSeparator());
		System.out.println(e.isEmpty());// isempty()

		System.out.println(System.lineSeparator());
		System.out.println(str1.hashCode()); // hashcode()

		System.out.println(System.lineSeparator());
		String first = "method returns a new string ";
		String second = "with the given elements joined with the specified delimiter";
		String ref = String.join(" ", first, second); // join()
		System.out.println(ref);

	}

}
