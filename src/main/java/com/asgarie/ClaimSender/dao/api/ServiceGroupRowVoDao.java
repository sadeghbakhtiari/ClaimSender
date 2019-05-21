package com.asgarie.ClaimSender.dao.api;

import com.asgarie.ClaimSender.entity.asg.ServiceGroupRowVo;

import java.util.List;

public interface ServiceGroupRowVoDao {
    List<ServiceGroupRowVo> getServiceGroupRowVoList(Integer sepasId);
}
