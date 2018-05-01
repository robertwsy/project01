package exception;

public class Testcustom {
	public static void test()throws custom{
		throw new custom("自定义异常");
	}
	public static void main(String args[]){
		try {
			test();
		} catch (custom e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
