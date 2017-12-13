package com.jd.y.data.mapper.area;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.jd.y.data.domain.areas.BbsAreas;

@Repository
public interface AreaMapper {

	public List<Map<String, Object>> queryBbsArea();

	public List<Map<String, Object>> queryAllAreasById(Integer id);

	public int insertAreas(BbsAreas area);

	public void deleteAreaId(Integer id);

	public void updateAreasById(BbsAreas area);
}
