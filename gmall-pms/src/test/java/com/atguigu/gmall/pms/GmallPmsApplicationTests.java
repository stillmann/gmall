package com.atguigu.gmall.pms;

import com.atguigu.gmall.pms.entity.Brand;
import com.atguigu.gmall.pms.entity.Product;
import com.atguigu.gmall.pms.service.BrandService;
import com.atguigu.gmall.pms.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@Slf4j
public class GmallPmsApplicationTests {

    @Autowired
    ProductService productService;
    @Autowired
    BrandService brandService;

    @Test
    public void contextLoads() {
        /*Product byId = productService.getById(1);
        System.out.println(byId.getName());*/

       /* Brand brand = new Brand();
        brand.setName("徐文");
        brandService.save(brand);*/
        Brand byId = brandService.getById("53");
        System.out.println("1qqqqqqq111qqq111222保存成功123121212121。。。" + byId.getName());
        log.info("打印日志");
    }

}
