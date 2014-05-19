package service;

public class Operacion {

    private double first;
    private double second;
    private String operator;
    private double result;
    
    public Operacion(Double first,Double second,String operator) {
        this.first = first;
        this.second = second;        
        this.operator = operator;
       
    }

    public double getSecond() {
		return second;
	}

	public void setSecond(double second) {
		this.second = second;
	}

	public double getFirst() {
		return first;
	}
	public void setFirst(double first) {
		this.first = first;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	public double getResult() {
		return result;
	}
	public void setResult(double result) {
		this.result = result;
	}
	
	public void  sumar() {
		this.setResult(first+second);
	}
	public void  multiplicar() {
		this.setResult(first*second);
	}
    

	


	


}
