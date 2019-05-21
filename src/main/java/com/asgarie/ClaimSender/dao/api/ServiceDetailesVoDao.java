package com.asgarie.ClaimSender.dao.api;

import com.asgarie.ClaimSender.entity.asg.ServiceDetailesVo;

import java.util.List;

public interface ServiceDetailesVoDao {
    List<ServiceDetailesVo> getServiceDetailesVoList(Integer sepasId);
}
