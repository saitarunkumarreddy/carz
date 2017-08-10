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
import com.test.tarun.Supplier;


@Repository
public class SupplierDaoImpl implements SupplierDaoInt {
	
	@Autowired
	private SessionFactory  sessionFactory;

	public void addSupplier(Supplier sup) {
		// TODO Auto-generated method stub
		Session ses = sessionFactory.openSession();
		sup.setSupplierid(generateSupplierId());
		ses.save(sup);// save ud as record in table by executing insert qr
		ses.flush();
		ses.close();
		saveSupplierImage(sup);
	}

	public void deleteSupplier(String sid) {
		Session ses= sessionFactory.openSession();
		Supplier temp=(Supplier)ses.get(Supplier.class,sid);
		ses.delete(temp);
		ses.flush();
		ses.close();

	}

	public void updateSupplier(Supplier sup) {
		// TODO Auto-generated method stub
		Session ses=sessionFactory.openSession();
		ses.update(sup);
		ses.flush();
		ses.close();
	}

	public List<Supplier> getSupplier() {
		// TODO Auto-generated method stub
		Session ses = sessionFactory.openSession();
		Query qr = ses.createQuery("from Supplier");
		List<Supplier> data = qr.list();
		System.out.println("\nsuppp dao - "+data);
		ses.close();		
		return data;
	}

	public Supplier getSupplierbyId(String sup) {
		// TODO Auto-generated method stub
		Session ses=sessionFactory.openSession();
		Supplier temp=(Supplier)ses.get(Supplier.class, sup);
		ses.close();
		return temp;
	}
	
	private String generateSupplierId(){


		String newSid="";

		Session s = sessionFactory.openSession();
	
		Query qr = s.createQuery("from Supplier");
		List<Supplier> data = qr.list();
		s.close();
		if(data.size()==0){ // if table is empty
		newSid="SUP00001";
		}
		else {// if table is not empty
		Session ss = sessionFactory.openSession();
		Query q = ss.createQuery("select max(supplierid) from Supplier");
		String prevId = q.list().get(0).toString();
		System.out.print("\nExisting : "+prevId);
		int id = Integer.parseInt(prevId.substring(3));
		System.out.print("\nExisting id : "+id);
		id=id+1;
		if(id<=9)
		newSid="SUP0000"+id;
		else if(id<=99)
		newSid="SUP000"+id;
		else if(id<=999)
		newSid="SUP00"+id;
		else if(id<=9999)
		newSid="SUP0"+id;
		else
		newSid="SUP"+id;
		System.out.print("\nGenerated : "+newSid);
		ss.close();
		}
		return newSid;

		}

	private void saveSupplierImage(Supplier sup) {

		System.out.print("\nSup img : " + sup.getSupplierImage());

		try {
			if (sup.getSupplierImage() != null) {
				//C:\Workspace-DT15-Project2\cars\src\main\webapp\resources\images\supplier
				Path path = Paths.get("C://Workspace-DT15-Project2//cars//src//main//webapp//resources//images//supplier//"	+ sup.getSupplierid() + ".jpg");
				sup.getSupplierImage().transferTo(new File(path.toString()));
				System.out.print("\nSupplier Image saved");
			}
		} catch (Exception ex) {
			System.out.print("\nSupplier Image not saved...");
		}
}
}
