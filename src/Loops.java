
public class Loops {

  public static void main (String args[]) {
    from1to10();
    from1to10differentLoop();
    from1toN(100);
    evenfrom1toN(10);
    sum1to10();
    sum1toN(10);
    sum10000();
    printstringNtime(5,"Hello world");
    Fibonnaci(10);
    sumNumbers("aa114v3b33");
    notReplace("This is right");
  }
  public static void from1to10(){
    for (int i = 1; i <=10 ; i++) {
      System.out.println(i);
    }
  }
  public static void from1to10differentLoop(){
    int i=0;
    while( i<=10){
      System.out.println(i);
      i++;
    }
  }
  public static void from1toN(int param1){
    for (int i = 1; i <=param1 ; i++) {
      System.out.println(i);
    }
  }
  public static  void evenfrom1toN(int param1){
    for (int i = 1; i <=param1 ; i++) {
      if (i%2==0){
        System.out.println(i);
      }
    }
  }
  public static void sum1to10(){
    int sum=0;
    for (int i = 0; i <=10; i++) {
      sum+=i;
    }
    System.out.println(sum);
  }
  public static void sum1toN(int param1){
    int sum=0;
    for (int i = 0; i <=param1 ; i++) {
      sum+=i;
    }
    System.out.println(sum);
  }
  public static void sum10000(){
    sum1toN(10000);
  }
  public static void printstringNtime(int param1,String param2){
    if (param1>0){
      for (int i = 0; i <param1 ; i++) {
        System.out.print(param2);
      }
    }else{
      System.out.println("");
    }
  }
  public static void Fibonnaci(int n){
    int param1=0;
    int param2=1;
    int param3=param1+param2;
    int sum=param1+param2+param3;
    System.out.print(param1+","+param2+","+param3);
    while(param3<=n){
      param1=param2;
      param2=param3;
      param3=param1+param2;
      System.out.print(","+param3);
      sum+=param3;
    }
    System.out.println("the sum is "+sum);
  }

  public static void sumNumbers(String str){
    String tmp="";
    int sum=0;
    for (int i = 0; i < str.length(); i++) {
      if(Character.isDigit(str.charAt(i))) {
        if (i < str.length() - 1 && Character.isDigit(str.charAt(i + 1))) {
          tmp += str.charAt(i);
        } else {
          tmp += str.charAt(i);
          sum += Integer.parseInt(tmp);
          tmp = "";
        }
      }
    }
    System.out.println(sum);
  }
  public static void notReplace(String str){
    //for (int i = 0; i <str.length() ; i++) {
//      if(str.charAt(i)=='i' && str.charAt(i-1)==' '&& str.charAt(i+1)=='s' & i+1<str.length()){
       str.replace("is not","is");
      //}
    //}
    System.out.println(str);
  }
}
