package Square;

import java.lang.reflect.*;

public class Reflection10 {
 public static void main(String[] args) throws Exception {
 Square s = new Square(10,10);
 Method m = s.getClass().getDeclaredMethod("setLength", int.class);
 m.setAccessible(true);
 m.invoke(s, 86);
 System.out.println(s);
 }
}
