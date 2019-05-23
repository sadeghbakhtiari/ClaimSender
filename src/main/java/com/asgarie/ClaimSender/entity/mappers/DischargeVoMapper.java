package com.asgarie.ClaimSender.entity.mappers;

import com.asgarie.ClaimSender.entity.ask.DischargeVo;
import com.asgarie.ClaimSender.service.common.CommonUtils;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DischargeVoMapper implements RowMapper<DischargeVo> {

    @Override
    public DischargeVo mapRow(ResultSet row, int rowNum) throws SQLException {
        DischargeVo dischargeVo = new DischargeVo();
        dischargeVo.setConditionOnDischargeCode(row.getString("ConditionOnDischargeCode"));
        dischargeVo.setDischargeYear(CommonUtils.handleNull(row.getString("DischargeYear")));
        dischargeVo.setDischargeMonth(CommonUtils.handleNull(row.getString("DischargeMonth")));
        dischargeVo.setDischargeDay(CommonUtils.handleNull(row.getString("DischargeDay")));
        dischargeVo.setDischargeHour(CommonUtils.handleNull(row.getString("DischargeHour")));
        dischargeVo.setDischargeMinute(CommonUtils.handleNull(row.getString("DischargeMinute")));
        dischargeVo.setDischargeSecond(CommonUtils.handleNull(row.getString("DischargeSecond")));
        dischargeVo.setSepasId(CommonUtils.handleNull(row.getString("SepasID")));
        return dischargeVo;
    }

}
