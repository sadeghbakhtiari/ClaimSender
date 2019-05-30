package com.asgarie.ClaimSender.dao.impl;

import com.asgarie.ClaimSender.dao.api.EhrDao;
import com.asgarie.ClaimSender.entity.ask.InsuranceVo;
import com.asgarie.ClaimSender.entity.ask.PatientTransfer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class EhrDaoImpl implements EhrDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Transactional(readOnly = true)
    @Override
    public Object getByEhrCode(Class clazz, String code) {
        if (code == null) {
            try {
                return clazz.newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        String path = clazz.getName();
        String sql = "SELECT  * FROM " + path.substring(path.lastIndexOf(".") + 1, path.length()) + " WHERE code = ?";
        RowMapper rowMapper = new BeanPropertyRowMapper(clazz);
        return jdbcTemplate.queryForObject(sql, rowMapper, code);
    }
}
