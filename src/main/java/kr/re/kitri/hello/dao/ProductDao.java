package kr.re.kitri.hello.dao;

import kr.re.kitri.hello.model.Product;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDao {

    public String selectProducts() {
        // DB에 접속.. 쿼리 실행
        // MyBatis
        //..
        return "상품목록 받으세요";
    }

    public Product selectProductById(int i) {
        Product p = new Product(i + "", "아이폰5", 500000, "iphone");
                return p;
    }
}
