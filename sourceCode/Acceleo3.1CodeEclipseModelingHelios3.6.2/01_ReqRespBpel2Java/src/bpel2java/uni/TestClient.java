package bpel2java.uni;

public class TestClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Console console = System.console();
//	    //read user name, using java.util.Formatter syntax :
//	    String name = console.readLine("Author Name? ");

		//This class has to create an instance of the process and start the BPEL sequence
		
//	    Scanner in = new Scanner(System.in);
//	    System.out.print("Please enter user name : ");
//	    String username = in.nextLine(); 
//	    System.out.println("You entered : " + username);
//	    
	    //GetAutographByCognomeEasyResponse risposta = new GetAutographByCognomeEasyResponse(); 
	    
//		AuthorsWS test = new AuthorsWS();
//		System.out.println(test.getAutographByCognomeEasy(username));
//		System.out.println(" ");
//		System.out.println(test.getAutographByCognomeEasy("hi"));
//		System.out.println(test.getAutographByCognomeEasy("Montale"));
//		System.out.println(test.getAutographByCognomeEasy("ciao"));
//		System.out.println(test.getAutographByCognomeEasy(" "));
//		System.out.println(test.getAutographByCognomeEasy("Dickinson"));
	
	SimpleProcess bpelProc = new SimpleProcess();
	bpelProc.runWorkflow();
	}
}
