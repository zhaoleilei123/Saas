package com.jd.y.data.controller.area;


import java.util.List;
import java.util.Map;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jd.y.data.domain.areas.BbsAreas;
import com.jd.y.data.domain.util.Message;
import com.jd.y.data.service.area.AreasService;

@Controller
@RequestMapping(value = "/saas/area")
public class AreasController {
	
	@Autowired
	private AreasService areasService;
	
	@RequestMapping(value = "/queryAllAreas",method={RequestMethod.GET})
	public @ResponseBody    Object  queryAllAreas(){
	 	List<Map<String,Object>> queryBbsAreasList = areasService.queryBbsAreas();
		return queryBbsAreasList;
	}
	
	@RequestMapping(value="/queryAllAreasById/{prantId}",method={RequestMethod.GET})
	public @ResponseBody  Object  queryAllAreasById(@PathVariable("id") Integer id ){
		System.out.println(id);
		List<Map<String,Object>> queryBbsAreasByIdList = areasService.queryAllAreasById(id);
		return queryBbsAreasByIdList;
	}
	
	@RequestMapping(value="/insertAreas",method={RequestMethod.POST})
	public  @ResponseBody  Message insertAreas(BbsAreas  area){
		Message  me = new Message();
		Boolean insertJudge = areasService.insertAreas(area);
		Message message = null;
		if (insertJudge) {
			message = me.success();
		}else{
			message = me.failure();
		}
		return message;
	}
	
	@RequestMapping(value="/deleteAreaId/{id}",method={RequestMethod.DELETE})
	public @ResponseBody  Message  deleteAreaId(@PathVariable("id") Integer id){
		Message  me = new Message();
		Message message = null;
		try {
			 areasService.deleteAreaId(id);
			message = me.success();
		} catch (Exception e) {
			System.out.println(e);
			message = me.failure();
		}
		return message;
	}
	
	@RequestMapping(value = "/updateAreasById", method = RequestMethod.PUT)  
	public Message  updateAreasById(BbsAreas area){
		Message  me = new Message();
		Message message = null;
		try {
			areasService.updateAreasById(area);
			message = me.success();
		} catch (Exception e) {
			System.out.println(e);
			message = me.failure();
		}
		return message;
	}
	
}
