package com.test.dao;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.tarun.Product;
import com.test.tarun.UserDetails;

@Repository
public class ProductsDaoImpl implements ProductsDaoInt {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void addProduct(Product prd) {
		// TODO Auto-generated method stub
		Session ses = sessionFactory.openSession();
		prd.setProductid(generateProductId());
		ses.save(prd);// save ud as record in table by executing insert qr
		ses.flush();
		ses.close();
		saveProductImage(prd);
	}

	public void deleteProduct(String pid) {
		Session ses= sessionFactory.openSession();
		Product temp=(Product)ses.get(Product.class, pid);
		ses.delete(temp);
		ses.flush();
		ses.close();

	}

	public void updateProduct(Product prd) {
		// TODO Auto-generated method stub
Session ses=sessionFactory.openSession();
ses.update(prd);
ses.flush();
ses.close();
	}

	public List<Product> getProducts() {
		Session ses = sessionFactory.openSession();
		Query qr = ses.createQuery("from Product");
		List<Product> data = qr.list();//IT EXCUTES SELECT *FROM PRODUCTS
		ses.close();		
		return data;
		
	}

	public Product getProductbyId(String pid) {
		// TODO Auto-generated method stub
		Session ses=sessionFactory.openSession();
		Product temp=(Product)ses.get(Product.class, pid);
		ses.close();
		return temp;
	}

	private String generateProductId(){


		String newPid="";

		Session s = sessionFactory.openSession();
		Query qr = s.createQuery("from Product");
		List<Product> data = qr.list();
		s.close();
		if(data.size()==0){ // if table is empty
		newPid="PRD00001";
		}
		else {// if table is not empty
		Session ss = sessionFactory.openSession();
		Query q = ss.createQuery("select max(productid) from Product");
		String prevId = q.list().get(0).toString();
		System.out.print("\nExisting : "+prevId);
		int id = Integer.parseInt(prevId.substring(3));
		System.out.print("\nExisting id : "+id);
		id=id+1;
		if(id<=9)
		newPid="PRD0000"+id;
		else if(id<=99)
		newPid="PRD000"+id;
		else if(id<=999)
		newPid="PRD00"+id;
		else if(id<=9999)
		newPid="PRD0"+id;
		else
		newPid="PRD"+id;
		System.out.print("\nGenerated : "+newPid);
		ss.close();
		}
		return newPid;

		}

	private void saveProductImage(Product prd) {

		System.out.print("\nprd img : " + prd.getProductImage());

		try {
			if (prd.getProductImage() != null) {
				Path path = Paths.get("C://Workspace-DT15-Project2//cars//src//main//webapp//resources//images//products//"
						+ prd.getProductid() + ".jpg");
				prd.getProductImage().transferTo(new File(path.toString()));
				System.out.print("\nProduct Image saved");
			}
		} catch (Exception ex) {
			System.out.print("\nProduct Image not saved...");
		}
	
	
	}
}
