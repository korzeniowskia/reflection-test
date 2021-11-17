import java.util.Random;

public class Student {
  private String indexNumber;

  private static final Random random = new Random();

  public Student() {
    this.indexNumber = randomIndex();
  }

  private String randomIndex() {
    StringBuilder result = new StringBuilder(10);

    for (int i = 0; i < 10; i++) {
      char c = (char) (random.nextInt(90 - 65) + 65);
      result.append(c);
    }

    return result.toString();
  }

}
