package Square;
import static Square.KUnit.*;

public class TestSimple {
	
	void checkConstructorAndAccess() {
		Square s = new Square (5, 5);
		checkEquals(s.getLength(),5);
		checkEquals(s.getWidth(),5);
		checkNotEquals(s.getLength(),4);
		checkNotEquals(s.getWidth(),4);
		
	}



	void checkgetArea() {
		Square s=new Square(5,5);
		s.getArea();
		checkNotEquals(s.getArea(),5);
		checkEquals(s.getArea(),5);

		
	}
	
	public static void main(String[] args) {
		TestSimple ts=new TestSimple();
		ts.checkConstructorAndAccess();
		ts.checkgetArea();
		report();
		
	}

}
