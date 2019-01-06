
public class Variables {

  public static void main (String args[]) {
    int param1 =113;
    double param2=2.71828;
    String param3="Computer Science";
    System.out.println("This is room # "+param1);
    System.out.println("e is close to "+param2);
    System.out.println("I am learning a bit about "+param3);

    System.out.println(isOdd(2));
    printHelloWorld();
    System.out.println(greatestCommonFactor(9,6));
  }

  public static boolean isOdd (int param1){
     if (param1 %2==1){
       return true;
     }
     return false;
  }
  public static void printHelloWorld(){
    System.out.println("Hello World");
  }
  public static int greatestCommonFactor(int param1,int param2){
    if(param2==0)
      return param1;
    else{
      return greatestCommonFactor(param2,param1%param2);
    }
  }
}
