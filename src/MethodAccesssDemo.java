
public class MethodAccesssDemo {
	public static void main(String[] args) {
//		int su = 345678;			//10진수
//		String result = Integer.toBinaryString(su);
//		System.out.println(result);
//		result = Integer.toHexString(su);
//		System.out.println(result);
		String msg = "Hello"; //msg 소속 charAt의 메소드라서 스트링의 주소 클래스. 메소드 즉 msg.charAt로 사용!
		char ch = msg.charAt(1);
		System.out.println("ch = " + ch );
	}
}
//static 있으면 class.method로 메인에서 주소 인스턴스화(객체선언) 안하고 바로 받아오면 됌

