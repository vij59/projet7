package org.application.consumer.impl;

import java.util.List;

import org.application.consumer.contract.AbstractDAO;
import org.application.consumer.contract.AuteurDAO;
import org.application.consumer.rowmapper.AuteurRM;
import org.application.model.Auteur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

public class AuteurDaoImpl extends AbstractDAO implements AuteurDAO {

	@Autowired
	private AuteurRM auteurRM;

	public AuteurRM getAuteurRM() {
		return auteurRM;
	}

	public void setAuteurRM(AuteurRM auteurRM) {
		this.auteurRM = auteurRM;
	}

	@Override
	public List<Auteur> getAuteurs() {

		JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());

		String sql = "SELECT * FROM auteur";

		return vJdbcTemplate.query(sql, auteurRM);
	}

	@Override
	public List<Auteur> getAuteurByNom(String nom) {

		JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());

		String var = "'" + nom + "'";
		String vSQL = "SELECT * FROM auteur WHERE nom = " + var;

		try {
			List<Auteur> auteurs = vJdbcTemplate.query(vSQL, auteurRM);
			return auteurs;
		} catch (EmptyResultDataAccessException vEx) {
			return null;
		}
	}

	@Override
	public Auteur getAuteurById(int id) {

		String vSQL = "SELECT * FROM auteur WHERE id = :id";
		NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());
		MapSqlParameterSource vParams = new MapSqlParameterSource("id", id);

		try {
			Auteur auteur = vJdbcTemplate.queryForObject(vSQL, vParams, auteurRM);
			return auteur;
		} catch (EmptyResultDataAccessException vEx) {
			return null;
		}
	}

}
