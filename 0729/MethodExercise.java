class MethodExercise
{
	void a(){}
	void b(int number){}
	void c(double number){}
	void d(boolean trueOrFalse){}
	void e(char oneWord){}
	void f(String word){}

	void g(int num01, int num02){}
	void h(String s01, char s02, int num){}

	void callAllMethod(){
		a();
		b(1);
		c(2.1);
		d(true);
		e('a');
		f("ab");
		g(1, 2);
		h("ab", 'a', 3);
	}
}