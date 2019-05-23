package com.asgarie.ClaimSender.dao.api;

import com.asgarie.ClaimSender.entity.ask.AdmissionVo;
import com.asgarie.ClaimSender.entity.ask.HealthcareProviderVo;

public interface HealthcareProviderVoDao {
    HealthcareProviderVo getById(Integer sepasId);

}
