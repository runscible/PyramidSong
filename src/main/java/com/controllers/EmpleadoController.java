package com.controllers;
import static spark.Spark.*;

import static com.controllers.JsonUtils.*; 

import com.google.gson.Gson;
import com.services.EmpleadoService;

public class EmpleadoController {
	//get method para hacer las llamadas por json a la vista 
	
	public EmpleadoController(final EmpleadoService empleadoService){
		String empleadosJson = new Gson().toJson(empleadoService.getAllEmpleado()); 
		get("/empleados", (req, res)-> empleadosJson);
	
	//post method para hacer exactamente lo mismo 	
		post("/api/registrar",(req, res)->
			empleadoService.createEmpleado(
				req.queryParams("nombre"),
				req.queryParams("sueldo") 
		), json()); 
		
	}	
}
