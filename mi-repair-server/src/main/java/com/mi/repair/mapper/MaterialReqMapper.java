package com.mi.repair.mapper;

import com.github.pagehelper.Page;
import com.mi.repair.dto.MaterialReqPageQueryDTO;
import com.mi.repair.entity.MaterialReq;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author Kuroko
 * @description
 * @date 2024/5/16 12:58
 */
@Mapper
public interface MaterialReqMapper {

    long submit(MaterialReq materialReq);

    Page<MaterialReq> pageQuery(MaterialReqPageQueryDTO queryDTO);

    List<MaterialReq> selectByOrderId(Long orderId);
}
