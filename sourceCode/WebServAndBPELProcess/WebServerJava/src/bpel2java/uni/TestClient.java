package bpel2java.uni;

public class TestClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AuthorsWS test = new AuthorsWS();
		System.out.println(test.getAutographByCognomeEasy("Montale"));
		System.out.println(test.getAutographByCognomeEasy("ciao"));
		System.out.println(test.getAutographByCognomeEasy(" "));
		System.out.println(test.getAutographByCognomeEasy("Dickinson"));
	}

}
