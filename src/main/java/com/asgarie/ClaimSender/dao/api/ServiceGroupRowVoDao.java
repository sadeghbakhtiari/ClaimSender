package com.asgarie.ClaimSender.dao.api;

import com.asgarie.ClaimSender.entity.ask.ServiceGroupRowVo;

import java.util.List;

public interface ServiceGroupRowVoDao {
    List<ServiceGroupRowVo> getList(Integer sepasId);
}
