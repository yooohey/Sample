import java.io.FileInputStream;
import java.io.ObjectInputStream;

/*
 * デシリアライズのサンプル
 */

public class Read {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try{
			
			
			FileInputStream fis = new FileInputStream("alan.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Object who = ois.readObject();
			ois.close();
			if(who instanceof Person){
				System.out.println("read success!");
				Person p = (Person)who;
				System.out.println(p.getFirstName());
				System.out.println(p.getLastName());
				System.out.println(p.getAge());
				System.out.println(p.getParent().getFirstName());
				System.out.println(p.getParent().getLastName());
				System.out.println(p.getParent().getAge());
				
			}
			
		}catch(Exception e){
			System.out.println("miss! : "+e);
		}
	}

}
