package com.example.demo;



import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
@Component
public class Dao{
	@Autowired
	private JdbcTemplate temp;
	public String savedata(Product p) {
		String qry  = "insert product values (?,?,?)";
		temp.update(qry,p.getPid(),p.getPname(),p.getPprice());
		return "Row Created";
	}
	public List<Product> getData(){
		String qry = "select * from product";
		return temp.query(qry,new RowMapper<Product>()
				{

					@Override
					public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
						// TODO Auto-generated method stub
						Product p = new Product();
						p.setPid(rs.getInt(1));
						p.setPname(rs.getString(2));
						p.setPprice(rs.getDouble(3));
						return p;
					}
			
				});
	}
	

}
