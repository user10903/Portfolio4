package Square;

import java.lang.reflect.*;

public class Reflection10 {

  public static void main(String [] args) throws Exception{
	Square s = new Square(0,0);
    Method m = s.getClass().getDeclaredMethod("setWidth", short.class);
    m.setAccessible(true);
    m.invoke(s, 100);
    System.out.println(s);
    
  }
}
 