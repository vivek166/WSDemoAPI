package book;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/book")
public class Book {

	/*@GET
	@Produces(MediaType.TEXT_XML)
	public String sayHelloXML(){
		String response="<?xml version='1.0'?>"+
	"<hello>Hello xml</hello>";
		return response;
	}*/
	
	@GET
	@Produces(MediaType.TEXT_XML)
	@Path("{name}")
	
	public String sayHelloXML(@PathParam("name") String name){
		String response="<?xml version='1.0'?>"+
	"<hello>Hello"+name+"</hello>";
		return response;
	}
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String sayHelloHTML(){
		String response="<h1>Hello html</h1>";
		return response;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String sayHelloJSON(){
		String response="hello";
		return response;
	}
}
