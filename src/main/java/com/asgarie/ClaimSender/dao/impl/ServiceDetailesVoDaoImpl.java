package com.asgarie.ClaimSender.dao.impl;

import com.asgarie.ClaimSender.dao.api.ServiceDetailesVoDao;
import com.asgarie.ClaimSender.entity.ask.ServiceDetailesVo;
import com.asgarie.ClaimSender.entity.mappers.ServiceDetailesVoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ServiceDetailesVoDaoImpl implements ServiceDetailesVoDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public List<ServiceDetailesVo> getList(Integer sepasId) {
        String sql = "select * from ServiceDetailesVo";
        RowMapper<ServiceDetailesVo> rowMapper = new ServiceDetailesVoMapper();
        return this.jdbcTemplate.query(sql,rowMapper);    }
}
