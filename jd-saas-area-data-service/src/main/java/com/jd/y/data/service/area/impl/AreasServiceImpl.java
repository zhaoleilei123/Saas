package com.jd.y.data.service.area.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jd.y.data.domain.areas.BbsAreas;
import com.jd.y.data.mapper.area.AreaMapper;
import com.jd.y.data.service.area.AreasService;
@Service
public class AreasServiceImpl implements AreasService {
	
	@Autowired
	private AreaMapper areasMapper;
	
	public List<Map<String,Object>>queryBbsAreas(){
		return areasMapper.queryBbsArea();
	}

	@Override
	public List<Map<String, Object>> queryAllAreasById(Integer id) {
		return areasMapper.queryAllAreasById(id);
	}

	@Override
	public Boolean insertAreas(BbsAreas area) {
		return areasMapper.insertAreas(area)==1;
	}

	@Override
	public void  deleteAreaId(Integer id) {
		 areasMapper.deleteAreaId(id);
	}

	@Override
	public void updateAreasById(BbsAreas area) {
		 areasMapper.updateAreasById(area);
	}


}
