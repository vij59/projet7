package org.application.model;

import java.util.Date;

public class Emprunt {

	private Integer id;
	private Date dateDebut;
	private Date dateFin;
	private boolean enCours;
	private int idLivre;
	private int idUtilisateur;
	private boolean dejaRepousse;
	private Livre livre;
	private boolean repoussable;
	private String statut;
	private boolean recupere;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	public boolean isEnCours() {
		return enCours;
	}

	public void setEnCours(boolean enCours) {
		this.enCours = enCours;
	}

	public int getIdLivre() {
		return idLivre;
	}

	public void setIdLivre(int idLivre) {
		this.idLivre = idLivre;
	}

	public int getIdUtilisateur() {
		return idUtilisateur;
	}

	public void setIdUtilisateur(int idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}

	public boolean isDejaRepousse() {
		return dejaRepousse;
	}

	public void setDejaRepousse(boolean dejaRepousse) {
		this.dejaRepousse = dejaRepousse;
	}

	public Livre getLivre() {
		return livre;
	}

	public void setLivre(Livre livre) {
		this.livre = livre;
	}

	public boolean isRepoussable() {
		return repoussable;
	}

	public void setRepoussable(boolean repoussable) {
		this.repoussable = repoussable;
	}

	public String getStatut() {
		return statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}

	public boolean isRecupere() {
		return recupere;
	}

	public void setRecupere(boolean recupere) {
		this.recupere = recupere;
	}
}
