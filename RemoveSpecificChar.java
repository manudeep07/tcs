import java.util.*;
public class RemoveSpecificChar {
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
char ch=sc.next().charAt(0);
str=str.replace(Character.toString(ch),"");
System.out.println(str);
}
}
