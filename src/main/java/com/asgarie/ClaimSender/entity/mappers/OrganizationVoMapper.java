package com.asgarie.ClaimSender.entity.mappers;

import com.asgarie.ClaimSender.entity.ask.OrganizationVo;
import com.asgarie.ClaimSender.service.common.CommonUtils;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class OrganizationVoMapper implements RowMapper<OrganizationVo> {

    @Override
    public OrganizationVo mapRow(ResultSet row, int rowNum) throws SQLException {
        OrganizationVo organizationVo = new OrganizationVo();
        organizationVo.setId(CommonUtils.handleNull(row.getString("id")));
        organizationVo.setType(CommonUtils.handleNull(row.getString("Type")));
        organizationVo.setIdOrgan(row.getString("IDOrgan"));
        organizationVo.setName(row.getString("Name"));
        organizationVo.setType(CommonUtils.handleNull(row.getString("Type")));
        organizationVo.setLocation(row.getString("Location"));
        organizationVo.setSystemId(row.getString("SystemID"));
        organizationVo.setHospitalAccreditation(CommonUtils.handleNull(row.getString("HospitalAccreditation")));
        return organizationVo;
    }

}
