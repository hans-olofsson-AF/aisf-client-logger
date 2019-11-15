package se.arbetsformedlingen.aisf.clientlogger.dao;

import se.arbetsformedlingen.aisf.clientlogger.model.ClientLoggerEntity;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

//@ApplicationScoped
@Stateless
public class ClientLoggerDAO {
    @Inject
    private EntityManager em;

    public void create(ClientLoggerEntity clientLoggerEntity) throws Exception {
        clientLoggerEntity.setClientLoggerId(null);
        em.persist(clientLoggerEntity);
    }
}
