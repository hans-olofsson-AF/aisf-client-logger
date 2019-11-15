package se.arbetsformedlingen.aisf.clientlogger.vo;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;

@XmlRootElement
public class ClientLoggerCreateVO implements Serializable {
    private String system;
    private String subsystem;
    private String clazz;
    private String method;
    private Integer messageCode;
    private String messageText;
    private String endUserId;
    private String clientId;
    private Timestamp logTimestamp;

    @Override
    public String toString() {
        return "ClientLogger{" +
                ", system='" + system + '\'' +
                ", subsystem='" + subsystem + '\'' +
                ", clazz='" + clazz + '\'' +
                ", method='" + method + '\'' +
                ", messageCode=" + messageCode +
                ", messageText='" + messageText + '\'' +
                ", endUserId='" + endUserId + '\'' +
                ", clientId='" + clientId + '\'' +
                ", logTimestamp='" + logTimestamp + '\'' +
                '}';
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    public String getSubsystem() {
        return subsystem;
    }

    public void setSubsystem(String subsystem) {
        this.subsystem = subsystem;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public Integer getMessageCode() {
        return messageCode;
    }

    public void setMessageCode(Integer messageCode) {
        this.messageCode = messageCode;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public String getEndUserId() {
        return endUserId;
    }

    public void setEndUserId(String endUserId) {
        this.endUserId = endUserId;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public Timestamp getLogTimestamp() {
        return logTimestamp;
    }

    public void setLogTimestamp(Timestamp logTimestamp) {
        this.logTimestamp = logTimestamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClientLoggerCreateVO that = (ClientLoggerCreateVO) o;
        return Objects.equals(system, that.system) &&
                Objects.equals(subsystem, that.subsystem) &&
                Objects.equals(clazz, that.clazz) &&
                Objects.equals(method, that.method) &&
                Objects.equals(messageCode, that.messageCode) &&
                Objects.equals(messageText, that.messageText) &&
                Objects.equals(endUserId, that.endUserId) &&
                Objects.equals(clientId, that.clientId) &&
                Objects.equals(logTimestamp, that.logTimestamp
                );
    }

    @Override
    public int hashCode() {
        return Objects.hash(system, subsystem, clazz, method, messageCode, messageText, endUserId, clientId, logTimestamp);
    }
}
