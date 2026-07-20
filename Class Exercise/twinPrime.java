public class twinPrime{
	public static void main(String[] args){

	
	int count = 2;
	

	while(count<=1000){
	int counter = 2;
	boolean prime = true;
		while(counter<=count){
		if(count%counter==0){
		prime = false; 
		break;}
		
		System.out.println(count);
		counter++;}

	count++;}

		if(prime) {
                System.out.println(count);}

		}
	
	} 


