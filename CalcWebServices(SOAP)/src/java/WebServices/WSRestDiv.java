/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package WebServices;

import Logic.Calc;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Mejia
 */

@WebService(serviceName = "WSRestDiv")
public class WSRestDiv {

    /**
     * This is a sample web service operation
     */
   Calc calc = new Calc();
   @WebMethod(operationName = "restar")
    public double restar (@WebParam(name = "first") double first,@WebParam(name = "second")  double second){
        return calc.restar(first,second);
    }
   @WebMethod(operationName = "dividir")
    public double dividir (@WebParam(name = "first") double first,@WebParam(name = "second")  double second){
        return calc.dividir(first,second);
    }
}
