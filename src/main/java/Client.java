import java.util.Date;

/**
 * Created by Megaprey on 24.06.2017.
 */
public class Client {
    private String ip;
    private Date date;
    private MethodQueryHTTP methodQueryHTTP;
    private int codeReturned;

    public void setIp(String ip) {
        this.ip = ip;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getIp() {
        return ip;
    }

    public Date getDate() {
        return date;
    }

    public MethodQueryHTTP getMethodQueryHTTP() {
        return methodQueryHTTP;
    }

    public int getCodeReturned() {
        return codeReturned;
    }

    public void setMethodQueryHTTP(String methodQueryHTTP) {
        if(methodQueryHTTP.equals("GET")) {
            this.methodQueryHTTP = MethodQueryHTTP.GET;
        }
        if(methodQueryHTTP.equals("HEAD")) {
            this.methodQueryHTTP = MethodQueryHTTP.HEAD;
        }
        if(methodQueryHTTP.equals("POST")) {
            this.methodQueryHTTP = MethodQueryHTTP.POST;
        }
        if(methodQueryHTTP.equals("PUT")) {
            this.methodQueryHTTP = MethodQueryHTTP.PUT;
        }
        if(methodQueryHTTP.equals("PATCH")) {
            this.methodQueryHTTP = MethodQueryHTTP.PATCH;
        }
        if(methodQueryHTTP.equals("DELETE")) {
            this.methodQueryHTTP = MethodQueryHTTP.DELETE;
        }
        if(methodQueryHTTP.equals("TRACE")) {
            this.methodQueryHTTP = MethodQueryHTTP.TRACE;
        }
        if(methodQueryHTTP.equals("CONNECT")) {
            this.methodQueryHTTP = MethodQueryHTTP.CONNECT;
        }
    }

    public void setCodeReturned(int codeReturned) {
        this.codeReturned = codeReturned;
    }
}
