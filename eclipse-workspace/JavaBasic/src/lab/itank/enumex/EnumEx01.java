package lab.itank.enumex;

//한정된 값만을 갖는 데이터 타입
public class EnumEx01 {
	
	enum Season {
		SPRING, SUMMER, FALL, WINTER
	}
	
	enum Day {
		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURDAY, FRIDAY, SATURDAY
	}
	
	public static void main(String[] args) {
		Season season = null;
		
		season = Season.SPRING;
		season = Season.FALL;
		
		System.out.println(season);
		System.out.println();
		Day[] days = Day.values();
		
		for (Day day : days) {
			System.out.println(day);
		}
	}
}
