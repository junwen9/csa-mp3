// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    Feeder f = new Feeder(1000);
    f.simulateOneDay(10);
    System.out.println(f.getcurentfood());

    
    f.simulateManyDays(15, 2);
    System.out.println(f.getcurentfood());
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}
