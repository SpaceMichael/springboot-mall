package com.mt.spingbootmall.rowmapper;

import com.mt.spingbootmall.constant.ProductCategory;
import com.mt.spingbootmall.mdoel.Product;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductRowMapper implements RowMapper <Product>{

    @Override
    public Product mapRow(ResultSet rs, int rowNum) throws SQLException {

        Product product = new Product();

        product.setProductId(rs.getInt("product_id"));
        product.setProductName(rs.getString("product_name"));


        String categorySTr = rs.getString("category");
        ProductCategory category=ProductCategory.valueOf(categorySTr);
        product.setCategory(category);

        // advance coding
        // product.setCategory(ProductCategory.valueOf(rs.getString("category")));
        // old coding
        // product.setCategory(rs.getString("category"));


        product.setImageUrl(rs.getString("image_url"));
        product.setPrice(rs.getInt("price"));
        product.setStock(rs.getInt("stock"));
        product.setDescription(rs.getString("description"));
        product.setCreatedDate(rs.getTimestamp("created_date"));
        product.setLastModifiedDate(rs.getTimestamp("last_modified_date"));

        return product;
    }
}
