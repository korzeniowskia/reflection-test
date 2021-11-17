import java.lang.reflect.Field;

public class Main {

  public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException {
    Student student = new Student();
    Field indexField = Student.class.getDeclaredField("indexNumber");
    indexField.setAccessible(true);

    System.out.println(indexField.get(student));
  }
}
