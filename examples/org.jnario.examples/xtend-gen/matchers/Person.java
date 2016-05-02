package matchers;

/* @Data */@SuppressWarnings("all")
public class Person {
  private String name;
  
  private int age;
  
  @Override
  public String toString() {
    return (((this.name + "(") + Integer.valueOf(this.age)) + ")");
  }
}
