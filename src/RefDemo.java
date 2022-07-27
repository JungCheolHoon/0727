import java.util.*;

public class RefDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		
		Student hojun = new Student();
		hojun.name = name;
		hojun.age = age;
		System.out.println("호준의 이름 : " + hojun.name);
		System.out.println("호준의 나이 : " +hojun.age);
		
		Student jimin = hojun;
//		Student jimin = new Student();
//		jimin.name = hojun.name;		//주소복사
//		jimin.age = hojun.age;			//값복사
		
		System.out.println("지민의 이름 : " + jimin.name);
		System.out.println("지민의 나이 : " + jimin.age);
	}
}
