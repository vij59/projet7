package org.application.consumer.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.application.consumer.contract.UserDAO;
import org.application.model.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class UserDAOImpl extends AbstractDAO implements UserDAO {

	
	public List<User> getUsers() {
		String vSQL = "SELECT * FROM utilisateur";

        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());

        RowMapper<User> vRowMapper = new RowMapper<User>() {
            public User mapRow(ResultSet pRS, int pRowNum) throws SQLException {
                User vUser = new User();
                vUser.setId(pRS.getInt("id"));
                vUser.setUsername(pRS.getString("nom"));
                vUser.setPassword(pRS.getString("mdp"));
                return vUser;
            }
        };

        List<User> vListUser = vJdbcTemplate.query(vSQL, vRowMapper);

        return vListUser;
	}

}
