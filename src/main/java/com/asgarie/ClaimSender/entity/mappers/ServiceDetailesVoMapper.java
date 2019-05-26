package com.asgarie.ClaimSender.entity.mappers;

import com.asgarie.ClaimSender.entity.ask.ServiceDetailesVo;
import com.asgarie.ClaimSender.service.common.CommonUtils;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ServiceDetailesVoMapper implements RowMapper<ServiceDetailesVo> {

    @Override
    public ServiceDetailesVo mapRow(ResultSet row, int rowNum) throws SQLException {
        ServiceDetailesVo serviceDetailesVo = new ServiceDetailesVo();
        serviceDetailesVo.setSepasId(CommonUtils.handleNull(row.getString("SepasID")));
        serviceDetailesVo.setId(CommonUtils.handleNull(row.getString("ID")));
        serviceDetailesVo.setBasicInsuranceContribution(CommonUtils.handleDoubleNull(row.getString("BasicInsuranceContribution")));
        serviceDetailesVo.setPatientContribution(CommonUtils.handleDoubleNull(row.getString("PatientContribution")));
        serviceDetailesVo.setTotalCharge(CommonUtils.handleDoubleNull(row.getString("TotalCharge")));
        serviceDetailesVo.setBed(row.getString("Bed"));
        serviceDetailesVo.setRoom(row.getString("Room"));
        serviceDetailesVo.setStartYear(CommonUtils.handleNull(row.getString("StartYear")));
        serviceDetailesVo.setStartMonth(CommonUtils.handleNull(row.getString("StartMonth")));
        serviceDetailesVo.setStartDay(CommonUtils.handleNull(row.getString("StartDay")));
        serviceDetailesVo.setStartHour(CommonUtils.handleNull(row.getString("StartHour")));
        serviceDetailesVo.setStartMinute(CommonUtils.handleNull(row.getString("StartMinute")));
        serviceDetailesVo.setStartSecond(CommonUtils.handleNull(row.getString("StartSecond")));
        serviceDetailesVo.setEndYear(CommonUtils.handleNull(row.getString("EndYear")));
        serviceDetailesVo.setEndMonth(CommonUtils.handleNull(row.getString("EndMonth")));
        serviceDetailesVo.setEndDay(CommonUtils.handleNull(row.getString("EndDay")));
        serviceDetailesVo.setEndHour(CommonUtils.handleNull(row.getString("EndHour")));
        serviceDetailesVo.setEndMinute(CommonUtils.handleNull(row.getString("EndMinute")));
        serviceDetailesVo.setEndSecond(CommonUtils.handleNull(row.getString("EndSecond")));
        serviceDetailesVo.setServiceCode(row.getString("ServiceCode"));
        serviceDetailesVo.setServiceTerminology(row.getString("ServiceTerminology"));
        serviceDetailesVo.setServiceCountMagnitude(CommonUtils.handleDoubleNull(row.getString("ServiceCountMagnitude")));
        serviceDetailesVo.setServiceCount(row.getString("ServiceCount"));
        serviceDetailesVo.setServiceType(CommonUtils.handleFloatNull(row.getString("ServiceType")));
        serviceDetailesVo.setServiceTitle(row.getString("ServiceTitle"));
        serviceDetailesVo.setWardName(row.getString("WardName"));
        serviceDetailesVo.setWardType(row.getString("WardType"));
        serviceDetailesVo.setPkid(row.getString("PKID"));
        serviceDetailesVo.settCost(CommonUtils.handleDoubleNull(row.getString("T_Cost")));
        serviceDetailesVo.setdCost(CommonUtils.handleDoubleNull(row.getString("D_Cost")));
        serviceDetailesVo.setTakmiliCost(CommonUtils.handleDoubleNull(row.getString("TakmiliCost")));
        serviceDetailesVo.setZaribFani(CommonUtils.handleDoubleNull(row.getString("ZaribFani")));
        serviceDetailesVo.setZaribHerfei(CommonUtils.handleDoubleNull(row.getString("ZaribHerfei")));
        serviceDetailesVo.setTerminology(row.getString("Terminology"));
        return serviceDetailesVo;
    }

}
