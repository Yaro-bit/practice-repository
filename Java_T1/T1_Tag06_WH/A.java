package wifi.kurs;

public class A {
  public A() {
	  
  }
  
  void testMethod() {
	  System.out.println("in testMethod");
  }
  
  public static A getInstance() {
	  //return new A();
	  // return null;
	  return new MyA();
  }
}
