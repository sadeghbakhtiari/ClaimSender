package com.asgarie.ClaimSender.dao.impl;

import com.asgarie.ClaimSender.dao.api.BillPatientCompositionVoDao;
import com.asgarie.ClaimSender.entity.ask.BillPatientCompositionVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository

public class BillPatientCompositionVoDaoImpl implements BillPatientCompositionVoDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public BillPatientCompositionVo getById(Integer sepasId) {
        String sql = "SELECT  * FROM BillPatientCompositionVo WHERE SepasID = ?";
        RowMapper<BillPatientCompositionVo> rowMapper = new BeanPropertyRowMapper<>(BillPatientCompositionVo.class);
        BillPatientCompositionVo basicDeathDetailsVo = jdbcTemplate.queryForObject(sql, rowMapper, sepasId);
        return basicDeathDetailsVo;    }
}
