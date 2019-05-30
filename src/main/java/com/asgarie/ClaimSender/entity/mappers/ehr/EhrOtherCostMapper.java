package com.asgarie.ClaimSender.entity.mappers.ehr;

import com.asgarie.ClaimSender.entity.ask.ehr.EhrOtherCost;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EhrOtherCostMapper implements RowMapper<EhrOtherCost> {

    @Override
    public EhrOtherCost mapRow(ResultSet row, int rowNum) throws SQLException {
        EhrOtherCost ehrOtherCost = new EhrOtherCost();
        ehrOtherCost.setCode(row.getString("code"));
        ehrOtherCost.setValue(row.getString("value"));
        return ehrOtherCost;
    }
}
