package com.fulan.server.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fulan.server.dao.CarInformationMapper;
import com.fulan.server.dao.CertDictionatyMapper;
import com.fulan.server.dao.PolicyInformationMapper;
import com.fulan.server.model.CarInformation;
import com.fulan.server.model.CertDictionaty;
import com.fulan.server.model.PolicyInformation;
import com.fulan.server.service.InsuredService;
import com.fulan.vo.CarandInsured;

@Service
public class InsuredServiceImpl implements InsuredService {
	
	Logger logger = LoggerFactory.getLogger(getClass());
	
	@Resource
	private CarInformationMapper carInformationDao;
	@Resource
	private PolicyInformationMapper policyInformationMapper;
	@Resource
	private CertDictionatyMapper certDictionatyMapper;
	
	
	/**
	 * 获取字典
	 * @return
	 */
	public List<CertDictionaty> getCertType() {
		List<CertDictionaty> list = certDictionatyMapper.selectAll();
		/*
		 * List<Map<String,String>> mapList = new ArrayList<Map<String,String>>();
		 * for(CertDictionaty cert : list) { Map<String,String> map = new
		 * HashMap<String,String>(); map.put(cert.getCode(), cert.getName());
		 * mapList.add(map); }
		 */
		return list;
	}
	
	
	@Transactional
	/**
	 * 插入
	 * @param carandInsured
	 * @throws ParseException
	 */
	public void insert(CarandInsured carandInsured) throws ParseException {
		
		CarInformation car = new CarInformation(); 
		PolicyInformation policy = new PolicyInformation();
		
		BeanUtils.copyProperties(carandInsured, car);
		
		car.setId(UUID.randomUUID().toString().replaceAll("-",""));
		//日志
		logger.info(car.getId());
		
		if(carandInsured.getCarFristRegistrationDate() != null) {
			String dateString = carandInsured.getCarFristRegistrationDate();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date date = sdf.parse(dateString);
			car.setCarFristRegistrationDate(date);
		}
		
		BeanUtils.copyProperties(carandInsured, policy);
		policy.setId(UUID.randomUUID().toString().replaceAll("-",""));
		
		//日志
		logger.info(policy.getId());
		carInformationDao.insert(car);
		policyInformationMapper.insert(policy);
	}
	
	
}
