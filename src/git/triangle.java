package git;

public class triangle {

	private int height;
	private int base;
	
	public triangle(int height,int width){
		this.height=height;
		this.base=width;
	}
	
	public float getArea(){
		return (float) (.5*this.base*this.height);
	}
	
	public static void main(String[] args){
	triangle a = new triangle(4,2);
	System.out.println(a.getArea());
		
	}
}
