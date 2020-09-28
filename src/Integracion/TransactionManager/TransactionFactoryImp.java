/**
 * @author Sergio Villarroel Fernández 	svillarr@ucm.es
 *
 *
 */
package Integracion.TransactionManager;


public class TransactionFactoryImp extends TransactionFactory {

	@Override
	public Transaction createTransaction() {
		return new TransactionMySQL();
		
	}
	
	

}