package com.asgarie.ClaimSender.entity.mappers.ehr;

import com.asgarie.ClaimSender.entity.ask.ehr.EhrConditionOnDischarge;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EhrConditionOnDischargeMapper implements RowMapper<EhrConditionOnDischarge> {

    @Override
    public EhrConditionOnDischarge mapRow(ResultSet row, int rowNum) throws SQLException {
        EhrConditionOnDischarge ehrConditionOnDischarge = new EhrConditionOnDischarge();
        ehrConditionOnDischarge.setCode(row.getString("code"));
        ehrConditionOnDischarge.setValue(row.getString("value"));
        return ehrConditionOnDischarge;
    }
}
