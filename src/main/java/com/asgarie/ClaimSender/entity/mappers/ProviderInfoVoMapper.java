package com.asgarie.ClaimSender.entity.mappers;

import com.asgarie.ClaimSender.entity.ask.ProviderInfoVo;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProviderInfoVoMapper implements RowMapper<ProviderInfoVo> {

    @Override
    public ProviderInfoVo mapRow(ResultSet row, int rowNum) throws SQLException {
        ProviderInfoVo providerInfoVo = new ProviderInfoVo();
        providerInfoVo.setFirstName(row.getString("FirstName"));
        providerInfoVo.setLastName(row.getString("LastName"));
        providerInfoVo.setFullName(row.getString("FullName"));
        providerInfoVo.setIdentifierIssuer(row.getString("IdentifierIssuer"));
        providerInfoVo.setIdentifierIssuer(row.getString("IdentifierAssigner"));
        providerInfoVo.setIdentifierType(row.getString("IdentifierType"));
        providerInfoVo.setIdentifierId(row.getString("IdentifierId"));
        return providerInfoVo;
    }

}
