/**
 * Created by Megaprey on 27.06.2017.
 */
public class CountClients implements Comparable<CountClients> {
    private String ip;
    private int countIP;
    private int count500;

    public String getIp() {
        return ip;
    }

    public int getCountIP() {
        return countIP;
    }

    public int getCount500() {
        return count500;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public void setCountIP(int countIP) {
        this.countIP = countIP;
    }

    public void setCount500(int count500) {
        this.count500 = count500;
    }

    public int compareTo(CountClients c1) {
        if(this.countIP > c1.countIP){
            return 1;
        }
        if(this.countIP < c1.countIP){
            return -1;
        }
        return 0;
    }
}
