package demo.inner;

public class AnonymeInnerClass {
	private String text = "\ntest";
	public AnonymeInnerClass(){
		
		Runnable run = new Runnable() {
			@Override
			public void run() {
				System.out.println("tu was" + text);
				System.out.println(this.getClass());
				System.out.println(AnonymeInnerClass.this.getClass());
			}};
			run.run();
		
	}
	public static void main(String[] args) {
		AnonymeInnerClass a = new AnonymeInnerClass();
	}
}
