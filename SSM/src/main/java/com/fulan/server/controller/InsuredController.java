package com.fulan.server.controller;

import java.text.ParseException;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fulan.server.model.CarInformation;
import com.fulan.server.service.impl.InsuredServiceImpl;
import com.fulan.vo.CarandInsured;

@Controller
public class InsuredController {
	@Resource
	private InsuredServiceImpl insuredService;
	Logger logger = LoggerFactory.getLogger(getClass());
	
	/**
	 * 跳转车辆信息页面
	 * @return
	 */
	@RequestMapping("/car")
	public String toCarInformation() {
		//model.addAttribute("groupList",groupList);
		//return new ModelAndView("car");
		return "car";
	}
	
	/**
	 * 返回信息
	 * @return
	 * @throws ParseException 
	 */
	@ResponseBody
	@RequestMapping("/updateCar")
	public String toInsured(HttpServletRequest request,HttpServletResponse reponse,CarandInsured carandInsured) throws ParseException {
		logger.info(carandInsured.toString());
		insuredService.insert(carandInsured);
		return "yes";
	}
	
	
	@ResponseBody
	@RequestMapping("/testJson")
	public String testJson(String string1,String string2){
		logger.info(string1+string2);
		return string1+" and "+string2;
	}
	
	@ResponseBody
	@RequestMapping(value="/testCar",produces="application/json;charset=UTF-8")
	public CarInformation testCar(@RequestBody CarInformation car){
		logger.info(car.toString());
		return car;
	}
	
	@ResponseBody
	@RequestMapping(value="/testMap",produces="application/json;charset=UTF-8")
	public Map testM(@RequestBody Map m){
		logger.info(m.toString());
		return m;
		
	}
}
