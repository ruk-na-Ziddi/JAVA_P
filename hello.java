class Hello {
	public static void main(String[] args){
		int a=10,b=20;
		String x="abcd",y="abcd";
		char c='x',ch='y';
		int[] numbers={1,2,3,4,5,6,7,8,9,10};
		char[] characters={'a','b','c','d','e','f','g','h','i','j'};
		String[] strings={"abc","bcd","cde","def","fgh","ghi","hij","ijk","klm","lmn"};
		String string="ankur pagal";
		System.out.println("Hello Class");
		System.out.println("------------------->"+string.length());
		AddClass.addTwoNo(a,b);
		AddChar.addTwoChar(x,y);
		AddCharToStr.addChatINString(x,c);
		CharString.charToString(c,ch);
		PrintArrayEle.printArrayElements(numbers);
		PrintCharArrayEle.printCharArrayElements(characters);
		PrintStringArrayEle.printStringArrayElements(strings);
		PrintStringEle.printStringElements(string);
	}
}

class AddClass {
	public static int addTwoNo(int a,int b){
		System.out.println("a = "+a+"  b = "+b+"   Sum is   = "+(a+b));
		return a+b;
	}
}

class AddChar {
	public static String addTwoChar(String a,String b){
		String d;
		System.out.println(a+b);
		return a+b;	
	}
}

class AddCharToStr {
	public static String addChatINString (String a, char b){
		System.out.println(a+b);
		return a+b;
	}
}

class CharString {
	public static String charToString (char a, char b){
		String s1=(String)""+a;
		String s2=(String)""+b;
		System.out.println(s1+s2);
		return s1+s1;
	}
}

class PrintArrayEle {
	public static void printArrayElements (int[] numbers){
		int i;
		for(i=0;i<10;++i){
			System.out.println("element at index=>"+i+" is ="+numbers[i]);
		}
	}
}

class PrintCharArrayEle {
	public static void printCharArrayElements (char[] characters){
		int i;
		for(i=0;i<10;++i){
			System.out.println("element at index=>"+i+" is ="+characters[i]);
		}
	}
}

class PrintStringArrayEle {
	public static void printStringArrayElements (String[] strings){
		int i;
		for(i=0;i<10;++i){
			System.out.println("element at index=>"+i+" is ="+strings[i]);
		}
	}
}

class PrintStringEle {
	public static void printStringElements (String string){
		int i;
		for(i=0;i<string.length();++i){
			char c=string.charAt(i);
			System.out.println("element at index=>"+i+" is ="+"["+c+"]");
		}
	}
}