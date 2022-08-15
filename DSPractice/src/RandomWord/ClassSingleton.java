package RandomWord;

public final class ClassSingleton {
	
	private static ClassSingleton INSTANCE;
	private String info = "initial info class";

	private ClassSingleton() {
	}
	
	public static ClassSingleton geInstance() {
		if(INSTANCE == null) {
			INSTANCE = new ClassSingleton();
		}
		
		return INSTANCE;
	}
}
