package com.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.XpsDAOInt;
import com.test.tarun.XMAP_Product_Supplier;


@Service
public class XpsServiceImpl implements XpsServiceInt {

	
	@Autowired
	private XpsDAOInt xpsDao;

	public void addxps(XMAP_Product_Supplier xps) {
		// TODO Auto-generated method stub
		xpsDao.addxps(xps);

	}

	public List<XMAP_Product_Supplier> getAllXps() {
		// TODO Auto-generated method stub
		return xpsDao.getAllXps();

	}

	public void deleteXps(String psid) {
		// TODO Auto-generated method stub
		xpsDao.deleteXps(psid);

	}

	public XMAP_Product_Supplier getXpsById(String psid) {
		// TODO Auto-generated method stub
		return xpsDao.getXpsById(psid);

	}

	public void editXps(XMAP_Product_Supplier xps) {
		// TODO Auto-generated method stub
		xpsDao.editXps(xps);

	}

}
