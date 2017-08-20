

import static spark.Spark.*;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.jetty.server.Server;

import com.controllers.EmpleadoController;
import com.services.EmpleadoService;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
public class Main {

    @SuppressWarnings("rawtypes")
	public static void  main(String[] argv) throws Exception {
    	
    staticFiles.location("/resources");

       get("/", (req, res) -> {
    	   init(); 
            Map <String , Object> model = new HashMap<>();
            return new ModelAndView(model, "templates/lista.vm");
            
       }, new VelocityTemplateEngine());
        //test 
       get("/lista", (req, res) -> {
    	   init(); 
            Map <String , Object> model = new HashMap<>();
            return new ModelAndView(model, "templates/lista.vm");
            	
            
       }, new VelocityTemplateEngine());

       
        get("/api/registrar", (req, res) -> {
           init(); 
           res.status(200); 
        	return new ModelAndView(new HashMap(), "templates/registro.vm");
        }, new VelocityTemplateEngine());
       

        new EmpleadoController(new EmpleadoService()); 
        init(); 
        
    }	
}
