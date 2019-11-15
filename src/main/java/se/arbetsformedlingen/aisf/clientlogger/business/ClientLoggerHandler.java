package se.arbetsformedlingen.aisf.clientlogger.business;

import se.arbetsformedlingen.aisf.clientlogger.dao.ClientLoggerDAO;
import se.arbetsformedlingen.aisf.clientlogger.exception.ClientLoggerException;
import se.arbetsformedlingen.aisf.clientlogger.model.ClientLoggerEntity;
import se.arbetsformedlingen.aisf.clientlogger.vo.ClientLoggerCreateVO;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.sql.Timestamp;

@RequestScoped
public class ClientLoggerHandler {
    @Inject
    ClientLoggerDAO clientLoggerDAO;

    private static final String LOG_SERVER_ID_UNKNOWN = "unknown log-server id";

    public void createLogRecord(ClientLoggerCreateVO clientLoggerCreateVO) throws ClientLoggerException {
        if (clientLoggerCreateVO.getLogTimestamp() == null) {
            clientLoggerCreateVO.setLogTimestamp(new Timestamp(System.currentTimeMillis()));
        }

        ClientLoggerEntity clientLogger = createEntity(clientLoggerCreateVO);
        try {
            clientLoggerDAO.create(clientLogger);
        } catch (Exception e) {
            ClientLoggerException e2 = new ClientLoggerException("fel vid sparande av loggmeddelande i databasen: " + e.getMessage());
            throw e2;
        }
    }

    private ClientLoggerEntity createEntity(ClientLoggerCreateVO clientLoggerCreateVO) {
        ClientLoggerEntity clientLoggerEntity = new ClientLoggerEntity();

        clientLoggerEntity.setClazz(clientLoggerCreateVO.getClazz());
        clientLoggerEntity.setClientId(clientLoggerCreateVO.getClientId());
        clientLoggerEntity.setEndUserId(clientLoggerCreateVO.getEndUserId());
        clientLoggerEntity.setMessageCode(clientLoggerCreateVO.getMessageCode());
        clientLoggerEntity.setMessageText(clientLoggerCreateVO.getMessageText());
        clientLoggerEntity.setMethod(clientLoggerCreateVO.getMethod());
        clientLoggerEntity.setSubsystem(clientLoggerCreateVO.getSubsystem());
        clientLoggerEntity.setSystem(clientLoggerCreateVO.getSystem());
        clientLoggerEntity.setTimestamp(new Timestamp(System.currentTimeMillis()));
        clientLoggerEntity.setLogTimestamp(clientLoggerCreateVO.getLogTimestamp());


        try {
            InetAddress ip = InetAddress.getLocalHost();
            clientLoggerEntity.setLogServer(ip.getHostAddress());
            clientLoggerEntity.setLogServer(ip.getHostAddress());
        } catch (UnknownHostException e) {
            clientLoggerEntity.setLogServer(LOG_SERVER_ID_UNKNOWN);
        }

        return clientLoggerEntity;
    }
}
