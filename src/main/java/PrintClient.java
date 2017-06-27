import java.util.List;

/**
 * Created by Megaprey on 27.06.2017.
 */
public class PrintClient {
    public static void print(List<CountClients> listClients){
        System.out.println("Top 10 most active IP addresses : ");
        for(int i = 0; i < 10 && i < listClients.size(); i++){
            System.out.println(i + 1 +") IP : " + listClients.get(i).getIp() + "; " + " Number of hits that received the return code 500 : " + listClients.get(i).getCount500());
        }
    }
}
