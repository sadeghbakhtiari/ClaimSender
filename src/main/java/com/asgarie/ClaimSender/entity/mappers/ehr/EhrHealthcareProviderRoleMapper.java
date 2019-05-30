package com.asgarie.ClaimSender.entity.mappers.ehr;

import com.asgarie.ClaimSender.entity.ask.ehr.EhrHealthcareProviderRole;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EhrHealthcareProviderRoleMapper implements RowMapper<EhrHealthcareProviderRole> {

    @Override
    public EhrHealthcareProviderRole mapRow(ResultSet row, int rowNum) throws SQLException {
        EhrHealthcareProviderRole ehrHealthcareProviderRole = new EhrHealthcareProviderRole();
        ehrHealthcareProviderRole.setCode(row.getString("code"));
        ehrHealthcareProviderRole.setValue(row.getString("value"));
        return ehrHealthcareProviderRole;
    }
}
