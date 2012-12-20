import java.io.Serializable;

/*
 * Person.java, Write.java, Read.java�̃T���v����
 * �V���A���C�Y�ƃf�V���A���C�Y�̃T���v��
 */

public class Person implements Serializable, Cloneable{

	private String firstName;
	private String lastName;
	//private int age; //transient �i���������Ȃ��i�V���A���C�Y�����Ȃ��j
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
