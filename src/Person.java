import java.io.Serializable;

/*
 * Person.java, Write.java, Read.javaのサンプルは
 * シリアライズとデシリアライズのサンプル
 */

public class Person implements Serializable, Cloneable{

	private String firstName;
	private String lastName;
	//private int age; //transient 永続化させない（シリアライズさせない）
	private Person parent;
	
	public Person(String fn, String ln){
		this.firstName = fn;
		this.lastName = ln;
		//this.age = a;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
/*
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
*/
	public Person getParent() {
		return parent;
	}

	public void setParent(Person parent) {
		this.parent = parent;
	}
	
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}

}
