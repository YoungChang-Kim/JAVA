package lab.itank.enumex;

import lab.itank.enumex.EnumEx01.Day;
import lab.itank.enumex.EnumEx01.Season;

public class EnumEx02 {
	
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
