public class StringManipulation
{  
public static void main(String args[])
{  
String s1="dahlia";
char ch[]={'j','a','s','m','i','n','e'};  

String s2=new String(ch);
String s3=new String("rose");
System.out.println("string s1 : " +s1);  
System.out.println("string s2 : " +s2);  
System.out.println("string s3 : " +s3);  

System.out.println("//  METHOD -  length()");
int length =s2.length();
System.out.println("The length of the String \""+s2+"\" is: " +length);

System.out.println("//  METHOD -  concat()");
s2=s2.concat(" is a white flower. ");  
System.out.println(s2);

System.out.println("//  METHOD - charAt()");
char s=s1.charAt(2);
System.out.println("Character at position 2 of the string \""+s1+"\" is :  " + s);

System.out.println("//  METHOD - compareTo()");
System.out.println(s1.compareTo(s2));

System.out.println("//  METHOD - indexOf() , lastIndexOf()");
System.out.println("The string is : "+s2);
int firstIndex = s2.indexOf('a');
System.out.println("First occurrence of char 'a'  is found at : " + firstIndex);

int lastIndex = s2.lastIndexOf('a');
System.out.println("Last occurrence of char 'a' is found at : " + lastIndex);

System.out.println("//  METHOD - replace()");
System.out.println("Initial string is : "+s3);
String replaceString=s3.replace('r','n'); 
System.out.println("String after replace : "+replaceString); 

System.out.println("//  METHOD - valueOf()");
String  s4 = String.valueOf(ch, 0, 3);
System.out.println(s4);
}
}