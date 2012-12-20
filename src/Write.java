import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
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
			Person alan = new Person("Alan","Teruyama", 6);
			alan.setParent(a2c);
			
			System.out.println(a2c.getAge());
			System.out.println(a2c.getFirstName());
			Person who = (Person) alan.clone();
			who.getParent().setAge(40);
			System.out.println(who.getParent().getAge());
			System.out.println(alan.getParent().getAge());
			
			FileOutputStream fos = new FileOutputStream("alan.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(alan);
			oos.close();
			
			FileInputStream fis = new FileInputStream("alan.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Person read = (Person) ois.readObject();	//シリアライズしてでシリアライズしたものは完全に別のインスタンスがコピーされると考えてよい。つまり、前のインスタンスが参照していた値もコピーされる（ディープコピー）
			System.out.println("read : "+read.getParent().getAge());
			System.out.println("who : "+who.getParent().getAge());
			System.out.println("alan : "+alan.getParent().getAge());
			read.getParent().setAge(80);
			System.out.println("and changed parent's age -----");
			System.out.println("read : "+read.getParent().getAge());
			System.out.println("who : "+who.getParent().getAge());
			System.out.println("alan : "+alan.getParent().getAge());
		}catch(Exception e){
			System.out.println("miss!"+ e);
		}
		System.out.println("success!!");
	}

}
