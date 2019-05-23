package com.asgarie.ClaimSender.dao.impl;

import com.asgarie.ClaimSender.dao.api.HealthcareProviderVoDao;
import com.asgarie.ClaimSender.entity.ask.HealthcareProviderVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class HealthcareProviderVoDaoImpl implements HealthcareProviderVoDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public HealthcareProviderVo getById(Integer sepasId) {

        String sql = "SELECT  * FROM HealthcareProviderVo WHERE SepasID = ?";
        RowMapper<HealthcareProviderVo> rowMapper = new BeanPropertyRowMapper<>(HealthcareProviderVo.class);
        HealthcareProviderVo healthcareProviderVo = jdbcTemplate.queryForObject(sql, rowMapper, sepasId);
        return healthcareProviderVo;
    }
}
