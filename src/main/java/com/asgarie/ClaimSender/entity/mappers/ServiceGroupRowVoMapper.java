package com.asgarie.ClaimSender.entity.mappers;

import com.asgarie.ClaimSender.entity.ask.ServiceGroupRowVo;
import com.asgarie.ClaimSender.service.common.CommonUtils;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ServiceGroupRowVoMapper implements RowMapper<ServiceGroupRowVo> {

    @Override
    public ServiceGroupRowVo mapRow(ResultSet row, int rowNum) throws SQLException {
        ServiceGroupRowVo admissionVo = new ServiceGroupRowVo();
        admissionVo.setId(CommonUtils.handleNull(row.getString("ID")));
        admissionVo.setPatientContribution(CommonUtils.handleDoubleNull(row.getString("PatientContribution")));
        admissionVo.setBasicInsuranceContribution(CommonUtils.handleDoubleNull(row.getString("BasicInsuranceContribution")));
        admissionVo.setTotalCharge(CommonUtils.handleDoubleNull(row.getString("TotalCharge")));
        admissionVo.setServiceType(CommonUtils.handleFloatNull(row.getString("ServiceType")));
        admissionVo.setServiceCountMagnitude(CommonUtils.handleDoubleNull(row.getString("ServiceCountMagnitude")));
        admissionVo.setServiceCount(row.getString("ServiceCount"));
        admissionVo.setServiceTitle(row.getString("ServiceTitle"));
        admissionVo.settCost(CommonUtils.handleDoubleNull(row.getString("T_Cost")));
        admissionVo.setdCost(CommonUtils.handleDoubleNull(row.getString("D_Cost")));
        admissionVo.setTakmiliCost(CommonUtils.handleDoubleNull(row.getString("TakmiliCost")));
        admissionVo.setSepasId(CommonUtils.handleNull(row.getString("SepasID")));
        return admissionVo;
    }

}
