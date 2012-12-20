import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class Refs {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 * @throws NoSuchMethodException 
	 * @throws SecurityException 
	 * @throws InvocationTargetException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws IllegalArgumentException 
	 */
	public static void main(String[] args) throws ClassNotFoundException, SecurityException, NoSuchMethodException, IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException {
		Class c = Class.forName("Person");
		Method method = null;
		method = c.getMethod("setFirstName", new Class[]{String.class});
		
		Constructor cons = null;
		cons = c.getConstructor(new Class[]{String.class, String.class});
		Object o = cons.newInstance(new Object[]{"atsushi","wada"}); //newÇµÇƒÇÈÇÃÇ∆ìØÇ∂Ç±Ç∆ñﬂÇËílÇÕObject,à¯êîÇÕObjectÇÃîzóÒå^
		Person p = (Person)o;
		System.out.println(p.getFirstName());
		method.invoke(o, "alan");
		System.out.println(p.getFirstName());
	}

}
