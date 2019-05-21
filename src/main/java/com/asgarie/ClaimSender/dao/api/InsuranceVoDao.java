package com.asgarie.ClaimSender.dao.api;

import com.asgarie.ClaimSender.entity.asg.InsuranceVo;

import java.util.List;

public interface InsuranceVoDao {
    List<InsuranceVo> getInsuranceVoList(Integer sepasId);
}
