package pf;

import java.io.Serializable;

public class Calculation implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer a;
	private Integer b;
	private String operation;
	
	public Integer getA() {
		return a;
	}
	public void setA(Integer a) {
		this.a = a;
	}
	public Integer getB() {
		return b;
	}
	public void setB(Integer b) {
		this.b = b;
	}
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
}
