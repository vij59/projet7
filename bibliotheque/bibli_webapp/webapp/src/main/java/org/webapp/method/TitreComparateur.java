package org.webapp.method;

import org.webservice.services.Livre;

import java.util.Comparator;

public class TitreComparateur implements Comparator<Livre> {

    public int compare(Livre p1, Livre p2) {

        String titre1 = p1.getTitre().toUpperCase();
        String titre2 = p2.getTitre().toUpperCase();

        return titre1.compareTo(titre2);
    }
}
