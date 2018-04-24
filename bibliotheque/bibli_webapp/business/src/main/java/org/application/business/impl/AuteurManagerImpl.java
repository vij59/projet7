package org.application.business.impl;

import java.util.List;

import org.application.business.contract.AuteurManager;
import org.webservice.services.Auteur;

public class AuteurManagerImpl extends AbstractManager implements AuteurManager {

	@Override
	public List<Auteur> getAuteurs() {
		return getDaoFactory().getAuteurDao().getAuteurs();
	}

}
