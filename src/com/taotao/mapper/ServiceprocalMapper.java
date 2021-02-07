package com.taotao.mapper;

import com.taotao.pojo.Serviceprocal;
import com.taotao.pojo.ServiceprocalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ServiceprocalMapper {
    int countByExample(ServiceprocalExample example);

    int deleteByExample(ServiceprocalExample example);

    int insert(Serviceprocal record);

    int insertSelective(Serviceprocal record);

    List<Serviceprocal> selectByExample(ServiceprocalExample example);

    int updateByExampleSelective(@Param("record") Serviceprocal record, @Param("example") ServiceprocalExample example);

    int updateByExample(@Param("record") Serviceprocal record, @Param("example") ServiceprocalExample example);
}