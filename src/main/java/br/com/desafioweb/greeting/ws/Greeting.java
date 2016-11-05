package br.com.desafioweb.greeting.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Greeting {

	@XmlElement(name= "id")
	private long id;
	
	@XmlElement(name= "content")
	private String content; 
	
	public Greeting() {
		// TODO Auto-generated constructor stub
	}
	
	public Long getId(){
		return id;
	}

	public void setid(Long id){
		this.id = id; 
	}
	
	public String getContent(){
		return content;
	}

	public void setContent(String content){
		this.content = content; 
	}
}
