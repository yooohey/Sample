
public class Sample {
	
	public int num;
	//public final String mail;
	private final char[] mail;
	
	public Sample(char[] m){
		this.mail = m.clone();
		//this.mail = m;
		
	}

	@Override
	public boolean equals(Object o){	//javaは引数の型を含めてoverrideを判断する
		boolean result = false;
		Sample o2 = (Sample)o;
		if(this.num == o2.num && this.mail != null && o2.mail != null){
			result = (new String(this.mail).toLowerCase()).equals(new String (o2.mail).toLowerCase());	//小文字にそろえて比較
			//result = this.mail.toLowerCase()==o2.mail.toLowerCase();	//小文字にそろえて比較
		}
		return result;
		//return this.mail.equals(o2.mail);
	}
	
	public void print(){
		System.out.println(this.mail);
	}
	/*@Override
	public boolean equals(Object o){	//javaは引数の型を含めてoverrideを判断する
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
		
		System.out.println("Sampleクラスのequalsの話---------------");
		System.out.println(f.equals((Object)g));	//親クラス(Objectクラス)の比較が走る(Object)の比較は==と同じ
		
		System.out.println("Integer クラスの==の話---------------");
		Integer num1 = new Integer(5);
		int num2 = 5;
		System.out.println(num1==num2);
		
		System.out.println("String クラスの話---------------");
		String a = "hoge";
		String b = "hoge";
		String d = "ho";
		String e = d + "ge";
		System.out.println(a == b);		//Stringだけは最適化が走る。同じインスタンスを使い回す。
		
		System.out.println(a == e);		//アドレス比較
		System.out.println(a.equals(e));	//equalsは値の比較
		
	}

}
