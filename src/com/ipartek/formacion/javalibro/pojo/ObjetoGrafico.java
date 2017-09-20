package com.ipartek.formacion.javalibro.pojo;


/**
 * Una clase abstracta puede contener código implementado pero tiene algún método
 * SIN implementar (abstract)
 * 
 * Es algo intermedio entre class e interfaz
 * 
 * Una clase abstracta no puede instanciar objetos, pero de una interfaz sí
 * 
 *  Las clases hijas deben implementar los metodos abstractos o volver a declararlos
 *  abstractos *  
 *  
 *  *  *  * @author Administrador
 *
 */
public abstract class ObjetoGrafico {

	int x;

	int y;
	
	void mover(int xPos, int yPos)
	{
		this.x=xPos;
		this.x=xPos;
	}
	
	abstract void dibujar();
}
