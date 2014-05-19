/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package WebServices;

import Logic.Calc;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author Mejia
 */
@WebService(serviceName = "WSMultSum")
public class WSMultSum {

    /**
     * This is a sample web service operation
     */
   Calc calc = new Calc();
    @WebMethod(operationName = "sumar")
    public double sumar (@WebParam(name = "first") double a,@WebParam(name = "second")  double b){
        return calc.sumar(a,b);
    }
   @WebMethod(operationName = "multiplicar")
    public double multiplicar (@WebParam(name = "first") double a,@WebParam(name = "second")  double b){
        return calc.multiplicar(a,b);
    }
}
