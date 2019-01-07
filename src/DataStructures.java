import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DataStructures {

  public static void main (String args[]) {

    ArrayList<Cat> allCats = new ArrayList<>();
    Cat cat1 = new Cat("Bo");
    Cat cat2 = new Cat("Bebe");
    Cat cat3 = new Cat("Soso");
    Cat cat4 = new Cat("Mike");
    Cat cat5 = new Cat("Jack");
    allCats.add(cat1);
    allCats.add(cat2);
    allCats.add(cat3);
    allCats.add(cat4);
    allCats.add(cat5);
    for (Cat cat : allCats) {
      System.out.println(cat.getName());
    }

    ArrayList<Integer> integersArrayList = new ArrayList<>();
    integersArrayList.add(1);
    integersArrayList.add(1);
    integersArrayList.add(2);
    integersArrayList.add(2);
    integersArrayList.add(3);
    integersArrayList.add(3);
    integersArrayList.add(3);

    ArrayList<String> stringArrayList = new ArrayList<>();
    stringArrayList.add("A");
    stringArrayList.add("B");
    stringArrayList.add("B");
    stringArrayList.add("C");
    stringArrayList.add("C");
    stringArrayList.add("C");
    stringArrayList.add("C");

    mostFrequentElement(integersArrayList);
    mostFrequentElement2(stringArrayList);

    HashMap<String, Integer> pursuitFellows = new HashMap<>();
    pursuitFellows.put("Ben", 20);
    pursuitFellows.put("Mohamed", 25);
    pursuitFellows.put("Ahmed", 33);
    pursuitFellows.put("Ali", 27);


    for (Map.Entry<String, Integer> entry : pursuitFellows.entrySet()) {
      String key = entry.getKey();
      int value = entry.getValue();
      System.out.println("Member: " + key + ", " + value + " years old.");
    }

  }


  public static void mostFrequentElement(ArrayList<Integer> numbersArrayList) {
    Map<Integer, Integer> allNumbersMap = new HashMap<>();

    for (int i = 0; i < numbersArrayList.size(); i++) {
      int key = numbersArrayList.get(i);
      if (allNumbersMap.containsKey(key)) {
        int frequency = allNumbersMap.get(key);
        frequency++;
        allNumbersMap.put(key, frequency);
      } else {
        allNumbersMap.put(key, 1);
      }
    }

    int maxCount = 0;
    int maxNumber = 0;
    for (Map.Entry<Integer, Integer> value : allNumbersMap.entrySet()) {
      if (maxCount < value.getValue()) {
        maxNumber = value.getKey();
        maxCount = value.getValue();
      }
    }
    System.out.println("Most Frequent Number: " + maxNumber);
    System.out.println("Count: " + maxCount);
  }

  public static void mostFrequentElement2(ArrayList<String> numbersArrayList) {
    Map<String, Integer> allNumbersMap = new HashMap<>();
    for (int i = 0; i < numbersArrayList.size(); i++) {
      String key = numbersArrayList.get(i);
      if (allNumbersMap.containsKey(key)) {
        int frequency = allNumbersMap.get(key);
        frequency++;
        allNumbersMap.put(key, frequency);
      } else {
        allNumbersMap.put(key, 1);
      }
    }

    int maxCount = 0;
    String maxNumber = "zero";
    for (Map.Entry<String, Integer> value : allNumbersMap.entrySet()) {
      if (maxCount < value.getValue()) {
        maxNumber = value.getKey();
        maxCount = value.getValue();
      }
    }
    System.out.println("Most Frequent String: " + maxNumber);
    System.out.println("Count: " + maxCount);
  }



  }
