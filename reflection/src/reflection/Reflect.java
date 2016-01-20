package reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflect {
	
	public static void main(String[] args) {
		Class reflectClass = Ben.class;
		String className = reflectClass.getName();
		String meth = "setText";
		Ben ben = new Ben();
		try {
			Method method = reflectClass.getDeclaredMethod(meth);
			try {
				method.invoke(ben);
			} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {

				e.printStackTrace();
			}
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}
		System.out.println(ben.getText());
	}
}
