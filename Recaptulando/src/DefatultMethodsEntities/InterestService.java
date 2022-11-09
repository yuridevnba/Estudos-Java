package DefatultMethodsEntities;

import java.security.InvalidParameterException;

public interface InterestService {
	
	//public static 
	double getTaxa () ;
		//return 0;
	
		
	
	default Double payment(double montante,int month) {
	if(month<1) {
			throw new InvalidParameterException("Digite um mês válido");
		}
		return montante*Math.pow(1+getTaxa()/100, month);
	}

	}

