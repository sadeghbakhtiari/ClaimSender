package com.asgarie.ClaimSender.entity.mappers;

import com.asgarie.ClaimSender.entity.ask.InsuranceVo;
import com.asgarie.ClaimSender.service.common.CommonUtils;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class InsuranceVoMapper implements RowMapper<InsuranceVo> {

    @Override
    public InsuranceVo mapRow(ResultSet row, int rowNum) throws SQLException {
        InsuranceVo insuranceVo = new InsuranceVo();
        insuranceVo.setId(CommonUtils.handleNull(row.getString("ID")));
        insuranceVo.setInsuranceBookletSerialNumber(row.getString("InsuranceBookletSerialNumber"));
        insuranceVo.setInsuranceExpirationYear(CommonUtils.handleNull(row.getString("InsuranceExpirationYear")));
        insuranceVo.setInsuranceExpirationMonth(CommonUtils.handleNull(row.getString("InsuranceExpirationMonth")));
        insuranceVo.setInsuranceExpirationDay(CommonUtils.handleNull(row.getString("InsuranceExpirationDay")));
        insuranceVo.setInsuranceBoxCode(row.getString("InsuranceBoxCode"));
        insuranceVo.setInsuredNumber(row.getString("InsuredNumber"));
        insuranceVo.setInsurerCode(row.getString("InsurerCode"));
        insuranceVo.setShebad(row.getString("SHEBAD"));
        insuranceVo.setSepasId(CommonUtils.handleNull(row.getString("SepasID")));
        return insuranceVo;
    }

}
