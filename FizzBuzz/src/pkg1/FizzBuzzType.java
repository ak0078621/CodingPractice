package pkg1;

public class FizzBuzzType {
    
	public static void main(String[] args) {
		FizzBuzzType fizz = new FizzBuzzType();
		fizz.printTheNumbers();

	}

	private void printTheNumbers() {
		
		int fizz = 3;
		int buzz = 5;
		int fizzbuzz = 3*5;
		for(int i=1;i<=100;i++){
			if((i%fizzbuzz)==0){
				System.out.println("FizzBuzz");
			}else if(i%buzz==0){
				System.out.println("Buzz");
			}else if(i%fizz==0){
				System.out.println("Fizz");
			}else{
				System.out.println(i);
			}
		}
		
	}

}
