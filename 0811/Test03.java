class Math{

	static int sum(byte x, byte y) {return(x+y);} // byte
	static int sum(short x, short y) {return(x+y);} // short
	static int sum(byte x, int y) {return(x+y);} // int
	static int sum(short x, int y) {return(x+y);} // int
	static int sum(int x, int y) {return(x+y);} // int
	static long sum(int x, long y) {return(x+y);} // long
	static float sum(long x, float y) {return(x+y);} // float
	static double sum(float x, double y) {return(x+y);} // double


	static double avg(double x, double y){
		return (x+y)/2;
	}
}

class Test03{
	public static void main(String[] args){
		System.out.println(Math.avg(3, 6));
	}

}