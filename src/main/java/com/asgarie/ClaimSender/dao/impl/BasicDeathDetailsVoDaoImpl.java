package com.asgarie.ClaimSender.dao.impl;

import com.asgarie.ClaimSender.dao.api.BasicDeathDetailsVoDao;
import com.asgarie.ClaimSender.entity.ask.BasicDeathDetailsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository

public class BasicDeathDetailsVoDaoImpl implements BasicDeathDetailsVoDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public BasicDeathDetailsVo getById(Integer sepasId) {
        String sql = "SELECT  * FROM BasicDeathDetailsVo WHERE SepasID = ?";
        RowMapper<BasicDeathDetailsVo> rowMapper = new BeanPropertyRowMapper<>(BasicDeathDetailsVo.class);
        BasicDeathDetailsVo basicDeathDetailsVo = null;
        try {
            basicDeathDetailsVo = jdbcTemplate.queryForObject(sql, rowMapper, sepasId);
        } catch (EmptyResultDataAccessException e) {
            return new BasicDeathDetailsVo();
        }
        return basicDeathDetailsVo;
    }
}
