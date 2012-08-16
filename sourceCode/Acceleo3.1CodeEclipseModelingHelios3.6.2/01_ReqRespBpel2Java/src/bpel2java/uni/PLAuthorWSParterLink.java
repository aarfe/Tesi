// Client PartnerLink, Role: AuthorWSPartnerLinkRole
package bpel2java.uni;
public class PLAuthorWSParterLink {

	/**
     * Attributes    
     */
private GetAutographByCognomeEasyResponse authorWSParterLinkResponse;	
private GetAutographByCognomeEasy authorWSParterLinkRequest;	


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
	return authorWSParterLinkResponse;
}

public void setAuthorWSParterLinkResponse(GetAutographByCognomeEasyResponse value) {
	this.authorWSParterLinkResponse = value;
}

public GetAutographByCognomeEasy getAuthorWSParterLinkRequest() {
	return authorWSParterLinkRequest;
}

public void setAuthorWSParterLinkRequest(GetAutographByCognomeEasy value) {
	this.authorWSParterLinkRequest = value;
}

	
	}
