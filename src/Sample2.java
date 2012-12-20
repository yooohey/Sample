
import java.util.ArrayList;
import java.util.List;


public class Sample2 implements Cloneable {
	
	private final int num;
	private final List list;
	
	public Sample2(int a, List b){
		this.num = a;
		this.list = b;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList lis1 = new ArrayList();
		lis1.add("hoge");
		Sample2 a = new Sample2(5, lis1);
		//Sample2 b = a.clone();
	}

}
