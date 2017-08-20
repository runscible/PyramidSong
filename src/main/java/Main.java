

import static spark.Spark.*;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.jetty.server.Server;

import com.controllers.EmpleadoController;
import com.services.EmpleadoService;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
public class Main {

    public static void  main(String[] argv) throws Exception {
    	Server server = new Server(8080); 
    	
    staticFiles.location("/resources");

       get("/", (request, response) -> {
            Map <String , Object> model = new HashMap<>();
            return new ModelAndView(model, "templates/lista.vm");
            
          }, new VelocityTemplateEngine());
        
        get("/api/registrar", (request, response) -> {
            return new ModelAndView(new HashMap(), "templates/registro.vm");
        }, new VelocityTemplateEngine());
       

        new EmpleadoController(new EmpleadoService()); 
        server.stop();
        server.start();
        
    }	
}
