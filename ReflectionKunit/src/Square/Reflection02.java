package Square;

public class Reflection02 {
  public static void main(String[] args) {
    Square s = new Square(10,10);
    s.setLength(20);
    
  // s.squareB(); //if you uncomment this you will get a complier error
    short l = s.l;
    
  
  // long b = s.b; //if you uncomment this you will get a complier error
    System.out.println("s=" + s);
  }
}
