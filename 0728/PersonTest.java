class PersonTest
{
	public static void main(String[] args){
		// 클래스 -> 객체를 만들 수 있음.
		Person p1 = new Person(); // 기본 생성자 호출
		p1.name = "이승재";
		p1.age = 26;
		p1.gender = '남';
		
		Person p2 = new Person(); // 기본 생성자 호출
		p2.name = "김영창";
		p2.age = 25;
		p2.gender = '남';
		
		Person p3 = new Person(); // 기본 생성자 호출
		System.out.println(p3.name); //null
		p3.name = "오다원";
		System.out.println(p3.name); // "오다원"

		Person p4 = new	Person("XXX"); // String 생성자 호출
		Person p5 = new Person(10); // int 생성자 호출
		Person p6 = new Person("박상훈", 25); // String, int 생성자 호출
		System.out.println("p6.name : "+p6.name+", p6.age : "+p6.age);
		Person p7 = new Person("이종표", 25, true); // String, int, boolean 생성자 호출
		Person p8 = new Person(12.5f, 'c');
	}
}