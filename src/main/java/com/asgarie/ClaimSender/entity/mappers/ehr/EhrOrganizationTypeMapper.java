package com.asgarie.ClaimSender.entity.mappers.ehr;

import com.asgarie.ClaimSender.entity.ask.ehr.EhrOrganizationType;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EhrOrganizationTypeMapper implements RowMapper<EhrOrganizationType> {

    @Override
    public EhrOrganizationType mapRow(ResultSet row, int rowNum) throws SQLException {
        EhrOrganizationType ehrOrganizationType = new EhrOrganizationType();
        ehrOrganizationType.setCode(row.getString("code"));
        ehrOrganizationType.setValue(row.getString("value"));
        return ehrOrganizationType;
    }
}
