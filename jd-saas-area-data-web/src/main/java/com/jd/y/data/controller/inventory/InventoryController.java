package com.jd.y.data.controller.inventory;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jd.y.data.service.inventory.InventoryService;

@Controller
@RequestMapping(value = "/saas/Inventory")
public class InventoryController {

	@Autowired
	public InventoryService  inventoryService;
	
	@RequestMapping(value="/queryInventory/{pkInventoryNode}",method={RequestMethod.GET})
	public @ResponseBody Object queryInventory(@PathVariable("pkInventoryNode") Long pkInventoryNode){
		List<Map<String, Object>> queryInventory = inventoryService.queryInventory(null);
		return queryInventory;
	}
}
