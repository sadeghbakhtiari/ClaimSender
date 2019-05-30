package com.asgarie.ClaimSender.entity.mappers.ehr;

import com.asgarie.ClaimSender.entity.ask.ehr.EhrDeathLocation;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EhrDeathLocationMapper implements RowMapper<EhrDeathLocation> {

    @Override
    public EhrDeathLocation mapRow(ResultSet row, int rowNum) throws SQLException {
        EhrDeathLocation ehrDeathLocation = new EhrDeathLocation();
        ehrDeathLocation.setCode(row.getString("code"));
        ehrDeathLocation.setValue(row.getString("value"));
        return ehrDeathLocation;
    }
}
