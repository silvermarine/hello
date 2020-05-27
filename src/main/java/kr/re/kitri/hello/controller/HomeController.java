package kr.re.kitri.hello.controller;

import kr.re.kitri.hello.model.Product;
import kr.re.kitri.hello.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


@RestController
public class HomeController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products/{productId}")
    public Map<String, Object> getProductDetailsByProductId(
            @PathVariable int productId) {
        System.out.println(productId);
        Product p = productService.viewProductDetail(productId);
        Map<String, Object> result = new HashMap<>();
        result.put("status", "OK");
        result.put("data", p);
        return result;
    }

    @GetMapping("/products")
    public String getProducts() {
        //1. 요청해석 요청 파라미터 확보, 헤더값 확보
        //5. 결과값을 json 포맷으로 만들어 전송
        // 해당되는 기능을 가진 서비스를 호출하는 것
        return productService.retrieveProducts();
    }
    @GetMapping("/products/hello")
    public String hello() {
        return "hello";
    }
}

