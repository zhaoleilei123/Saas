package com.jd.y.data.service.inventory.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jd.y.data.mapper.inventory.BbsInventoryNodeMapper;
import com.jd.y.data.service.inventory.InventoryService;

@Service
public class InventoryServiceImpl implements InventoryService{

	@Autowired
	public BbsInventoryNodeMapper  bbsInventoryNodeMapper;
	
	public List<Map<String,Object>>  queryInventory(Long pkInventoryNode){
		return bbsInventoryNodeMapper.queryInventory(pkInventoryNode);
	}
}
