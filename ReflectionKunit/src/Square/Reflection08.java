package Square;

import java.lang.reflect.Field;

public class Reflection08 {
  
  public static void main(String[] args) throws Exception{
	Square s = new Square(10,10);
    Field [] fields = s.getClass().getDeclaredFields();
    System.out.printf("There are %d fields\n", fields.length);
    for(Field f : fields) {
      f.setAccessible(true);
      long x = f.getShort(s);
      x++;
      f.setShort(s, (short) x);
      System.out.printf("field name=%s type=%s value=%d\n", 
          f.getName(), f.getType(), f.getShort(s));
          
    }
  }

}
