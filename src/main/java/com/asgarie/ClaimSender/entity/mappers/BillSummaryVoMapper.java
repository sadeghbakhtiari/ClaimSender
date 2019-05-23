package com.asgarie.ClaimSender.entity.mappers;

import com.asgarie.ClaimSender.entity.ask.BillSummaryVo;
import com.asgarie.ClaimSender.service.common.CommonUtils;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BillSummaryVoMapper implements RowMapper<BillSummaryVo> {

    @Override
    public BillSummaryVo mapRow(ResultSet row, int rowNum) throws SQLException {
        BillSummaryVo billSummaryVo = new BillSummaryVo();
        billSummaryVo.setHospitalAccreditation(CommonUtils.handleNull(row.getString("HospitalAccreditation")));
        billSummaryVo.setInsurerCode(row.getString("InsurerCode"));
        billSummaryVo.setInsuranceBoxCode(row.getString("InsuranceBoxCode"));
        billSummaryVo.setMedicalRecordTypeCode(row.getString("MedicalRecordTypeCode"));
        billSummaryVo.setTotalBasicInsuranceContribution(CommonUtils.handleDoubleNull(row.getString("TotalBasicInsuranceContribution")));
        billSummaryVo.setTotalPatientContribution(CommonUtils.handleDoubleNull(row.getString("TotalPatientContribution")));
        billSummaryVo.setTotalCharge(CommonUtils.handleDoubleNull(row.getString("TotalCharge")));
        billSummaryVo.setTotalOtherCostsQuantitiesFk(CommonUtils.handleNull(row.getString("TotalOtherCosts_QuantitiesFK")));
        billSummaryVo.setGlobalPackage(row.getString("GlobalPackage"));
        billSummaryVo.setdCost(CommonUtils.handleDoubleNull(row.getString("D_Cost")));
        billSummaryVo.settCost(CommonUtils.handleDoubleNull(row.getString("T_Cost")));
        billSummaryVo.setTakhfif(CommonUtils.handleDoubleNull(row.getString("Takhfif")));
        billSummaryVo.setTakmiliCost(CommonUtils.handleDoubleNull(row.getString("TakmiliCost")));
        billSummaryVo.setSepasId(CommonUtils.handleNull(row.getString("SepasID")));
        return billSummaryVo;
    }

}
