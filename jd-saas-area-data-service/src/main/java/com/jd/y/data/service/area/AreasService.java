package com.jd.y.data.service.area;

import java.util.List;
import java.util.Map;

import com.jd.y.data.domain.areas.BbsAreas;

public interface AreasService {

	public List<Map<String, Object>> queryBbsAreas();

	public List<Map<String, Object>> queryAllAreasById(Integer id);

	public Boolean insertAreas(BbsAreas area);

	public void deleteAreaId(Integer id);

	public void updateAreasById(BbsAreas area);
}
