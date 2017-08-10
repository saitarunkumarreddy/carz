package com.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.SupplierDaoInt;
import com.test.tarun.Supplier;


@Service
public class SupplierServiceImpl implements SupplierServiceInt {

	
@Autowired
private SupplierDaoInt SupplierDao;

	public void addSupplier(Supplier sup) {
		// TODO Auto-generated method stub
		SupplierDao.addSupplier(sup);
	}

	public void deleteSupplier(String sid) {
		
   SupplierDao.deleteSupplier(sid);
	}

	public void updateSupplier(Supplier sup) {
		// TODO Auto-generated method stub
SupplierDao.updateSupplier(sup);
	}

	public List<Supplier> getSupplier() {
		// TODO Auto-generated method stub
		return SupplierDao.getSupplier();
	}

	public Supplier getSupplierbyId(String sid) {
		// TODO Auto-generated method stub
		return SupplierDao.getSupplierbyId(sid);
	}

}
