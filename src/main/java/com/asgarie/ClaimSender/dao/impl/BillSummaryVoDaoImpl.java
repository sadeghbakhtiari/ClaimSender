package com.asgarie.ClaimSender.dao.impl;

import com.asgarie.ClaimSender.dao.api.BillSummaryVoDao;
import com.asgarie.ClaimSender.entity.ask.BillSummaryVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class BillSummaryVoDaoImpl implements BillSummaryVoDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public BillSummaryVo getById(Integer sepasId) {

        String sql = "SELECT  * FROM BillSummaryVo WHERE SepasID = ?";
        RowMapper<BillSummaryVo> rowMapper = new BeanPropertyRowMapper<>(BillSummaryVo.class);
        BillSummaryVo billSummaryVo = jdbcTemplate.queryForObject(sql, rowMapper, sepasId);
        return billSummaryVo;
    }
}
