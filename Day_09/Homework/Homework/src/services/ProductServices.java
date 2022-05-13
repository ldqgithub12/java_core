package services;

import models.Product;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ProductServices {
    ArrayList<Product> products = new ArrayList<>();
    public void init(){
        products.add(new Product(1,"Ban","Day la cai ban",10,150_000));
        products.add(new Product(2,"Ghe","Day la cai ghe",150,45_000));
        products.add(new Product(3,"Coc","Day la cai coc",30,15_000));
        products.add(new Product(4,"Quan","Day la cai quan",40,250_000));
        products.add(new Product(5,"A0","Day la cai ao",4,100_000));
    }
    public ArrayList<Product> getAllProducts(){
        return products;
    }

    public ProductServices() {
        init();
    }
    public void printProductList(ArrayList<Product> list){
        for (Product product : list){
            System.out.println(product);
        }
    }
    public ArrayList<Product> findByName(String name){
        ArrayList<Product> list = new ArrayList<>();
        for (Product product: products){
            if ( product.getName().toLowerCase().contains(name.toLowerCase()))
            {
                list.add(product);
            }
        }
        return list;
    }
    public Product findById(int id){
        for (Product product:products){
            if (product.getId() == id){
                return product;
            }
        }
        return null;
    }
    public void deleteProduct(int id){
        Iterator<Product> iterator = products.iterator();
        while (iterator.hasNext()){
            Product product = iterator.next();
            if(product.getId() == id){
                iterator.remove();
            }
        }
    }
    public Product updateQuality(Product product){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong moi: ");
        int newQuantity = sc.nextInt();
        product.setQuality(newQuantity);
        return product;
    }
    public ArrayList<Product> findQuantityUnderFive(){
        ArrayList<Product> list = new ArrayList<>();
        for (Product product:products){
            if(product.getQuality()<5){
                list.add(product);
            }
        }
        return list;
    }
    public ArrayList<Product> findCostUnder50(){
        ArrayList<Product> list = new ArrayList<>();
        for (Product product:products){
            if(product.getMoney() < 50_000){
                list.add(product);
            }
        }
        return list;
    }
    public ArrayList<Product> findCostFrom50to100(){
        ArrayList<Product> list = new ArrayList<>();
        for (Product product:products){
            if(product.getMoney() >= 50_000 && product.getMoney()<=100_000){
                list.add(product);
            }
        }
        return list;
    }
    public ArrayList<Product> findCostFrom100(){
        ArrayList<Product> list = new ArrayList<>();
        for (Product product:products){
            if(product.getMoney() > 100_000){
                list.add(product);
            }
        }
        return list;
    }
}
