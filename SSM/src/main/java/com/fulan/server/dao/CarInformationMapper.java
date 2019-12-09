package com.fulan.server.dao;

import com.fulan.server.model.CarInformation;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CarInformationMapper {
    int insert(CarInformation record);

    List<CarInformation> selectAll();
}