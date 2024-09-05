
import java.util.ArrayList;

public class Main {
  
  // Part01. Create a class Person
  // Part02. Create a class Student, which inherits the class Person.
  //         At creation, a student has 0 study credits. Every time a student studies, the amount of study credits goes up.
  // Part03. Write a version of toString method specifically for the Student class.
  // Part04. Create a class Teacher, which inherits the class Person.
  // Part05. Write a method public static void printPersons(ArrayList<Person> persons).

  public static void main(String[] args) {

    ArrayList<Person> persons = new ArrayList<Person>();
    Teacher ada = new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200);
    Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");

    int i = 0;
    while (i < 25) {
      ollie.study();
      i = i + 1;
    }

    persons.add(ada);
    persons.add(ollie);

    printPersons(persons);
  }

  public static void printPersons(ArrayList<Person> persons) {
    for (Person percorre : persons) {
      System.out.println(percorre);
    }
  }

}
