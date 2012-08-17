package bpel2java.uni;

public class SimpleProcess {

public void runWorkflow() {
	//Check for CreateInstance=YES
	
//Create the PartnerLinks STUBS
	// STUB service representing the PartnerLink:client with myRole: SimpleProcessProvider 
	PLClient myPLClient = new PLClient();
	// STUB service representing the PartnerLink:AuthorWSParterLink with PartnerRole: AuthorWSPartnerLinkRole
	PLAuthorWSParterLink myPLAuthorWSParterLink = new PLAuthorWSParterLink();

// Emulate the Receive activity		
		myPLClient.receiveInput();			

// Emulate the Assign activity		
		myPLAuthorWSParterLink.getAuthorWSParterLinkRequest().setACognome(myPLClient.getInput().getInput());			



 
	}
}
