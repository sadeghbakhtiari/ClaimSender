package com.asgarie.ClaimSender.dao.api;


import com.asgarie.ClaimSender.entity.ask.ServiceDetailesVo;

import java.util.List;

public interface ServiceDetailesVoDao {
    List<ServiceDetailesVo> getList(Integer sepasId);
}
