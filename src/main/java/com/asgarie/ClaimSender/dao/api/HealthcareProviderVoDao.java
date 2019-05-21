package com.asgarie.ClaimSender.dao.api;

import com.asgarie.ClaimSender.entity.asg.HealthcareProviderVo;

import java.util.List;

public interface HealthcareProviderVoDao {
    List<HealthcareProviderVo> getHealthcareProviderVoList(Integer sepasId);
}
