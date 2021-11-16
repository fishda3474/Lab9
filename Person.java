class Person {
  private String name;
  private int age;
  private String color;

  Person(String cName, int cAge, String cColor) {
    name = cName;
    age = cAge;
    color = cColor;
  }

  String getName() {
    return name;
  }

  int getAge() {
    return age;
  }

  String getColor() {
    return color;
  }
}
