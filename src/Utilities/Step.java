package Utilities;

import java.util.ArrayList;

public class Step {

	public double step;
	public String accion;
	public String vAccion;
	public String locator;
	public String vLocator;
 
	

	
	public Step(double step, String accion,String vAccion, String locator, String vLocator) {
		this.step=step;
		this.accion=accion;
		this.vAccion=vAccion;
		this.locator=locator;
		this.vLocator=vLocator;
		
	}

	@Override
	public String toString() {
		return "Step [step=" + step + ", accion=" + accion + ", vAccion=" + vAccion + ", locator=" + locator
				+ ", vLocator=" + vLocator + "]";
	}


	public double getStep() {
		return step;
	}


	public void setStep(int step) {
		this.step = step;
	}


	public String getAccion() {
		return accion;
	}


	public void setAccion(String accion) {
		this.accion = accion;
	}


	public String getvAccion() {
		return vAccion;
	}


	public void setvAccion(String vAccion) {
		this.vAccion = vAccion;
	}


	public String getLocator() {
		return locator;
	}


	public void setLocator(String locator) {
		this.locator = locator;
	}


	public String getvLocator() {
		return vLocator;
	}


	public void setvLocator(String vLocator) {
		this.vLocator = vLocator;
	}


	
	
	
	
}
