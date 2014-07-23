public class HomeWork7_23 {
	public static void main(String[] args) {
		TestA testa = new TestA();
		TestB testb = new TestB();
		Object[] test = {testa,testb};
		Factory.create(test);
	}
}

class TestA{
	void methodA() {
		System.out.println("TestA");
	}
}

class TestB{
	void methodB() {
		System.out.println("TestB");
	}
}

class Factory {
	static void create(Object[] test) {
		if () {
			test[0].method();
		} else {
			TestB testb = (TestB) test;
			testb.methodB();
		}
	}
}