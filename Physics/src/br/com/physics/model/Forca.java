package br.com.physics.model;

public class Forca {
	public static final int FORCA1 = 1;
	public static final int FORCA2 = 2;
	private double F1, F2, F3;
	private double F1x, F1y, F2x, F2y, F3x, F3y;
	private double angulo1, angulo2, anguloF3, aux;
	private double auxf3x, auxf3y;
	
	public Forca(double F1, double angulo1, double F2, double angulo2){
		
		this.F1=F1;
		this.F2=F2;
		
		this.angulo1=angulo1;
		this.angulo2=angulo2;
		
		plano(this.angulo1, FORCA1);
		plano(this.angulo2, FORCA2);
		
		F3x=-F1x-F2x;
		F3y=-F1y-F2y;
		this.F3 = Math.sqrt((Math.pow(F3x, 2))+(Math.pow(F3y, 2)));
		
		auxf3x=F3x;
		auxf3y=F3y;
		if(F3x<0)
			auxf3x=F3x*(-1);
		if(F3y<0)
			auxf3y= F3y*(-1);
		
		aux=Math.atan(auxf3y/ auxf3x);
		anguloF3=Math.toDegrees(aux);
	}
	
	public void plano(double angulo, int forca){
		if(angulo>=0 && angulo<=90){
			if(forca==FORCA1){
				if(angulo!=90)
					F1x= this.F1 * Math.cos(Math.toRadians(angulo));
				else
					F1x=0;
				F1y= this.F1 * Math.sin(Math.toRadians(angulo));
			}
			if(forca==FORCA2){if(angulo!=90)
				F2x= this.F2 * Math.cos(Math.toRadians(angulo));
			else
				F2x=0;
				F2y= this.F2 * Math.sin(Math.toRadians(angulo));
			}
		}
		if(angulo>90 && angulo<=180){
			angulo-=90;
			if(forca==FORCA1){
				F1x= (this.F1 * Math.sin(Math.toRadians(angulo)))*(-1);
				if(angulo!=90)
					F1y= this.F1 * Math.cos(Math.toRadians(angulo));
				else
					F1y=0;
			}
			if(forca==FORCA2){
				F2x= (this.F2 * Math.sin(Math.toRadians(angulo)))*(-1);
				if(angulo!=90)
					F2y= this.F2 * Math.cos(Math.toRadians(angulo));
				else
					F2y=0;
			}
		}
		if(angulo>180 && angulo<=270){
			angulo-= 180;
			System.out.println(angulo);
			if(forca==FORCA1){
				if(angulo!=90)
					F1x= (this.F1 * Math.cos(Math.toRadians(angulo)))*(-1);
				else
					F1x=0;
				F1y= (this.F1 * Math.sin(Math.toRadians(angulo)))*(-1);
			}
			if(forca==FORCA2){
				if(angulo!=90)
					F2x= (this.F2 * Math.cos(Math.toRadians(angulo)))*(-1);
				else
					F2x=0;
				F2y= (this.F2 * Math.sin(Math.toRadians(angulo)))*(-1);
			}
		}
		if(angulo>270 && angulo<=360){
			angulo-=270;
			if(forca==FORCA1){
				F1x= this.F1 * Math.sin(Math.toRadians(angulo));
				if(angulo!=90)
					F1y= (this.F1 * Math.cos(Math.toRadians(angulo)))*(-1);
				else
					F1y=0;
			}
			if(forca==FORCA2){
				F2x= this.F2 * Math.sin(Math.toRadians(angulo));
				if(angulo!=90)
					F2y= (this.F2 * Math.cos(Math.toRadians(angulo)))*(-1);
				else
					F2y=0;
			}
		}
	}

	public double getF1() {
		return F1;
	}

	public void setF1(double f1) {
		F1 = f1;
	}

	public double getF2() {
		return F2;
	}

	public void setF2(double f2) {
		F2 = f2;
	}

	public double getF3() {
		return F3;
	}

	public void setF3(double f3) {
		F3 = f3;
	}

	public double getF1x() {
		return F1x;
	}

	public void setF1x(double f1x) {
		F1x = f1x;
	}

	public double getF1y() {
		return F1y;
	}

	public void setF1y(double f1y) {
		F1y = f1y;
	}

	public double getF2x() {
		return F2x;
	}

	public void setF2x(double f2x) {
		F2x = f2x;
	}

	public double getF2y() {
		return F2y;
	}

	public void setF2y(double f2y) {
		F2y = f2y;
	}

	public double getF3x() {
		return F3x;
	}

	public void setF3x(double f3x) {
		F3x = f3x;
	}

	public double getF3y() {
		return F3y;
	}

	public void setF3y(double f3y) {
		F3y = f3y;
	}

	public double getAngulo1() {
		return angulo1;
	}

	public void setAngulo1(double angulo1) {
		this.angulo1 = angulo1;
	}

	public double getAngulo2() {
		return angulo2;
	}

	public void setAngulo2(double angulo2) {
		this.angulo2 = angulo2;
	}

	public double getAnguloF3() {
		return anguloF3;
	}

	public void setAnguloF3(double anguloF3) {
		this.anguloF3 = anguloF3;
	}

	public double getAux() {
		return aux;
	}

	public void setAux(double aux) {
		this.aux = aux;
	}

	public double getAuxf3x() {
		return auxf3x;
	}

	public void setAuxf3x(double auxf3x) {
		this.auxf3x = auxf3x;
	}

	public double getAuxf3y() {
		return auxf3y;
	}

	public void setAuxf3y(double auxf3y) {
		this.auxf3y = auxf3y;
	}
}
