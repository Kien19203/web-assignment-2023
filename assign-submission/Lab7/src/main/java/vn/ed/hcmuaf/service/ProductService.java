package vn.ed.hcmuaf.service;

import dao.ProductDao;
import vn.ed.hcmuaf.bean.Product;

import java.util.List;

public class ProductService {
    private static ProductService instance;
    public static ProductService getInstance() {
        if(instance == null) instance = new ProductService();
        return instance;
    }

    public List<Product> getAll() {
        return ProductDao.getAll();
    }

    public Product getById(int id) {
        return ProductDao.getById(id);
    }
}
