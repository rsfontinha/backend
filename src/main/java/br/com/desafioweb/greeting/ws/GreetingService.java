package br.com.desafioweb.greeting.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;


@WebService(name = "greetingservice")
public interface GreetingService {
	
	@WebMethod(operationName="greetingHello")
	@WebResult(name="greetingResult", partName="payload")
	public Greeting greeting(@WebParam(name = "name") String name);

}
