import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
 * �V���A���C�Y�̃T���v��
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
			Person read = (Person) ois.readObject();	//�V���A���C�Y���ĂŃV���A���C�Y�������̂͊��S�ɕʂ̃C���X�^���X���R�s�[�����ƍl���Ă悢�B�܂�A�O�̃C���X�^���X���Q�Ƃ��Ă����l���R�s�[�����i�f�B�[�v�R�s�[�j
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
