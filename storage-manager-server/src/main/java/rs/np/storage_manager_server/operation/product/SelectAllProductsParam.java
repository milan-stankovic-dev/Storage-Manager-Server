//package operation.product;
package rs.np.storage_manager_server.operation.product;

import java.util.ArrayList;
import java.util.List;

import rs.np.storage_manager_common.domain.Product;
import rs.np.storage_manager_server.operation.GenericSystemOperation;

/**
 * Klasa za prikupljanje podataka o svim pravnim licima, parametrizovano, po nazivu. Nasledjuje klasu 
 * {@link rs.np.storage_manager_server.operation.GenericSystemOperation}.
 * 
 * @author Milan
 */
public class SelectAllProductsParam extends GenericSystemOperation{
	/**
	 * privatni atribut products, lista pravnih lica koje treba preuzeti iz baze podataka
	 */
	private List<Product> products;
    
    @Override
    protected void preconditions(Object parameter) throws Exception {
        if(parameter == null || !(parameter instanceof Product)){
           throw new Exception("Please input a valid product to delete.");
        }
    }

    @SuppressWarnings("unchecked")
	@Override
    protected void executeOperation(Object parameter) throws Exception {
        products = repository.selectAll((Product)parameter);
    }
    /**
     * get metoda za proizvode
     * 
     * @return products, kao lista proizvoda ({@link ArrayList})
     */
    public List<Product> getProducts() {
        return products;
    }
    

}
