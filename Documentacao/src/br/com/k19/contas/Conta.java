package br.com.k19.contas;

/**
*
* Documenta��o da classe Conta
*
* @author Rafael Consentino
*
* @author Jonas Hirata
*
* @author Marcelo Martins
*
* @version 1.0
*/

public class Conta {
/**
 * Documenta��o do atributo numero
 */
	private int numero;
	
/**
 * Documenta��o do construtor
 * 
 * @param	numero
 * 	
 * documenta��o do atributo numero
 * 
 * @throws IllegalArgumentException
 * 				documenta��o da situa��o que gera a exception
 * 				IllegalArgumentException
 */
	public Conta(int numero){
		if(numero < 0){
			throw new IllegalArgumentException("numero negativo");
		}
		this.numero = numero;
	}
	
	/**
	 * Documenta��o do m�todo getNumero
	 * 
	 * @return documenta��o do valor de retorno
	 */
	public int getNumero(){
		return numero;
	}
}
