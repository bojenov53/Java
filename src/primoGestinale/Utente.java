package primoGestinale;

public class Utente {
	
	private static final String PREFISSO_UTENTE="user_";
	private static final String PREFISSO_AMMINISTRATORE="admin_";
	private String username;
	private String password;
	private boolean sospeso;
	private LivelloUtenteEnum livelloUtente;
	
	private static int NUMERO_UTENTI=1;
	
	
	
	public Utente(LivelloUtenteEnum livelloUtente) 
	{
		this.livelloUtente=livelloUtente;
		
		if (livelloUtente==LivelloUtenteEnum.AMMINISTRATORE)
			generaUsernameAmministrazione();
		else
			generaUsernameUtente();
		
	}

	private void generaUsernameUtente() {
		username=PREFISSO_UTENTE+NUMERO_UTENTI++;
		
	}

	private void generaUsernameAmministrazione() {
		
		username=PREFISSO_AMMINISTRATORE+NUMERO_UTENTI++;
		
	}
	
	public void setPassword(String password)
	{
		if (password.length()>=10)
			this.password=password;
		else
			System.out.println("La password deve contenere almeno dieci caratteri");
	}
	
	
	public void sospendiUtente()
	{
		sospeso=true;
	}
	
	public void riattivaUtente()
	{
		sospeso=false;
	}

	public void stampaDescrizione()
	{
		System.out.println("\nUtente: "+ username);
		
		switch(livelloUtente)
		{
			case AMMINISTRATORE:
				System.out.println("Livello: Amministratore");
				break;
			case STANDARD:
				System.out.println("Livello: Standard");
		}
		if (password==null)
			System.out.println("Pasword non impostata");
		else
			System.out.println("Password: OK");
		
		System.out.println("Sospeso: "+((sospeso)?"SI":"NO"));
	}
	

}

