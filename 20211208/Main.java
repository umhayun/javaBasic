
/*List 리스트
  배열과 비슷한 자료형, 크기가 정해지지 않고 동적으로 변한다.
  배열은 그 크기가 생성시에 정해지지만 리스트는 그 크기가 정해지지 않아 원하는 만큼 자유롭게 담을 수 있다. 

  ArrayList 

*/
import java.util.ArrayList;
class Main{
  public static void main (String[] args){
    ArrayList pitches=new ArrayList();

  }
}






/*
배열 array - 여러개의 원소를 한번에 담는 자료형
             자료의 집합이다.
             배열은 그 길이가 고정된다.
             즉 한번 생성하면 길이를 수정할 수 없다.

int engscorekim=80; //1개만 저장
int[] engScore={80,90,70,65,100};
String[] names={"ha","yun","son","eom"};

*/
// class Main{
//   public static void main(String[] args){
//     String[] weeks= new String[7];
//     weeks[0]="월";
//     weeks[1]="화";
//     weeks[2]="수";
//     weeks[3]="목";
//     weeks[4]="금";
//     weeks[5]="토";
//     weeks[6]="일";
//     int i=0;
//     // String[] weeks={"월","화","수","목","금","토","일"};
//   for(i=0; i<weeks.length;i++){
//     System.out.println(weeks[i]);
//   }
//   int j=0;
//   while(j<7){
//     System.out.println(weeks[j]);
//     j++;
//   }
//   System.out.println(weeks[7])
//   //ArrayIndexOutOfBoundsException "예외"
//   //인덱스가 없는 위치로 지정하면 오류 

//   }
// }

//반복문(for,while, (do~while))







//char '문자' 작은 따옴표 사용\
// class Main{
//   public static void main (String[] args){
//     char a='a';
//     char b=97; //ascII코드로 변환하여 표시
//     char c=122;
//     System.out.println(a);
//     System.out.println(b);
//     System.out.println(c);
//   }
// }



/*
Bool(불 Boolean) true 1(0이 아닌 모든것), false 0


*/

// class Main{

//   public static void main(String[] args){
//     int base=100;
//     int height=185;
//     boolean isTall=height<base;
//     if(isTall){
//       System.out.println("키가 큽니다.");
//     }

    
//   }
// }





/*
String 문자열, 글자들
"Hello World"
"a"
"12345"
String a=new String("Hello World");
//원래는 위와 같은 표현을 사용해야 하는 것이 원칙이나
String a="Hello World";
//String은 자바에서 특별취급을 하여 간단하게 사용할 수 있다.

*/
//문자열에서 많이 사용되는 메서드.
  //equals(***) 두개의 문자열이 동일한지 비교하여 결과 리턴
  //






// class Main{
//   public static void main(String[] args){
//     String a= "hello";
//     String b="java";
//     String c="hello";

//     System.out.println(a.equals(b));
//     System.out.println(a.equals(c));
    
    
//   }

// }


//indexOf 문자열에 특정 문자가 시작되는 위치(인덱스)를 리턴
//띄어쓰기 문자취급
//0부터 시작
//이하보다는 미만 표현


// class Main{
//   public static void main(String[] args){
//     String a="Hello World";
//     System.out.println(a.indexOf("World"));

//   }
// }


//replaceAll 문자열 중 특정 문자열을 다른 문자열로 치환
// class Main{
//   public static void main(String[] args){
//     String a="Hello World";
//     System.out.println(a.replaceAll("World", "Java"));
//   }
// }

//substring 문자열 중 특정 부분을 뽑아낼 경우 사용한다.

// class Main{
//   public static void main (String[] args){
//     String a="Hello World";
//     System.out.print(a.substring(0,4));
//     //끝 위치느 포함하지 않는다. 즉 ~미만

//   }
// }

//toUpperCase 모든 문자열을 대문자로 변환
//toLowerCase 모든 문자열을 소문자로 변환

// class Main{
//   public static void main (String[] args){
//     String a="Hello World";
//     System.out.println(a.toUpperCase());
//     System.out.println(a.toLowerCase());
//     //끝 위치는 포함하지 않는다. 즉 ~미만

//   }
// }









/*
변수 : 어떤 값을 보관하는 용도

int a; a라는 변수명에 정수를 보관할것이다.
String b; b라는 변수명에 문자열을 보관할 것이다.

변수명 선언 규칙
1. 변수명은 숫자로는 시작할 수 없다. a100(o) 100a(x)
2. _ underscore $ 는 사용가능하지만 @ ! 사용 못한다.
3.예약어는 변수명으로 사용할 수 없다.(int,class....(X))
*. 한글은 사용하지 않는다. 가급적 소문자로 만든다.

잘못된 변수명 선언예
int 2nd;
String b#;
int main;

자료형 (type)
int a; //변수명 a는 int자료형 변수임으로 a라는변수에는 정수만 담을 수 있다.(1,2,10,300.....)
String b; //변수명 b는 String 자료형 변수임으로 b라는 변수에는 문자열만 담을 수 있다."boy","hello"


클래스 - 자바는 클래스 단위로 프로그램을 구성한다.
        클래스명은 명사로 만든다.
        여러개의 단어로 만들경우 각 단어의 첫문자느 대문자로 만든다.
        ex) class Raster{}
            class ImageSprite{}
메서드 - 하나의 클래스 안에는 메서드가 여러개 존재 할 수 있다.
        매서드명은 주로 동사로 만든다.
        여러개의 단어로 만들 경우 처음 시작하는 문자는 소문자로 시작하고 두번째 단어부터는 대문자를 사용한다.
        ex) run{};
            runFast{};
            getBackground{};
  * 권장사항 : 변수명은 짧지만 의미가 있게 만든다.
              (변수명을 통해 사용 의도를 알 수 있다.)

# 숫자 자료형(number, integer)
  정수(1,10,50...), 실수(3.14,7.8....)

  /정수/ 
    int(***) int age=25;
    long(큰수) long countStar=32324141515351235123L;
  /실수/
    float float pi=3.14F;
    double double morePi=3.141592;



*/
// class Main{
//   public static void main(String[] args){
//     int i = 0;
//     System.out.println(++i); //하나 증가하고 출력 선증가
//     System.out.println(i++); //출력하고 하나 증가 후증가
//     System.out.println(i);
    

//     // int i=0;
//     // int j=10;

//     //  i++;//하나증가   i=i+1; i+=1;
//     //  j--;//하나 감소j=j+1; j-=1;

//     // System.out.println(i);
//     // System.out.println(j);

//     // i++;
//     // ++i;

//     // j--;
//     // --j;
    



//     // int a=10;
//     // int b=5;
//     // System.out.println(a+b);
//     // System.out.println(a-b);
//     // System.out.println(a*b);
//     // System.out.println(a/b);
//     // //나머지 연산자(홀,짝, 배수 찾기)
//     // System.out.println(a%b);
//     // System.out.println(7%2); //홀수
//     // System.out.println(6%2);//짝수
//     // System.out.println(6%3);//배수 나눈수의 배수0


    

//   }
// }








/*
//클래스 블록 : 소스코드의 가장 바깥쪽 블록
class Main{
  //클래스명은 파일명과 반드시 동일해야 한다.
  //메서드 블록(기능을 정의)
  //main 메서드가 프로그램 전체의 시작점이다.
  public static void main(String[] args){
    //public 접근제어자 public 모두 접근가능
    //static 객체를 생성하지 않고도 사용 가능
    //void 리턴값이 없음을 의미한다.
    //[]배열 의미 String 문자열 args 변수들
    System.out.println("Hello World");
    //명령문은 반드시 세미콜론(;)으로 구문의 끝을 나타낸다.   
  }

}
*/






//주석 comment : 코드에 대한 설명을 적는다.
//              주석은 컴퓨터는 읽지 않는다.
//              코드의 실행을 잠시 멈추고 문제점을 파악하는 용도로도 사용

//클래스 선언(라인 주석)
// class Main {
//   public static void main(String[] args) {
//     System.out.println("Hello world!"); //hello world를 출력한다.
    
//   }
// }

/* (블럭 주석)
작성자:엄하윤
작성일:2021.12.08
*/

