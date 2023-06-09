//package operation.goodsReceivedNote;
package rs.np.storage_manager_server.operation.goodsReceivedNote;

import rs.np.storage_manager_common.domain.abstraction.implementation.GoodsReceivedNote;
import rs.np.storage_manager_server.operation.GenericSystemOperation;

/**
 * Klasa za brisanje prijemnice. Nasledjuje klasu {@link rs.np.storage_manager_server.operation.GenericSystemOperation}.
 * 
 * @author Milan
 */
public class DeleteGoodsReceivedNote extends GenericSystemOperation{
	/**
	 * preduslovi za transakciju
	 * @param parameter, tipa {@link Object}. Objekat nad kojim se vrsi sistemska operacija
	 * @throws Exception ako je parametar null ili nije tipa {@link GoodsReceivedNote}
	 */
    @Override
    protected void preconditions(Object parameter) throws Exception {
        if(parameter == null || !(parameter instanceof GoodsReceivedNote)){
           throw new Exception("Please input a valid goods received note to delete.");
        }
    }

    @SuppressWarnings("unchecked")
	@Override
    protected void executeOperation(Object parameter) throws Exception {
        repository.delete((GoodsReceivedNote)parameter);
    }
    
}
