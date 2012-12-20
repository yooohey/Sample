import java.lang.reflect.Field;


public class Hack {

	/**
	 * @param args
	 * @throws NoSuchFieldException 
	 * @throws SecurityException 
	 * @throws IllegalAccessException 
	 * @throws IllegalArgumentException 
	 */
	public static void main(String[] args) throws SecurityException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
		String mail = "wada@jugem.co.jp";
		System.out.println(mail);
		Field nameField = mail.getClass().getDeclaredField("value");	//Stringのvalueフィールドのクラス情報を取得
		nameField.setAccessible(true);	//プロテクトを強制的に解除
		char[] c = {'h','o','g','e','@','d','h','w','g','e','.','n','e','.','j','p'};
		nameField.set(mail, c);
		System.out.println(mail);
	}

}
