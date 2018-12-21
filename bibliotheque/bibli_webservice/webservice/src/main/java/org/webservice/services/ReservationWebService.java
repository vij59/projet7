package org.webservice.services;

import org.application.model.Reservation;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;


@WebService(serviceName = "Reservation")
    public class ReservationWebService extends AbstractWebservice {

        @WebMethod
        public List<Reservation> getListeReservation() {
            return getManagerFactory().getReservationManager().getListeReservations();
        }

}
