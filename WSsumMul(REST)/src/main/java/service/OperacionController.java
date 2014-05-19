package service;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import service.Operacion;

@Controller
public class OperacionController {

  
    

    @RequestMapping("/mulsum")
    public @ResponseBody Operacion operacion(
            @RequestParam(value="first", required=false) Double first,
    		@RequestParam(value="second", required=false) Double second,
    		@RequestParam(value="operator", required=false) String operator){
    	
    		if(operator.equals("m")||operator.equals("multiplicar")){
    			return this.mult(first, second, operator);
    		}
    		
			if(operator.equals("s")||operator.equals("sumar")){
    			return this.suma(first, second, operator);
    		
			}
			return null;
			
	
    		
    
    	
        
    }
    public Operacion suma(Double first,Double second,String operator){
    	
    	Operacion op = new Operacion(first, second, operator);
    	 op.sumar();
    	 return op;
    }
   public Operacion mult(Double first,Double second,String operator){
    	
    	Operacion op = new Operacion(first, second, operator);
    	 op.multiplicar();
    	 return op;
    }
    
} 