package com.asgarie.ClaimSender.dao.impl;

import com.asgarie.ClaimSender.dao.api.ProviderInfoVoDao;
import com.asgarie.ClaimSender.entity.ask.ProviderInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class ProviderInfoVoDaoImpl implements ProviderInfoVoDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public ProviderInfoVo getById(Integer sepasId) {

        String sql = "SELECT  * FROM ProviderInfoVo WHERE SepasID = ?";
        RowMapper<ProviderInfoVo> rowMapper = new BeanPropertyRowMapper<>(ProviderInfoVo.class);
        ProviderInfoVo providerInfoVo = jdbcTemplate.queryForObject(sql, rowMapper, sepasId);
        return providerInfoVo;
    }
}
