package lab.itank.enumex;

import jdk.javadoc.internal.doclets.formats.html.SectionName;

public class EnumEx03 {
	enum Season {
		SPRING("º½", "3 ~ 6¿ù"), SUMMER("¿©¸§", "7 ~ 8¿ù"), FALL("°¡À»", "9 ~ 11¿ù"), WINTER("°Ü¿ï", "12 ~ 2¿ù");
		
		String name;
		String term;
		
		Season(String name, String term){
			this.name = name;
			this.term = term;
		}
		
		String getName() {
			return name;
		}
		
		String getTerm() {
			return term;
		}
		
//		void setName(String name) {
//			this.name = name;
//		}
//		
//		void setTerm(String term) {
//			this.term = term;
//		}
	}
	
	public static void main(String[] args) {
		Season[] seasonArray = Season.values();
		
		for (Season season : seasonArray) {
			System.out.println(season);
		}
		
		System.out.println(Season.SPRING.getName());
		System.out.println(Season.SPRING.getTerm());
		
		//Season.SPRING.setName("º½º½º½");
		System.out.println(Season.SPRING.getName());
		
		for (Season season : seasonArray) {
			System.out.println(season.getName());
		}
	}
}
