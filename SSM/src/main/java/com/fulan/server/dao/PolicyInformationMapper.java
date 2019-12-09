package com.fulan.server.dao;

import com.fulan.server.model.PolicyInformation;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PolicyInformationMapper {
    int deleteByPrimaryKey(String id);

    int insert(PolicyInformation record);

    PolicyInformation selectByPrimaryKey(String id);

    List<PolicyInformation> selectAll();

    int updateByPrimaryKey(PolicyInformation record);
}