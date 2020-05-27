package kr.re.kitri.hello.service.impl;

import kr.re.kitri.hello.dao.ProductDao;
import kr.re.kitri.hello.model.Product;
import kr.re.kitri.hello.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductDao productDao;
    public String  retrieveProducts() {
        //2. 전체상품 조회 작업
        //3. 데이터 베이스에 접속
        //4. 쿼리를 날림(select * from products)
        //last. 결과를 전달한다.
        return  productDao.selectProducts();
    }

    public Product viewProductDetail(int i) {
        return productDao.selectProductById(i);
    }
}
