package com.asgarie.ClaimSender.entity.mappers.ehr;

import com.asgarie.ClaimSender.entity.ask.ehr.EhrEducationLevel;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EhrEducationLevelMapper implements RowMapper<EhrEducationLevel> {


    @Override
    public EhrEducationLevel mapRow(ResultSet row, int rowNum) throws SQLException {
        EhrEducationLevel ehrEducationLevel = new EhrEducationLevel();
        ehrEducationLevel.setCode(row.getString("code"));
        ehrEducationLevel.setValue(row.getString("value"));
        return ehrEducationLevel;
    }
}
