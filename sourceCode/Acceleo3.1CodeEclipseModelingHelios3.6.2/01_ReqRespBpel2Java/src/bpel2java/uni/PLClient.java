// Client PartnerLink, Role: SimpleProcessProvider
package bpel2java.uni;

import java.util.Scanner;

public class PLClient {
	
	/**
     * Attributes    
     */
private SimpleProcessRequest input;	
private SimpleProcessResponse output;	


	/**
     * Operations    
     */
public void receiveInput(SimpleProcessRequest aSimpleProcessRequest) {
	//CUSTOM SPECIFIC CODE
	System.out.println("Enter the name here : ");
	   
	   String word;
 
       Scanner scanIn = new Scanner(System.in);
       word = scanIn.nextLine();
 
       scanIn.close();
                   
input.setInput(word);
	//END CUSTOM SPECIFIC CODE   
}
	
public SimpleProcessResponse replyOutput() {
	//CUSTOM SPECIFIC CODE     
	return getOutput();	
}	


	/**
     * Setters and Getters    
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


}
	
	
