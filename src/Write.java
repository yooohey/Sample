import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/*
 * シリアライズのサンプル
 */

public class Write {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try{
			Person a2c = new Person("Atsushi","Wada", 35);
			
			System.out.println(a2c.getAge());
			System.out.println(a2c.getFirstName());
			
			FileOutputStream fos = new FileOutputStream("wada.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(a2c);
			oos.close();
		}catch(Exception e){
			System.out.println("miss!"+ e);
		}
		System.out.println("success!!");
	}

}
