package service;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import service.Operacion;

@Controller
public class OperacionController {

  
    

    @RequestMapping("/divres")
    public @ResponseBody Operacion operacion(
            @RequestParam(value="first", required=false) Double first,
    		@RequestParam(value="second", required=false) Double second,
    		@RequestParam(value="operator", required=false) String operator){
    	
    		if(operator.equals("r")||operator.equals("restar")){
    			return this.resta(first, second, operator);
    		}
    		
			if(operator.equals("d")||operator.equals("dividir")){
    			return this.div(first, second, operator);
    		
			}
			return null;
			
	
    		
    
    	
        
    }
    public Operacion resta(Double first,Double second,String operator){
    	
    	Operacion op = new Operacion(first, second, operator);
    	 op.restar();
    	 return op;
    }
   public Operacion div(Double first,Double second,String operator){
    	
    	Operacion op = new Operacion(first, second, operator);
    	 op.dividir();
    	 return op;
    }
    
} 