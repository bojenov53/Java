package primoGestinale;

public class UtenteMain {

	public static void main(String[] args) {
		Utente pippo=new Utente(LivelloUtenteEnum.AMMINISTRATORE);
		//password troppo corta... Non valida!!
		pippo.setPassword("segreto");
		pippo.stampaDescrizione();
		
		
		//ora la pasword puo essere accettata
		pippo.setPassword("segreto12345");
		pippo.stampaDescrizione();
		
		
		Utente paperino=new Utente(LivelloUtenteEnum.STANDARD);
		paperino.setPassword("ilmiocodicediacesso");
		//utente sospeso
		paperino.sospendiUtente();
		paperino.stampaDescrizione();

	}

}
