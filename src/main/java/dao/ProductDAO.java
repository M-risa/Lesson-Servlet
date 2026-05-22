package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import beans.ProductBeans;

public class ProductDAO extends DAO {
	
	public List<ProductBeans> findAll(String order){
		List<ProductBeans> list = new ArrayList<>();
		
		String sql = "select * from product order by price ASC";
		
		if ("DESC".equalsIgnoreCase(order)) {
            sql = "select * from product order by price DESC";
        }
		
		try(
			Connection con=getConnection(); //DB接続
			PreparedStatement st=con.prepareStatement(sql);
			ResultSet rs=st.executeQuery()){
			
			while(rs.next()) {
				ProductBeans p=new ProductBeans();
				p.setId(rs.getInt("id"));
				p.setName(rs.getString("name"));
				p.setPrice(rs.getInt("price"));
				list.add(p);
			}
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}

}
