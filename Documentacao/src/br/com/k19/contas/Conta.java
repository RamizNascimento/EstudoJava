package br.com.k19.contas;

/**
*
* Documentação da classe Conta
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
 * Documentação do atributo numero
 */
	private int numero;
	
/**
 * Documentação do construtor
 * 
 * @param	numero
 * 	
 * documentação do atributo numero
 * 
 * @throws IllegalArgumentException
 * 				documentação da situação que gera a exception
 * 				IllegalArgumentException
 */
	public Conta(int numero){
		if(numero < 0){
			throw new IllegalArgumentException("numero negativo");
		}
		this.numero = numero;
	}
	
	/**
	 * Documentação do método getNumero
	 * 
	 * @return documentação do valor de retorno
	 */
	public int getNumero(){
		return numero;
	}
}
