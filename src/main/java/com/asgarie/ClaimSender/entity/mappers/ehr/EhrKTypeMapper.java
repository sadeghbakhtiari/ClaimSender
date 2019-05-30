package com.asgarie.ClaimSender.entity.mappers.ehr;

import com.asgarie.ClaimSender.entity.ask.ehr.EhrKType;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EhrKTypeMapper implements RowMapper<EhrKType> {

    @Override
    public EhrKType mapRow(ResultSet row, int rowNum) throws SQLException {
        EhrKType ehrKType = new EhrKType();
        ehrKType.setCode(row.getString("code"));
        ehrKType.setValue(row.getString("value"));
        return ehrKType;
    }
}
