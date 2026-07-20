public class MethodQuestionSix{
	public static void main(String[] args){
		boolean isRangeValueResult = isRange(2,3,5);
		System.out.println(isRangeValueResult);
		

}

public static boolean isRange(int n, int low, int high){
	return (n >= low && n<= high);

}




}	