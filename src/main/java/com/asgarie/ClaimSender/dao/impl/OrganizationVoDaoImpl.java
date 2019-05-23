package com.asgarie.ClaimSender.dao.impl;

import com.asgarie.ClaimSender.dao.api.OrganizationVoDao;
import com.asgarie.ClaimSender.entity.ask.OrganizationVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class OrganizationVoDaoImpl implements OrganizationVoDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public OrganizationVo getById(Integer sepasId) {

        String sql = "SELECT  * FROM OrganizationVo WHERE SepasID = ?";
        RowMapper<OrganizationVo> rowMapper = new BeanPropertyRowMapper<>(OrganizationVo.class);
        OrganizationVo organizationVo = jdbcTemplate.queryForObject(sql, rowMapper, sepasId);
        return organizationVo;
    }
}
