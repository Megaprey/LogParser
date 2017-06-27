import java.util.*;

/**
 * Created by Megaprey on 27.06.2017.
 */
public class Top10 {
    private static List<String> top = new ArrayList<String>();

    public static List<CountClients> sortTop10(){
        List<Client> clients = LogParser.getClients();
        List<CountClients> countClients = new ArrayList<CountClients>();


        for(int i = 0; i < clients.size(); i++){
            int countIP = 0;
            int count500 = 0;

            for(int j = 0; j < clients.size(); ){
                if(clients.get(i).getIp().equals(clients.get(j).getIp())){
                    if(clients.get(j).getCodeReturned() == 500){
                        count500++;
                    }
                    if(countIP > 0){
                        clients.remove(j);
                    }else {
                        j++;
                    }
                    countIP++;

                }else {
                    j++;
                }
            }

            CountClients countClient = new CountClients();
            countClient.setCount500(count500);
            countClient.setCountIP(countIP);
            countClient.setIp(clients.get(i).getIp());
            countClients.add(countClient);
        }

        Collections.sort(countClients);
        Collections.reverse(countClients);

        return countClients;
    }

}
