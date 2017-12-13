package com.jd.y.data.mapper.inventory;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.jd.y.data.domain.inventory.BbsInventoryNode;

@Repository
public interface BbsInventoryNodeMapper {
    int deleteByPrimaryKey(Long pkInventoryNode);

    int insert(BbsInventoryNode record);

    int insertSelective(BbsInventoryNode record);

    List<Map<String,Object>> queryInventory(Long pkInventoryNode);

    int updateByPrimaryKeySelective(BbsInventoryNode record);

    int updateByPrimaryKey(BbsInventoryNode record);
}