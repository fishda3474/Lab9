import java.io.*;
import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    ArrayList<Person> people = new ArrayList<Person>(); //initialize the arraylist

    //Adding all my people to my arraylist
    people.add(new Person("Devin", 21, "orange"));
    people.add(new Person("A", 87, "pink"));
    people.add(new Person("B", 13, "yellow"));
    people.add(new Person("C", 55, "black"));
    people.add(new Person("D", 4, "green"));

    //try statement to write my arraylist to a text file.
    try {
      FileWriter w = new FileWriter("data.txt");
      BufferedWriter output = new BufferedWriter(w);

      for(int i = 0; i < people.size(); i++) {
        output.write(people.get(i).getName());
        output.newLine();
        output.write(Integer.toString(people.get(i).getAge()));
        output.newLine();
        output.write(people.get(i).getColor());
        output.newLine();
        output.flush(); 
      } 
      output.close();
    }
    //catch statement
    catch (IOException exception) {
        System.out.println("There was an error." + exception);
    }

    //now we repeat the process to read the same file.
    try {
      FileReader r = new FileReader("data.txt");
      BufferedReader reader = new BufferedReader(r);

      while (reader.ready()) {
        String name = reader.readLine();
        String age = reader.readLine();
        String color = reader.readLine();

        System.out.printf("%-10s %-10s %-10s %n", name, age, color);
      }
      reader.close();
    } 
    //catch statement
    catch (IOException exception) {
        System.out.println("There was an error." + exception);
    }
  }
}