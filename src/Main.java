
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		char[] wada = {'w','a','d','a'};
		char[] WADA = {'W','A','D','A'};
		Sample f = new Sample(wada);
		Sample g = new Sample(WADA);
		f.print();
		g.print();
		//f.mail[0] = 't';
		wada[0] = 't';
		f.print();
		g.print();
	}

}
