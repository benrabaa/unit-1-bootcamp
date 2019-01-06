
public class Methods {

  public static void main (String args[]) {
    System.out.println(calculateSquare(4));
    System.out.println(calculateSquareRoot(16));
    System.out.println(toLowerCase("HALLO WORLD"));
    System.out.println(isMultiple(2,3));
    System.out.println(isMultiple(2,4));
    System.out.println(isMultiple(5,100));
    System.out.println(isMultiple(5,101));
    prettyInteger(10);
    System.out.println(Random(0,5));

  }

  public static double calculateSquare(int param1){
    return ( Math.pow(param1, 2));
  }

  public static double calculateSquareRoot(int param1){
    return ( Math.sqrt(param1));
  }
  public static String toLowerCase(String str){
    return str.toLowerCase();
  }
  public static  boolean isMultiple(int param1, int param2){
    if(param2%param1==0){
      return true;
    }else {
      return  false;
    }
  }
  public  static void prettyInteger(int param1){
    for (int i = 0; i < param1*2+1; i++) {
      if (i==param1){
        System.out.print(" "+param1+" ");
      }else{
        System.out.print("*");
      }
    }
  }

  public static int Random(int param1, int param2){
    return((int)(Math.random()*((param2-param1))+1)+param1);

  }
}
