package ex04.factory.idcard;

import ex04.factory.framwork.Factory;
import ex04.factory.framwork.Product;

import java.util.ArrayList;
import java.util.List;

public class IDCardFactory extends Factory {
    private List owners = new ArrayList();
    private int serial = 100;
    @Override
    protected synchronized Product createProduct(String owner){
        return new IDcard(owner, serial++);
    }
    @Override
    protected void registerProduct(Product product) {
        owners.add(((IDcard)product).getOwner());
    }

    public List getOwners(){
        return owners;
    }
}
