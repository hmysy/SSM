package com.fulan.server.dao;

import com.fulan.server.model.CertDictionaty;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CertDictionatyMapper {
    int insert(CertDictionaty record);

    List<CertDictionaty> selectAll();
}