
public class SuperTest2 {

	
	public static void main(String[] args) {
		Child c = new Child();

		c.method();

	}

}


class Parent{
	int X =10;
}
  
  
class  Child extends Parent {
	int X =20;
	
	void method() {
		System.out.println("x=" + X);
		System.out.println("this.x = " + this.X);
		System.out.println("super.X=" + super.X);
	}
}
