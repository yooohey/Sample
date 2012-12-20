
public class Sample {
	
	public int num;
	//public final String mail;
	private final char[] mail;
	
	public Sample(char[] m){
		this.mail = m.clone();
		//this.mail = m;
		
	}

	@Override
	public boolean equals(Object o){	//java�͈����̌^���܂߂�override�𔻒f����
		boolean result = false;
		Sample o2 = (Sample)o;
		if(this.num == o2.num && this.mail != null && o2.mail != null){
			result = (new String(this.mail).toLowerCase()).equals(new String (o2.mail).toLowerCase());	//�������ɂ��낦�Ĕ�r
			//result = this.mail.toLowerCase()==o2.mail.toLowerCase();	//�������ɂ��낦�Ĕ�r
		}
		return result;
		//return this.mail.equals(o2.mail);
	}
	
	public void print(){
		System.out.println(this.mail);
	}
	/*@Override
	public boolean equals(Object o){	//java�͈����̌^���܂߂�override�𔻒f����
		Sample o2 = (Sample)o;
		return this.num == o2.num;
	}*/
	public static void main(String[] args) {
		char[] wada = {'w','a','d','a'};
		char[] WADA = {'W','A','D','A'};
		Sample f = new Sample(wada);
		Sample g = new Sample(WADA);
		f.print();
		g.print();
		wada[0] = 't';
		f.print();
		g.print();
		
		f.num = 5;
		g.num = 5;
		//f.mail = "sample@sample.co.jp";
		//g.mail = "SAMPLE@SAMPLE.CO.JP";
		System.out.println(f.equals((Object)g));
		//g.mail = "samplesample@sample.co.jp";
		System.out.println(f.equals((Object)g));
		
		System.out.println("Sample�N���X��equals�̘b---------------");
		System.out.println(f.equals((Object)g));	//�e�N���X(Object�N���X)�̔�r������(Object)�̔�r��==�Ɠ���
		
		System.out.println("Integer �N���X��==�̘b---------------");
		Integer num1 = new Integer(5);
		int num2 = 5;
		System.out.println(num1==num2);
		
		System.out.println("String �N���X�̘b---------------");
		String a = "hoge";
		String b = "hoge";
		String d = "ho";
		String e = d + "ge";
		System.out.println(a == b);		//String�����͍œK��������B�����C���X�^���X���g���񂷁B
		
		System.out.println(a == e);		//�A�h���X��r
		System.out.println(a.equals(e));	//equals�͒l�̔�r
		
	}

}
