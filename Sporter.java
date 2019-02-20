
public class Sporter {

	public static void main (String[] args) {
		
		Speler Harrie = new Speler("Harrie");
		Wedstrijd CL = new Wedstrijd();
		System.out.println("Zonder Harrie, winst?: " + CL.Winst);
		CL.Spelen(Harrie);
		System.out.println("Met Harrie, winst?: " +CL.Winst);
		System.out.println("kaartverkoop: " + CL.kaartverkoop("Harrie"));
		Club juv = new Club();
		System.out.println("Geld op de bank: " + juv.inkomsten(CL, CL.kaartverkoop("Harrie")));
		
		System.out.println("");
		
		Speler Henkie = new Speler("Henkie");
		Wedstrijd EL = new Wedstrijd();
		System.out.println("Zonder Henkie, winst?: " + EL.Winst);
		EL.Spelen(Henkie);
		System.out.println("Met Henkie, winst?: " +EL.Winst);
		System.out.println("kaartverkoop: " + EL.kaartverkoop("Henkie"));
		Club ars = new Club();
		System.out.println("Geld op de bank: " + ars.inkomsten(EL, EL.kaartverkoop("Henkie")));
		
		
		
	}//end main
}//endclass Sporter

class Speler{
	String voornaam;
	
	Speler (String naam){
		voornaam = naam;
		System.out.println(naam + "'s team ging een wedstrijd spelen");
	}//end constructor Speler
	
}//end class Speler

class Wedstrijd{
	boolean Winst;
	
	void Spelen(Speler naam) {
		System.out.println(naam.voornaam + " speelde mee");
		if(naam.voornaam == "Harrie") {
			Winst = true;
		}else {
			Winst = false;
		}//end if
	}//end Spelen
	
	int kaartverkoop(String deNaam) {
		if(deNaam == "Harrie") {
			return 80000;
		}
		else {
			return 60000;
		}
	} 
	  
}// end class Wedstrijd

class Club{
	int geldOpBank= 200000000;
	
	int inkomsten(Wedstrijd wedstrijd, int kaartverkoop) {
		geldOpBank += (kaartverkoop * 50);
		return geldOpBank;
	}
	
	
}//end class Club

