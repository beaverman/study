package testCases;

public class Execution {

	public static void main(String[] args) throws InterruptedException {
		ValidLogin runvalidlogin = new ValidLogin();
		runvalidlogin.Prepare();
		runvalidlogin.RunTest("pekelnuj.didko@gmail.com", "unreal tournament");
	}

}
