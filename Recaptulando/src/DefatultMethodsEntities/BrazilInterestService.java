package DefatultMethodsEntities;

import java.security.InvalidParameterException;

public class BrazilInterestService implements InterestService{
	
public static Double taxa =2.0;


public BrazilInterestService() {
	
}
//public BrazilInterestService(Double taxa) {
	//super();
	//this.taxa = taxa;
//}

@Override
public double getTaxa() {
	return taxa;
}

public void setTaxa(Double taxa) {
	this.taxa = taxa;
}
/*public Double payment(double montante,int month) {
	if(month<1) {
		throw new InvalidParameterException("Digite um mês válido");
	}
	return montante*Math.pow(1+taxa/100, month);
}*/
}
