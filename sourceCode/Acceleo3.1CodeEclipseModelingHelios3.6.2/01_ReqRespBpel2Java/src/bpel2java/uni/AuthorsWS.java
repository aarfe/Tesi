package bpel2java.uni;

//import java.util.ArrayList;
//import java.util.List;

public class AuthorsWS {
// non posso modificare il constructor per problemi di compatibilità con le specifiche AXIS WSS	
//	private List<Author> authorsList;
	
//	AuthorsWS() {	
//		Author A = new Author("Eugenio", "Montale");
//		Author B = new Author("William", "Shackspeare");
//		Author C = new Author("Emily", "Dickinson");
//		Author D = new Author("Andrea", "De Carlo");
//		authorsList = new ArrayList<Author>();	
//		
//		authorsList.add(A);
//		authorsList.add(B);
//		authorsList.add(C);
//		authorsList.add(D);			
//	}
	
//	public String getAutographByCognome(String aCognome) {
//		
//		
//		for (int i=0; i<authorsList.size();i++) {
//			if (authorsList.get(i).getCognome().equals(aCognome))
//			{
//				return authorsList.get(i).getAutograph();
//			}	 
//		}
//		return "Author not found in the list";
//	}
	
	public String getAutographByCognomeEasy(String aCognome) {
		if (aCognome.equals("Montale"))
			return "Eugenio Montale";
		if (aCognome.equals("Dickinson"))
			return "Emily Dickinson";
		if (aCognome=="Shakespeare")
			return "William Shakespeare";
		if (aCognome=="Di Carlo")
			return "Andrea Di Carlo";
		else { 
			return "The author " + aCognome + " is not in the list";
		}		
	}
}
