package kr.ac.kookmin.shape;

public class Ellipse extends Shape{
	private int w;
	private int h;
	public Rectangle getBounds(){
		return new Rectangle(center, w*2, h*2);
	}
	public Ellipse(Point center, int w, int h){
		super(center);
		this.w = w;
		this.h = h;
		this.center = center;
	}

	public void draw(Graphics g) {
		g.draw(this);
	}
	
	public String toString() {
		return "Ellipse";
	}
}

