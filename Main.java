package com.interfaz;

//Definición de las interfaces

interface IPrinter {
 void print();
}

interface IFax {
 void fax();
}

interface IScanner {
 void scan();
}

//Implementación de las clases

//Clase que implementa solo la interfaz de impresión
class ImpresoraEconomica implements IPrinter {
 @Override
 public void print() {
     System.out.println("Impresión realizada por Impresora Económica.");
 }
}

//Clase que implementa todas las interfaces
class ImpresoraMultifuncion implements IPrinter, IFax, IScanner {
 @Override
 public void print() {
     System.out.println("Impresión realizada por Impresora Multifunción.");
 }

 @Override
 public void fax() {
     System.out.println("Fax enviado por Impresora Multifunción.");
 }

 @Override
 public void scan() {
     System.out.println("Escaneo realizado por Impresora Multifunción.");
 }
}

//Clase principal para probar la implementación
public class Main {
 public static void main1(String[] args) {
     IPrinter impresoraEconomica = new ImpresoraEconomica();
     impresoraEconomica.print();

     ImpresoraMultifuncion impresoraMultifuncion = new ImpresoraMultifuncion();
     impresoraMultifuncion.print();
     impresoraMultifuncion.fax();
     impresoraMultifuncion.scan();
 }

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
