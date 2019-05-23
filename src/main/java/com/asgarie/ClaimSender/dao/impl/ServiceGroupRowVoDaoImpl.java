package com.asgarie.ClaimSender.dao.impl;

import com.asgarie.ClaimSender.dao.api.ServiceGroupRowVoDao;
import com.asgarie.ClaimSender.entity.ask.ServiceGroupRowVo;
import com.asgarie.ClaimSender.entity.mappers.ServiceGroupRowVoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ServiceGroupRowVoDaoImpl implements ServiceGroupRowVoDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public List<ServiceGroupRowVo> getList(Integer sepasId) {
        String sql = "select * from ServiceGroupRowVo";
        RowMapper<ServiceGroupRowVo> rowMapper = new ServiceGroupRowVoMapper();
        return this.jdbcTemplate.query(sql,rowMapper);    }
}
