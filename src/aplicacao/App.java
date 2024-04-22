package aplicacao;

import entities.Seller;
import model.dao.DaoFactory;
import model.dao.SellerDao;

public class App {
    public static void main(String[] args) {
        System.out.println("            === TEST 1: seller findBydId ===");
        SellerDao sellerDao = DaoFactory.createSellerDao();
        Seller seller = sellerDao.findById(3);

        System.out.println(seller);
    }
}
