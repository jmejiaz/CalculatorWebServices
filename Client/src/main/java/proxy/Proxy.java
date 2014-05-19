/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proxy;

import java.net.MalformedURLException;
import java.net.URL;
import MulsumReference.WSMultSum;
import MulsumReference.WSMultSum_Service;
import RestDivReference.WSRestDiv;
import RestDivReference.WSRestDiv_Service;
import Configuration.LoadXML;

/**
 *
 * @author Mejia
 */
public class Proxy {
    
   String urlMulSum; 
   String urlRestDiv ;
  
 
  public WSMultSum sumMul ; 
  public WSRestDiv resDiv; 
 
  
   public Proxy() throws MalformedURLException{
    LoadXML load = new LoadXML();
    this.urlMulSum= load.getMulsumServerSOAP();
    this.urlRestDiv= load.getDivrestServerSOAP();
    WSMultSum_Service mulSumService = new WSMultSum_Service(new URL(urlMulSum));
    WSRestDiv_Service restDivService = new WSRestDiv_Service(new URL(urlRestDiv));
    sumMul = mulSumService.getWSMultSumPort();
    resDiv =restDivService.getWSRestDivPort();
   }
   public double sumar(double a,double b){
   return sumMul.sumar(a, b);
   }
   
   public double multiplicar(double a,double b){
   return sumMul.multiplicar(a, b);
   }
   
    public double restar(double a,double b){
   return resDiv.restar(a, b);
    }
    
   public double dividir(double a,double b){
   return resDiv.dividir(a, b);
   }
  
  
 
}
