package cc.xpbootcamp.code_smell_kit.$02_duplicated_code;

import java.util.ArrayList;

public class Client {

    ArrayList<ProductItem> products = new ArrayList();

    public void addProductItem(ProductItem productItem) {
        products.add(productItem);
    }

    public ArrayList chooseProductAboveSpecifiedPrice(double price) {
        ArrayList tempList = new ArrayList();
        for (int i = 0; i < products.size(); i++) {
            ProductItem productItem = products.get(i);
            if (productItem.getPrice() > price) {
                tempList.add(productItem);
            }
        }
        return tempList;
    }

    public ArrayList chooseProductBelowSpecifiedPrice(double price) {
        ArrayList tempList = new ArrayList();
        for (int i = 0; i < products.size(); i++) {
            ProductItem productItem = products.get(i);
            if (productItem.getPrice() < price) {
                tempList.add(productItem);
            }
        }
        return tempList;
    }
}
