package aplicacao;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.Department;
import entities.Seller;
import model.dao.DaoFactory;
import model.dao.SellerDao;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("            === TEST 1: seller findBydId ===");
        SellerDao sellerDao = DaoFactory.createSellerDao();
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);
        System.out.println();

        System.out.println("            === TEST 2: seller findBydDepartment ===");
        Department department = new Department(2, "");
        List<Seller> list = sellerDao.findByDepartment(department);
        for (Seller obj : list) {
            System.out.println(obj);
        }
        System.out.println();

        System.out.println("            === TEST 3: seller findAll  ===");

        list = sellerDao.findAll();
        for (Seller obj : list) {
            System.out.println(obj);
        }

        System.out.println();

        System.out.println("            === TEST 4: seller Insert  ===");
        // Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(),
        // 4000.0, department);
        // sellerDao.insert(newSeller);
        // System.out.println("Insert ! New id = " + newSeller.getId());
        System.out.println();
        System.out.println("            === TEST 5: seller update  ===");
        seller = sellerDao.findById(1);
        seller.setNome("Martha wainde");
        sellerDao.update(seller);
        System.out.println("UPDATE COMPLETO");
        System.out.println();
        System.out.println("            === TEST 6: seller update  ===");
        System.out.println("Digite o id para ser deletado: ");
        int id = sc.nextInt();
        sellerDao.deleteById(id);
        System.out.println("Id deletado ");

        sc.close();

    }
}
