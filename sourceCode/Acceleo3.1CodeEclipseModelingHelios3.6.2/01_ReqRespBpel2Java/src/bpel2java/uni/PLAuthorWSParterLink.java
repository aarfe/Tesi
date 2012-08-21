// Client PartnerLink, Role: AuthorWSPartnerLinkRole
package bpel2java.uni;
public class PLAuthorWSParterLink {

	/**
     * Attributes    
     */
private GetAutographByCognomeEasyResponse authorWSParterLinkResponse;	
private GetAutographByCognomeEasy authorWSParterLinkRequest;	


	/**
     * Create constructor
     */
public PLAuthorWSParterLink() { 
	System.out.println("Constructor called for " + this.toString() + " " + this.getClass());    
	authorWSParterLinkResponse = new GetAutographByCognomeEasyResponse() ;	
	authorWSParterLinkRequest = new GetAutographByCognomeEasy() ;	
}

     /**
     * Operations    
     */
public GetAutographByCognomeEasyResponse getAutographByCognomeEasyStub() {
     
     //CUSTOM SPECIFIC CODE TO CALL THE REAL SERVICE    
AuthorsWS service = new AuthorsWS();
String result = service.getAutographByCognomeEasy(authorWSParterLinkRequest.getACognome()); 
authorWSParterLinkResponse.setGetAutographByCognomeEasyReturn(result);
	//END OF CUSTOM SPECIFIC CODE TO CALL THE REAL SERVICE

	return authorWSParterLinkResponse;
}	


	/**
     * Setters and Getters    
     */
public GetAutographByCognomeEasyResponse getAuthorWSParterLinkResponse() {
	System.out.println("Getting the variable " + authorWSParterLinkResponse.toString() + " " + authorWSParterLinkResponse.getClass() );
	return authorWSParterLinkResponse;
}

public void setAuthorWSParterLinkResponse(GetAutographByCognomeEasyResponse value) {
	System.out.println(" Entered the set operation for AUTHORWSPARTERLINKRESPONSE  " );  
	this.authorWSParterLinkResponse = value;
	System.out.println("The "+ value + " has been set on the" + authorWSParterLinkResponse.toString()  );
}

public GetAutographByCognomeEasy getAuthorWSParterLinkRequest() {
	System.out.println("Getting the variable " + authorWSParterLinkRequest.toString() + " " + authorWSParterLinkRequest.getClass() );
	return authorWSParterLinkRequest;
}

public void setAuthorWSParterLinkRequest(GetAutographByCognomeEasy value) {
	System.out.println(" Entered the set operation for AUTHORWSPARTERLINKREQUEST  " );  
	this.authorWSParterLinkRequest = value;
	System.out.println("The "+ value + " has been set on the" + authorWSParterLinkRequest.toString()  );
}

	
	}
