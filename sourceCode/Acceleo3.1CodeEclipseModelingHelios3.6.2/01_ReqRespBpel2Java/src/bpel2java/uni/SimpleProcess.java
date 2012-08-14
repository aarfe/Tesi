package bpel2java.uni;

public class SimpleProcess {
protected SimpleProcessRequest input;
protected SimpleProcessResponse output;
protected GetAutographByCognomeEasyResponse AuthorWSParterLinkResponse;
protected GetAutographByCognomeEasy AuthorWSParterLinkRequest;

public void runWorkflow() {
//org.eclipse.wst.wsdl.internal.impl.OperationImpl@d25780 (documentationElement: null, element: [operation: null]) (style: REQUEST_RESPONSE, name: process, undefined: false)
//process
//Check for CreateInstance=YES

//receiveInput


PLClient aPLClient = new PLClient(); 


}

	/**
     * Communication with client    
     */
public SimpleProcessRequest receiveInput() {
return null;
}
public SimpleProcessResponse replyOutput() {
return null;
}

	/**
     * Add Setters and Getters    
     */
public SimpleProcessRequest getInput() {
	return input;
}

public void setInput(SimpleProcessRequest value) {
	this.input = value;
}
public SimpleProcessResponse getOutput() {
	return output;
}

public void setOutput(SimpleProcessResponse value) {
	this.output = value;
}
public GetAutographByCognomeEasyResponse getAuthorWSParterLinkResponse() {
	return AuthorWSParterLinkResponse;
}

public void setAuthorWSParterLinkResponse(GetAutographByCognomeEasyResponse value) {
	this.AuthorWSParterLinkResponse = value;
}
public GetAutographByCognomeEasy getAuthorWSParterLinkRequest() {
	return AuthorWSParterLinkRequest;
}

public void setAuthorWSParterLinkRequest(GetAutographByCognomeEasy value) {
	this.AuthorWSParterLinkRequest = value;
}




}
