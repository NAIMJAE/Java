package sub1;

public class Test01 {

		int a;
		int b;
		int c;
		
		Test01(int a, int b){
			this.a=a;
			this.b=b;
		}
		
		public void add() {
			this.c= a+b;
		}
		public void show() {
			System.out.println("add : " + c);
		}
}

