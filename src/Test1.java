import java.util.*;

public class Test1 {
	public static void main(String[] args) {
		Employee some = new Employee();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("사원번호 : ");
		some.empno = sc.nextInt();
		sc.nextLine();
		
		System.out.print("사원이름 : ");
		some.ename = sc.nextLine();
		
		System.out.print("출생연도 : ");
		some.birthYear = sc.nextInt();
		int age = 2023 - some.birthYear;
		
		System.out.print("사원월급 : ");
		some.salary = sc.nextInt();
		sc.nextLine();
		
		System.out.print("사원이메일 : ");
		some.email = sc.nextLine();
		
		System.out.print("사원전화번호 : ");
		some.tel = sc.nextLine();
		
		System.out.print("정규직 : ");
		some.flag = sc.nextBoolean();
		
		System.out.println("사원번호 : " + some.empno);
		System.out.println("사원이름 : " + some.ename);
		System.out.println("사원나이 : " + age);
		System.out.println("사원월급 : " + some.salary + "만원");
		System.out.println("사원이메일 : " + some.email);
		System.out.println("사원전화번호 : " + some.tel);
		System.out.println("정규직 : " + some.flag);
		
	}
}

