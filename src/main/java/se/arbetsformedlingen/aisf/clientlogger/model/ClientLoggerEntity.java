package se.arbetsformedlingen.aisf.clientlogger.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name = "client_logger", schema = "public", catalog = "aisf")
public class ClientLoggerEntity {
    private Integer clientLoggerId;
    private String system;
    private String subsystem;
    private String clazz;
    private String method;
    private Integer messageCode;
    private String messageText;
    private String endUserId;
    private String clientId;
    private Timestamp timestamp;
    private Timestamp logTimestamp;
    private String logServer;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "client_logger_id", nullable = false)
    public Integer getClientLoggerId() {
        return clientLoggerId;
    }

    public void setClientLoggerId(Integer clientLoggerId) {
        this.clientLoggerId = clientLoggerId;
    }

    @Basic
    @Column(name = "system", nullable = false, length = 255)
    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    @Basic
    @Column(name = "subsystem", nullable = false, length = 255)
    public String getSubsystem() {
        return subsystem;
    }

    public void setSubsystem(String subsystem) {
        this.subsystem = subsystem;
    }

    @Basic
    @Column(name = "class", nullable = false, length = 255)
    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    @Basic
    @Column(name = "method", nullable = false, length = 255)
    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    @Basic
    @Column(name = "message_code", nullable = true)
    public Integer getMessageCode() {
        return messageCode;
    }

    public void setMessageCode(Integer messageCode) {
        this.messageCode = messageCode;
    }

    @Basic
    @Column(name = "message_text", nullable = true, length = 255)
    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    @Basic
    @Column(name = "end_user_id", nullable = true, length = 255)
    public String getEndUserId() {
        return endUserId;
    }

    public void setEndUserId(String endUserId) {
        this.endUserId = endUserId;
    }

    @Basic
    @Column(name = "client_id", nullable = true, length = 255)
    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    @Basic
    @Column(name = "timestamp", nullable = true)
    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    @Basic
    @Column(name = "log_timestamp", nullable = true)
    public Timestamp getLogTimestamp() {

        return logTimestamp;
    }

    public void setLogTimestamp(Timestamp logTimestamp) {
        this.logTimestamp = logTimestamp;
    }

    @Basic
    @Column(name = "log_server", nullable = true)
    public String getLogServer() {
        return logServer;
    }

    public void setLogServer(String logServer) {
        this.logServer = logServer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClientLoggerEntity that = (ClientLoggerEntity) o;

        if (clientLoggerId != that.clientLoggerId) return false;
        if (system != null ? !system.equals(that.system) : that.system != null) return false;
        if (subsystem != null ? !subsystem.equals(that.subsystem) : that.subsystem != null) return false;
        if (clazz != null ? !clazz.equals(that.clazz) : that.clazz != null) return false;
        if (method != null ? !method.equals(that.method) : that.method != null) return false;
        if (messageCode != null ? !messageCode.equals(that.messageCode) : that.messageCode != null) return false;
        if (messageText != null ? !messageText.equals(that.messageText) : that.messageText != null) return false;
        if (endUserId != null ? !endUserId.equals(that.endUserId) : that.endUserId != null) return false;
        if (clientId != null ? !clientId.equals(that.clientId) : that.clientId != null) return false;
        if (timestamp != null ? !timestamp.equals(that.timestamp) : that.timestamp != null) return false;
        if (logTimestamp != null ? !logTimestamp.equals(that.logTimestamp) : that.logTimestamp != null) return false;
        if (logServer != null ? !logServer.equals(that.logServer) : that.logServer != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = clientLoggerId;
        result = 31 * result + (system != null ? system.hashCode() : 0);
        result = 31 * result + (subsystem != null ? subsystem.hashCode() : 0);
        result = 31 * result + (clazz != null ? clazz.hashCode() : 0);
        result = 31 * result + (method != null ? method.hashCode() : 0);
        result = 31 * result + (messageCode != null ? messageCode.hashCode() : 0);
        result = 31 * result + (messageText != null ? messageText.hashCode() : 0);
        result = 31 * result + (endUserId != null ? endUserId.hashCode() : 0);
        result = 31 * result + (clientId != null ? clientId.hashCode() : 0);
        result = 31 * result + (timestamp != null ? timestamp.hashCode() : 0);
        result = 31 * result + (logTimestamp != null ? logTimestamp.hashCode() : 0);
        result = 31 * result + (logServer != null ? logServer.hashCode() : 0);

        return result;
    }

    @Override
    public String toString() {
        return "ClientLoggerEntity{" +
                "clientLoggerId=" + clientLoggerId +
                ", system='" + system + '\'' +
                ", subsystem='" + subsystem + '\'' +
                ", clazz='" + clazz + '\'' +
                ", method='" + method + '\'' +
                ", messageCode=" + messageCode +
                ", messageText='" + messageText + '\'' +
                ", endUserId='" + endUserId + '\'' +
                ", clientId='" + clientId + '\'' +
                ", timestamp=" + timestamp + '\'' +
                ", logTimestamp=" + logTimestamp + '\'' +
                ", logServer='" + logServer + '\'' +
                '}';
    }
}
