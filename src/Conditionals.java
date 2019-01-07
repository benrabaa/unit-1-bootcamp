
public class Conditionals {

  public static void main (String args[]) {

    System.out.println(isOdd(2));
    System.out.println(isMultipleOfThree(3));
    System.out.println(isOddAndIsMultipleOfThree(5));
    System.out.println(isOddAndIsMultipleOfThree2(6));
    fizzMultipleofThree(8);
    
    Person person1 = new Person();
    person1.setCity("London");
    person1.setName("Ben");
    System.out.println(fromLondon(person1));
    nameLongerThan5Characters(person1);
    System.out.println(cigarParty(20,true));
    System.out.println(caughtSpeeding(60,true));
    System.out.println(alarmClock(4,true));
    System.out.println(lotteryTicket(10,20,30));
    System.out.println(blackJack(20,44));
    System.out.println(evenlySpaced(1,2,3));
  }

  private static boolean isOdd(int n) {
    if (n % 2 != 0) {
      return true;
    }
    return false;
  }

  private static boolean isMultipleOfThree(int n) {
    if (n % 3 == 0) {
      return true;
    }
    return false;
  }

  private static boolean isOddAndIsMultipleOfThree(int n) {
    if (n % 2 != 0 && n % 3 == 0) {
      return true;
    }
    return false;
  }

  private static boolean isOddAndIsMultipleOfThree2(int n) {
    if (isOdd(n) && isMultipleOfThree(n)) {
      return true;
    }
    return false;
  }

  private static void fizzMultipleofThree(int n) {
    if (n % 3 == 0) {
      System.out.println("Fizz");
    } else {
      System.out.println(n);
    }
  }
  private static boolean fromLondon(Person person) {
    if (person.getCity().equals("London")) {
      return true;
    }
    return false;
  }
  private static void nameLongerThan5Characters(Person person) {
    if (person.getName().length() > 5) {
      System.out.println(person.getName());
    } else {
      System.out.println("Name is too short");
    }
  }
  private static boolean cigarParty(int cigarNumber, boolean Weekend) {
    if (Weekend && cigarNumber >= 40) {
      return true;
    } else if (cigarNumber >= 40 && cigarNumber <= 60) {
      return true;
    }
    return false;
  }

  private static int caughtSpeeding(int speeding, boolean birthday) {
    int ticket;
    if (speeding <= 60 && !birthday || speeding <= 65 && birthday) {
      ticket = 0;
    } else if (speeding <= 80 && !birthday || speeding <= 85 && birthday) {
      ticket = 1;
    } else {
      ticket = 2;
    }
    return ticket;
  }

  private static String alarmClock(int weekDay, boolean vacation) {

    String alarmRing = "off";
    switch (weekDay) {
      case 0:
      case 6:
        if (vacation) {
          alarmRing = "off";
          break;
        } else {
          alarmRing = "10:00";
          break;
        }
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
        if (vacation) {
          alarmRing = "10:00";
          break;
        } else {
          alarmRing = "7:00";
          break;
        }
    }
    return alarmRing;
  }

  private static int lotteryTicket(int a, int b, int c) {
    int result;
    if (a == b && a == c) {
      result = 20;
    } else if (a == b || a == c || b == c) {
      result = 10;
    } else {
      result = 0;
    }
    return result;
  }
  private static int blackJack(int cardsSum1, int cardsSum2) {
    int result = 0;
    if (cardsSum1 > 21 && cardsSum2 > 21) {
      return result;
    } else if (cardsSum1 < 22 && cardsSum1 > cardsSum2) {
      return cardsSum1;
    } else if (cardsSum2 < 22 && cardsSum2 > cardsSum1) {
      return cardsSum2;
    } else if (cardsSum1 > 21) {
      return cardsSum2;
    } else if (cardsSum2 > 21) {
      return cardsSum1;
    }
    return result;
  }
    private static boolean evenlySpaced(int a, int b, int c) {
        int abSpace = a - b;
        int baSpace = b - c;
        int acSpace = a - c;
        int cbSpace = c - b;
        int caSpace = c - a;
        return (abSpace == baSpace) || (acSpace == cbSpace) || (abSpace == caSpace);
    }


}
