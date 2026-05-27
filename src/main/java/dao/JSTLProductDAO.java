package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import beans.ProductBeans;

public class JSTLProductDAO extends DAO{

	public List<ProductBeans> search(String keyword) throws Exception{
		List<ProductBeans> list=new ArrayList<>();
			
		Connection con=getConnection();
			
		PreparedStatement st=con.prepareStatement(
			"select * from product where name like ?");
		st.setString(1,"%"+keyword+"%");
		ResultSet rs=st.executeQuery();
		
			while(rs.next()) {
				ProductBeans p=new ProductBeans();
				p.setId(rs.getInt("id"));
				p.setName(rs.getString("name"));
				p.setPrice(rs.getInt("price"));
				list.add(p);
			}
			
			st.close();
			con.close();
			
			return list;
		}

		public int insert(ProductBeans product) throws Exception{
			Connection con=getConnection();
			
			PreparedStatement st=con.prepareStatement(
					"insert into product(name, price) values(?, ?)");
			st.setString(1, product.getName());
			st.setInt(2, product.getPrice());
			int line=st.executeUpdate();
			
			
			st.close();
			con.close();
			
			return line;
					
		}

}
