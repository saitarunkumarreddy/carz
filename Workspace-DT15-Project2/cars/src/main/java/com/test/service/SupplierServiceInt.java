package com.test.service;

import java.util.List;

import com.test.tarun.Supplier;

public interface SupplierServiceInt {

	
	
	void addSupplier(Supplier sup);
	void deleteSupplier(String sup);
	void updateSupplier(Supplier sup);
	List<Supplier> getSupplier();
	Supplier getSupplierbyId(String sid);
}
