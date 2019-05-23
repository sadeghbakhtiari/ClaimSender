package com.asgarie.ClaimSender.dao.api;

import com.asgarie.ClaimSender.entity.ask.DiagnosisVo;

import java.util.List;

public interface DiagnosisVoDao {
    List<DiagnosisVo> getList(Integer sepasId);
}
