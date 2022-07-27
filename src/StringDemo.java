//c언어는 메모리의 위치를 알아서 재활용이 가능하지만 java는 메모리는 위치를 몰라 주소를 재활용하는 것이 처음부터 불가능한거 아닌가?
public class StringDemo {
	public static void main(String[] args) {
//		String name; 						//선언, declaration
//		name = "한지민"; 				//할당 , Assignment  
//		System.out.printf("이름 = %s\n" , name);
		
//		String name = new String("한지민");
//		System.out.printf("이름 = %s\n" , name);
		
		Student jimin;						//declaration 선언
		jimin = new Student(); 			//Assignment
		jimin.name = "한지민";			//한지민 번지
		jimin.age = 26;
		
		Student chulsu = new Student();
		chulsu.name = "김철수";		//김철수 번지
		chulsu.age = 36;
		
		Student younghee = new Student();
		younghee.name = "이영희";	//이영희 번지
		younghee.age = 46;
		
		System.out.println("한지민 학생 정보");
		System.out.printf("이름 = %s , 나이 = %d\n ",jimin.name , jimin.age);
		System.out.printf("이름 = %s , 나이 = %d\n ",chulsu.name , chulsu.age);
		System.out.printf("이름 = %s , 나이 = %d\n ",younghee.name , younghee.age);
		
		//String name = "한지민";		//초기화, initialization
		
	}
}