package iuh.fit.se;

public class Rectangle {
	// Khai bao
	private double length;
	private double width;
	public Rectangle () {
		this.length = 1.0;
		this.width = 1.0;
	}
	
	// Dieu kien
	public Rectangle (double length, double width){
		if (length <= 0 && width <= 0) {
			throw new IllegalArgumentException("Length and width must be greater than 0");
		}
		this.length = length;
		this.width = width;
	}
	
	//Phuong thuc tra ve cho thuoc tinh
	public double getLength () {
		return length;
	}
	public double getWidth () {
		return width;
	}
	
	//Phuong thuc gan gia tri moi cho thuoc tinh
	public void setLength (double NewVal) {
		if (NewVal <= 0) {
			throw new IllegalArgumentException("Length must be greater than 0");
		}
		this.length = NewVal;
	}
	public void setWidth (double NewVal) {
		if (NewVal <= 0) {
			throw new IllegalArgumentException("Width must be greater than 0");
		}
		this.width = NewVal;
	}
	
	//Tinh chu vi va dien tich cua hinh chu nhat
	public double getArea () {
		return length*width;
	}
	public double getPerimeter () {
		return 2*(length + width);
	}
	public String toString () {
		return "Rectangle[Length=" + length +
				", Width=" + width +
				", Perimeter=" + getPerimeter() +
				", Area=" + getArea() + "]";
	}
}


/**
 * @description OOP-Object-Oriented Programming
 * @author Le Khai Minh
 * @version 1.0
 * @created Aug 27, 202511:53:34 PM
 */