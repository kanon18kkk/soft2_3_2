package soft2_3_1;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		for(int i=1;i<101;i++) {
			System.out.print(i);
			if(i%15==0) {
				System.out.println(" FizzBuzz");
			}else if(i%5==0) {
				System.out.println(" Buzz");
			}else if(i%3==0) {
				System.out.println(" Fizz");
			}else {
				System.out.println();
			}
		}
		

	}

}
