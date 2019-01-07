
public class ClassesAndObjects {

  public static void main (String args[]) {


    Cat cat1 = new Cat("Garfield");
    cat1.setFavoriteFood("Lasagna");
    cat1.setAge(4);

    Cat cat2 = new Cat("Pink Panther");
    cat2.setFavoriteFood("Pizza");
    cat2.setAge(10);

    Cat cat3 = new Cat("Catwoman");
    cat3.setFavoriteFood("Hamburger");
    cat3.setAge(15);
    System.out.println(isOlder(cat1,cat2));
    makeBestFriends(cat2,cat3);
    makeKitten(cat1,cat2);

    Person person = new Person("john");
    adoption(cat1,person);
    adoption2(cat3,person);
    System.out.println(isFree(cat2));
    System.out.println(isSibling(cat1,cat2));
  }

  public static boolean isOlder(Cat cat1, Cat cat2) {
    int first = cat1.getAge();
    int second = cat2.getAge();
    if (first > second) {
      return true;
    }
    return false;
  }
  public static void makeBestFriends(Cat cat1, Cat cat2) {
    String food = "Pizza";
    cat1.setFavoriteFood(food);
    cat2.setFavoriteFood(food);
  }

  public static String makeKitten(Cat cat1, Cat cat2) {
    Cat newCat = new Cat();
    newCat.setName(cat1.getName() + cat2.getName());
    newCat.setAge(0);
    String newCatName = "a " + newCat.getClass().getSimpleName() + " named \"" + newCat.getName() + "\" with age " + newCat.getAge();
    return newCatName;
  }

  public static void adoption(Cat cat1, Person person1) {
      cat1.setOwner(person1);
      System.out.println(person1.getName() + " is now " + cat1.getName() + " owner!");
    }
  public static void adoption2(Cat cat1, Person person1) {
    if (cat1.getName().equals("Catwoman")) {
      System.out.println("Catwoman will never be anyone's pet!");
    } else {
      cat1.setOwner(person1);
      System.out.println(person1.getName() + " is now " + cat1.getName() + " owner!");
    }
  }

  public static boolean isFree(Cat cat) {
    if (cat.getOwner() != null) {
      return true;
    }
    return false;
  }

  public static boolean isSibling(Cat cat1, Cat cat2) {
    if (cat1.getOwner().equals(cat2.getOwner())) {
      return true;
    }
    return false;
  }

}

