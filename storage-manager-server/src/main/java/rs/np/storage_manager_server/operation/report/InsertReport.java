//package operation.report;
package rs.np.storage_manager_server.operation.report;

import rs.np.storage_manager_common.domain.Report;
import rs.np.storage_manager_server.operation.GenericSystemOperation;

/**
 * Klasa za unos izvestaja u bazu podataka. Nasledjuje klasu {@link rs.np.storage_manager_server.operation.GenericSystemOperation}.
 * 
 * @author Milan
 */
public class InsertReport extends GenericSystemOperation{
	/**
	 * preduslovi za transakciju
	 * @param parameter, tipa {@link Object}. Objekat nad kojim se vrsi sistemska operacija
	 * @throws Exception ako je parametar null ili nije tipa {@link Report}
	 */
    @Override
    protected void preconditions(Object parameter) throws Exception {
        if(parameter == null || !(parameter instanceof Report)){
           throw new Exception("Please input a valid report to insert.");
        }
    }

    @SuppressWarnings("unchecked")
	@Override
    protected void executeOperation(Object parameter) throws Exception {
        repository.insert((Report)parameter);
    }
    
}
