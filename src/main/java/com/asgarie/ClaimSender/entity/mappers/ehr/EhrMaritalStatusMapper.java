package com.asgarie.ClaimSender.entity.mappers.ehr;

import com.asgarie.ClaimSender.entity.ask.ehr.EhrMaritalStatus;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EhrMaritalStatusMapper implements RowMapper<EhrMaritalStatus> {

    @Override
    public EhrMaritalStatus mapRow(ResultSet row, int rowNum) throws SQLException {
        EhrMaritalStatus ehrMaritalStatus = new EhrMaritalStatus();
        ehrMaritalStatus.setCode(row.getString("code"));
        ehrMaritalStatus.setValue(row.getString("value"));
        return ehrMaritalStatus;
    }
}
