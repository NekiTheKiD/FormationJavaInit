package ExempleInterface;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {

		List<A> listA = new ArrayList<>();
		List<B> listB = new ArrayList<>();
		List<C> listC = new ArrayList<>();
		List<D> listD = new ArrayList<>();
		
		List<ITest> myList = new ArrayList<>();
		
		myList.add(new A());
		myList.add(new B());
		myList.add(new C());
		myList.add(new D());
		myList.add(new E());
		
		MyMethode(new A());
		MyMethode(new B());
		MyMethode(new C());
		MyMethode(new D());
		MyMethode(new E());

	}

	public static void MethodeA(A a) {

	}

	public static void MethodeB(B b) {

	}

	public static void MethodeC(C c) {

	}

	public static void MethodeD(D d) {

	}
	
	public static void MyMethode(ITest i) {

	}

}
