package Square;

//w = width and l = length

public class Square{
	public short l;
	private short w;
	
	public Square(int l, int w) {
		this.l = (short) l;
		this.w = (short) w;
	}
	
	public short getLength() {
		return l;
	}
	public void setLength(int l) {
		this.l = (short) l;
	}
	public short getWidth() {
		return w;
	}
	public void setWidth(int w) {
		this.w = (short) w;
	}
	public short getArea() {
		return (short) (l*w);
	}
	
	public short getDiagonalLength() {
		return (short) Math.sqrt(w*l+w*l);
	}
	
	public String toString() {
		return String.format(("l: %d, w:%d"), l, w);
	}



	

}