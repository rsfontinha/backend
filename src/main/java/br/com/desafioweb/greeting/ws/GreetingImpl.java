package br.com.desafioweb.greeting.ws;

import java.util.concurrent.atomic.AtomicLong;

import javax.ejb.Stateless;
import javax.jws.WebService;

@Stateless
@WebService(name = "greetingservice")
public class GreetingImpl implements GreetingService{

	public GreetingImpl() {
		// TODO Auto-generated constructor stub
	}
	
	private static final String template = "Hello, %s!";
	private static final AtomicLong counter = new AtomicLong();
	
	@Override
	public Greeting greeting(String name){
		Greeting greeting = new Greeting();
		greeting.setid(counter.incrementAndGet());
		greeting.setContent(String.format(template, name));
		return greeting; 
	}

}
