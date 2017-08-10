package com.test.dao;

import java.util.List;

import com.test.tarun.Supplier;
public interface SupplierDaoInt {

	
	void addSupplier(Supplier sup);
	void deleteSupplier(String sid);
	void updateSupplier(Supplier sup);
	List<Supplier> getSupplier();
	Supplier getSupplierbyId(String sid);
}
