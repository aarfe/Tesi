package bpel2java.uni;

public class SimpleProcess {

public void runWorkflow() {
	//Check for CreateInstance=YES
	
//Create the PartnerLinks STUBS

System.out.println("In the Process.java");
	// STUB service representing the PartnerLink:client with myRole: SimpleProcessProvider 	
	PLClient myPLClient = new PLClient();
	// DEBUG
	if(myPLClient.equals(null)) System.out.println("Object not created");
	// STUB service representing the PartnerLink:AuthorWSParterLink with PartnerRole: AuthorWSPartnerLinkRole
	PLAuthorWSParterLink myPLAuthorWSParterLink = new PLAuthorWSParterLink();
	// DEBUG
	if(myPLAuthorWSParterLink.equals(null)) System.out.println("Object not created");


// Emulate the Receive activity		
		myPLClient.receiveInput();			

// Emulate the Assign activity 
				myPLAuthorWSParterLink
		.getAuthorWSParterLinkRequest().setACognome( 
				myPLClient
		.getInput().getInput() );		

// Emulate the Invoke activity
		myPLAuthorWSParterLink.getAutographByCognomeEasyStub();		
	
// Emulate the Assign activity 
				myPLClient
		.getOutput().setResult( 
				myPLAuthorWSParterLink
		.getAuthorWSParterLinkResponse().getGetAutographByCognomeEasyReturn() );		
//		myPLClient.getOutput().setResult( myPLAuthorWSParterLink.getAuthorWSParterLinkResponse().getAutographByCognomeEasyReturn );	
	
// Emulate the Reply activity
		myPLClient.replyOutput();		
	


 
	}
}

