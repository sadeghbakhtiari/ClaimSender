package com.asgarie.ClaimSender.entity.mappers;

import com.asgarie.ClaimSender.entity.ask.HealthcareProviderVo;
import com.asgarie.ClaimSender.service.common.CommonUtils;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class HealthCareProviderVoMapper implements RowMapper<HealthcareProviderVo> {

    @Override
    public HealthcareProviderVo mapRow(ResultSet row, int rowNum) throws SQLException {
        HealthcareProviderVo healthcareProviderVo = new HealthcareProviderVo();
        healthcareProviderVo.setHealthcareProviderFk(CommonUtils.handleNull(row.getString("HealthcareProviderFK")));
        healthcareProviderVo.setFirstName(row.getString("FirstName"));
        healthcareProviderVo.setLastName(row.getString("LastName"));
        healthcareProviderVo.setFullName(row.getString("FullName"));
        healthcareProviderVo.setIdentifierIssuer(row.getString("IdentifierIssuer"));
        healthcareProviderVo.setIdentifierAssigner(row.getString("IdentifierAssigner"));
        healthcareProviderVo.setIdentifierType(row.getString("IdentifierType"));
        healthcareProviderVo.setIdentifierId(row.getString("IdentifierId"));
        healthcareProviderVo.setRoleCode(row.getString("RoleCode"));
        healthcareProviderVo.setSpecialtyCode(row.getString("SpecialtyCode"));
        healthcareProviderVo.setRole(row.getString("Role"));
        healthcareProviderVo.setSepasId(CommonUtils.handleNull(row.getString("SepasID")));
        return healthcareProviderVo;
    }

}
