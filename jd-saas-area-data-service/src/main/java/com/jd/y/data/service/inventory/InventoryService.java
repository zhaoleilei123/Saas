package com.jd.y.data.service.inventory;

import java.util.List;
import java.util.Map;

public interface InventoryService {

	public List<Map<String,Object>>  queryInventory(Long pkInventoryNode);
}
