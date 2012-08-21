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
     * Create constructor
     */
public PLClient() { 
	System.out.println("Constructor called for " + this.toString() + " " + this.getClass());    
	input = new SimpleProcessRequest() ;	
	output = new SimpleProcessResponse() ;	
}

	/**
     * Operations    
     */
public void receiveInput() {
	
	//CUSTOM SPECIFIC CODE
	System.out.println("Enter the name here : ");
	   
	   String word;
 
       Scanner scanIn = new Scanner(System.in);
       word = scanIn.nextLine();
       scanIn.close();
       System.out.println("The client inserted " + word + " "); 
                   
		input.setInput(word);
	//END CUSTOM SPECIFIC CODE   
}
	
public SimpleProcessResponse replyOutput() {
	//CUSTOM SPECIFIC CODE     	
	//END CUSTOM SPECIFIC CODE
	return getOutput();
}	


	/**
     * Setters and Getters    
     */
public SimpleProcessRequest getInput() {
	System.out.println("Getting the variable " + input.toString() + " " + input.getClass() );
	return input;
}

public void setInput(SimpleProcessRequest value) {
	System.out.println(" Entered the set operation for INPUT  " );  
	this.input = value;
	System.out.println("The "+ value + " has been set on the" + input.toString()  );
}

public SimpleProcessResponse getOutput() {
	System.out.println("Getting the variable " + output.toString() + " " + output.getClass() );
	return output;
}

public void setOutput(SimpleProcessResponse value) {
	System.out.println(" Entered the set operation for OUTPUT  " );  
	this.output = value;
	System.out.println("The "+ value + " has been set on the" + output.toString()  );
}

	
}
