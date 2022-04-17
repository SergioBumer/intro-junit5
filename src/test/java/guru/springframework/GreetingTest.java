package guru.springframework;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class GreetingTest {
  Greeting greeting;

  @BeforeAll
  static void beforeAll() {
    System.out.println("Before - I am only called once!");
  }

  @BeforeEach
  void setUp() {
    System.out.println("In before Each");
    greeting = new Greeting();
  }

  @AfterEach
  void tearDown() {
    System.out.println("In AfterEach...");
  }

  @Test
  void helloWorld() {
    System.out.println(greeting.helloWorld());
  }

  @Test
  void testHelloWorld() {
    System.out.println(greeting.helloWorld("Sergio"));
  }

  @Test
  void testHelloWorld2() {
    System.out.println(greeting.helloWorld("Sam"));
  }

  @AfterAll
  static void afterClass() {
    System.out.println("After - I am only called once!");
  }
}