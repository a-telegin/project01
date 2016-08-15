public class SortCompany{
	public static void main(String[] args){
		Company [] companyArray = initCompanyArray(); 
	}
}

public Company[] initCompanyArray(){
	Company [] companyArray = new Company[10];
	
	Company metinvest = new Company;
	metinvest.setName("Metinvest");
	metinvest.setProfit(2512);
	metinvest.setAssets(31756);
	metinvest.setForbesListIndex(1);
	
	companyArray[0] = metinvest;
	
	Company privatbank = new Company;
	privatbank.setName("PrivatBank");
	privatbank.setProfit(749);
	privatbank.setAssets(204585);
	privatbank.setForbesListIndex(3);
	
	companyArray[1] = privatbank;
	
	Company motorsich = new Company;
	motorsich.setName("Motor Sich");
	motorsich.setProfit(1547);
	motorsich.setAssets(16041);
	motorsich.setForbesListIndex(8);
	
	companyArray[2] = motorsich;
	
	Company roshen = new Company;
	roshen.setName("Roshen");
	roshen.setProfit(1085);
	roshen.setAssets(6577);
	roshen.setForbesListIndex(13);
	
	companyArray[3] = roshen;
	
	Company philipmorris = new Company;
	philipmorris.setName("Philip Morris Ukraine");
	philipmorris.setProfit(746);
	philipmorris.setAssets(4137);
	philipmorris.setForbesListIndex(17);
	
	companyArray[4] = philipmorris;
	
	Company atb = new Company;
	atb.setName("ATB-Market");
	atb.setProfit(-181);
	atb.setAssets(5461);
	atb.setForbesListIndex(29);
	
	companyArray[5] = atb;
	
	Company epicentr = new Company;
	epicentr.setName("Epitsentr K");
	epicentr.setProfit(5273);
	epicentr.setAssets(11240);
	epicentr.setForbesListIndex(9);
	
	companyArray[6] = epicentr;
	
	Company ukrtatnafta = new Company;
	ukrtatnafta.setName("UkrTatNafta");
	ukrtatnafta.setProfit(104);
	ukrtatnafta.setAssets(8720);
	ukrtatnafta.setForbesListIndex(15);
	
	companyArray[7] = ukrtatnafta;
	
	Company kievstar = new Company;
	kievstar.setName("Kyivstar");
	kievstar.setProfit(2195);
	kievstar.setAssets(13513);
	kievstar.setForbesListIndex(4);
	
	companyArray[8] = kievstar;
	
	Company carlsberg = new Company;
	carlsberg.setName("Carlsberg Ukraine");
	carlsberg.setProfit(1456);
	carlsberg.setAssets(4065);
	carlsberg.setForbesListIndex(23);
	
	companyArray[9] = carlsberg;
}