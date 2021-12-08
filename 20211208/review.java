import java.util.ArrayList;
public class Main{

  public static void main(String[] args){
    int a=10, b=20;
    if(a<b){
      System.out.println(a);
      System.out.println(b);
    }
    boolean boo=a<b;
      if(boo){
           System.out.println("yes");
         }

    System.out.println("a+b="+(a+b));
    System.out.println(a-b);
    System.out.println(a*b);
    System.out.println(a/b);
    System.out.println(a%b);

  String[] day={"월","화","수","목","금","토","일"};
  for(int i=0;i<7;i++){
    System.out.println(day[i]);
  }
  String d="My name is Hayun";
  System.out.println(d.indexOf("is"));
  //문자열 시작 위치 인덱스 알려줌
  System.out.println(d.replaceAll("hayun","eomhayun"));
  System.out.println(d.substring(0,5));
  System.out.println(d.toUpperCase());
  System.out.println(d.toLowerCase());
  
  ArrayList array=new ArrayList();
  array.add("hi");
  array.add("hello");
  array.add("nice to meet you");
  System.out.println(array);
  array.add(2, "hihello");
  System.out.println(array);
  System.out.println(array.get(2));
  System.out.println(array.contains("hi"));
  System.out.println(array.size());
  System.out.println(array.remove(1));
  System.out.println(array.remove("hi"));
  System.out.println(array);
  ArrayList<String> arr=new ArrayList<String>();
  arr.add("hayun");
  arr.add("eom");
  String hayun=arr.get(0);
  String eom=arr.get(1);
  System.out.println(hayun);
  System.out.println(eom);

  
  } 
  

  

}

