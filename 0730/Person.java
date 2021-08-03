class Person
{
	// 메소드 오버로딩
	void play(int time){}
	void play(String where){}
	
	void play(int time, String where){}
	void play(String where, int time){}
}