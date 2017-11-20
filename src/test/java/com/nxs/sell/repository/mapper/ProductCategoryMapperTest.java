package com.nxs.sell.repository.mapper;

import com.nxs.sell.dataobject.ProductCategory;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ProductCategoryMapperTest {

    @Autowired
    private ProductCategoryMapper mapper;

    @Test
    public void insertByMap() throws Exception {
        Map<String, Object> map = new HashMap<>();
        map.put("categoryName","秋冬必备");
        map.put("categoryType","101");
        int result = mapper.insertByMap(map);
        Assert.assertEquals(1,result);
    }

    @Test
    public void insertByObject() throws Exception {
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryName("四川口味");
        productCategory.setCategoryType(102);
        int result = mapper.insertByObject(productCategory);
        Assert.assertEquals(1,result);
    }

    @Test
    public void findByCategoryType() throws Exception {
        ProductCategory result  = mapper.findByCategoryType(102);
        Assert.assertNotNull(result);
    }

    @Test
    public void findByCategoryName() throws Exception {
        List<ProductCategory> result  = mapper.findByCategoryName("秋冬必备");
        Assert.assertNotEquals(0,result.size());
    }

    @Test
    public void updateByCategoryType() throws Exception {
        int result  = mapper.updateByCategoryType("云南口味",102);
        Assert.assertEquals(1,result);
    }

    @Test
    public void updateByObject() throws Exception {
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryName("四川口味");
        productCategory.setCategoryType(102);
        int result  = mapper.updateByObject(productCategory);
        Assert.assertEquals(1,result);
    }

    @Test
    public void deleteByCategoryType() throws Exception {
        int result  = mapper.deleteByCategoryType(102);
        Assert.assertEquals(1,result);
    }

    @Test
    public void selectByCategoryType() throws Exception {
        ProductCategory result  = mapper.selectByCategoryType(102);
        Assert.assertNotNull(result);
    }

}