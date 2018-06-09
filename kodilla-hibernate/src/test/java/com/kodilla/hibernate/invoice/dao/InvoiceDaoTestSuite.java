package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;
    private static final String MILK = "Milk";
    private static final String BOOZE = "Booze";
    private static final String MAYO = "Mayo";
    private static final String CHOCOLATE = "Chocolate";
    private static final String BREAD = "Bread";
    @Test
    public void testInvoiceDaoSave(){
        //Given


        Invoice invoice = new Invoice();
        invoice.setNumber("One");
        List<Item> items = new ArrayList<>();

        Product product1 = new Product(MILK);
        Product product2 = new Product(BOOZE);
        Product product3 = new Product(MAYO);
        Product product4 = new Product(CHOCOLATE);
        Product product5 = new Product(BREAD);

        Item item1 = new Item(product1, invoice, new BigDecimal(1.5),3, new BigDecimal(1.2));
        Item item2 = new Item(product2, invoice, new BigDecimal(12),8, new BigDecimal(10));
        Item item3 = new Item(product3, invoice, new BigDecimal(6),4, new BigDecimal(5));
        Item item4 = new Item(product4, invoice, new BigDecimal(3),21, new BigDecimal(2.5));
        Item item5 = new Item(product5, invoice, new BigDecimal(3),8, new BigDecimal(2.6));


        items.add(item1);
        items.add(item2);
        items.add(item3);
        items.add(item4);
        items.add(item5);

        product1.setItems(items);
        product2.setItems(items);
        product3.setItems(items);
        product4.setItems(items);
        product5.setItems(items);

        invoice.setItems(items);

        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();
        Invoice testInvoice = invoiceDao.findOne(id);
        List<String> productsList = new ArrayList<>();
        productsList.add(testInvoice.getItems().get(0).getProduct().getName());
        productsList.add(testInvoice.getItems().get(1).getProduct().getName());
        productsList.add(testInvoice.getItems().get(2).getProduct().getName());
        productsList.add(testInvoice.getItems().get(3).getProduct().getName());
        productsList.add(testInvoice.getItems().get(4).getProduct().getName());
        //Then
        Assert.assertEquals("One", testInvoice.getNumber());
        Assert.assertEquals(true, productsList.contains(MILK));
        Assert.assertEquals(true, productsList.contains(BOOZE));
        Assert.assertEquals(true, productsList.contains(MAYO));
        Assert.assertEquals(true, productsList.contains(CHOCOLATE));
        Assert.assertEquals(true, productsList.contains(BREAD));
        //CleanUp
        invoiceDao.delete(id);
    }
}
