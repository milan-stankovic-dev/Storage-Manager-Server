//package operation.product;
package rs.np.storage_manager_server.operation.product;

import java.util.ArrayList;
import java.util.List;

import rs.np.storage_manager_common.domain.Product;
import rs.np.storage_manager_server.operation.GenericSystemOperation;

/**
 * Klasa za prikupljanje podataka o svim proizvodima, parametrizovano. Nasledjuje klasu 
 * {@link rs.np.storage_manager_server.operation.GenericSystemOperation}.
 * 
 * @author Milan
 */
public class SelectAllProducts extends GenericSystemOperation{
    /**
     * privatni atribut products, lista proizvoda koje treba preuzeti iz baze podataka
     */
	private List<Product> products;

    @Override
    protected void preconditions(Object parameter) throws Exception {}

    @SuppressWarnings("unchecked")
	@Override
    protected void executeOperation(Object parameter) throws Exception {
        products = repository.selectAll();
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
