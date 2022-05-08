
public class countryArray {
	public static void main(String[] args) {
		country country[] = new country [2] ;
		
		country[0] = new country("Wales",20761 , 3063000) ;	
		country[1] = new country("Greece",131957 , 11030000) ;
		
		for (int i= 0 ; i < country.length ; i++) {	
			System.out.println(country[i]);
		}
	}
}
