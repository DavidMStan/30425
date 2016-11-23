package javasmmr.zoowsome.services.factories;

public class Utiles {

	public static long generateId(){//generate an id from 13/14 digits
		
		return (long) (((double) 1e14 )* Math.random()) ;
	}
	
	public static int nrOfDigits(long nr){
		
		int nrOfDigitsOfNr = 0;
		long copyOfNr = nr;
		
		while(copyOfNr > 0){
			nrOfDigitsOfNr++;
			copyOfNr /= 10;
		}
		
		return nrOfDigitsOfNr;
	}
}
