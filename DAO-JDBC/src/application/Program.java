package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.List;

public class Program {
    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("=== TEST 1: seller findById ===");
        Seller seller = sellerDao.findById(1);
        System.out.println(seller);

        System.out.println("\n=== TEST 2: seller findByDepartment ===");
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByIdDepartment(department);
        for(Seller x : list){
            System.out.println(x);
        }

        System.out.println("\n=== TEST 2: seller findAll ===");
        list = sellerDao.findAll();
        for(Seller x : list){
            System.out.println(x);
        }
    }
}