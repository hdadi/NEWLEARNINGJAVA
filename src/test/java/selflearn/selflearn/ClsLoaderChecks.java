package selflearn.selflearn;

public class ClsLoaderChecks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(ClsLoaderChecks.class.getClassLoader());
		System.out.println("hello world..");
		System.out.println(Thread.currentThread().getContextClassLoader());
		

	}

}
