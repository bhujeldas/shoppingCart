package com.shopping.services;

import com.shopping.entity.AddToList;
import com.shopping.entity.Product;
import com.shopping.entity.SumTotalProducts;

import java.util.ArrayList;
import java.util.List;

public class AddToListService {
    SumTotalProducts sumTotalProducts=new SumTotalProducts();
    List<AddToList> lstSummary=new ArrayList<>();

    public SumTotalProducts getSumTotalProducts(List<Product> cart) {
        SumTotalProducts sumTotalProducts=new SumTotalProducts();
        List<AddToList> addToLists=new ArrayList<>();
        Float grandTotal=0.0f;
        for(Product product:cart){
            String name=product.getName();
            Integer quantity=product.getQuantity();
            Float price=product.getPrice();
            Float totalPrice=quantity*price;
            grandTotal+=totalPrice;
            AddToList addToList=new AddToList(name,quantity,totalPrice);
            lstSummary.add(addToList);
        }
        sumTotalProducts.setGrandTotal(grandTotal);
        return sumTotalProducts;
    }
}
