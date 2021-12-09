import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int sum=0;
    // 1~100합
    for(int i=1;i<=100;i++)
    {
      sum+=i;
    }
    System.out.print(sum);
  //1~10중 짝수합
    for(int j=0;j<=10;j++)
    {
      if(j%2==0){
        System.out.println(j);
      }
    }
  // 배열에서 차례대로 뽑아내기 
    String[] num= {"one","two","three"};
    for(String number:num){
      System.out.println(number);
    }

    // 숫자 스캔받아서 if문 switch문 돌리기
    Scanner scan=new Scanner(System.in);
    int score=0;
    score=scan.nextInt();
    if(score>=90){
      System.out.println("A");
    }
    else if(score>=80){
       System.out.println("B");
    }
    else if(score>=60){
       System.out.println("C");
    }
    else{
       System.out.println("F");
    }
    Scanner scan2=new Scanner(System.in);
    int month=scan2.nextInt();
    String season="";
    switch(month)
    {
      case 1: case 12: case 2: season="winter";break;
      case 3: case 4: case 5: season="spring";break;
      case 7: case 8: case 6: season="summer";break;
      case 9: case 10: case 11: season="fall";break;
    }
    System.out.println(season);
    
    int n=2;
    int s=0;
    do{
      s+=n;
      n++;
     
    }while(n<10);
     System.out.println(s);
  }
}