package Quiz;

public class quiz01 {
	int z;
	public static void main(String[] args) {
		quiz01 qu=new quiz01();
		int z=6;
		System.out.print(z);
		qu.method();
		System.out.print(z);
		System.out.print(qu.z);
	}
	
	void method() {
		int z=5;
		method2();
		System.out.print(z);
	}
	
	void method2() {
		z=4; //此處的 z 為 line4定義的 z
	}
}
