import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class ClientService {
    public ArrayList<InforClient> getInforClient(){
        ArrayList<InforClient> clients = new ArrayList<>();

        Gson gson = new Gson();
        try {
            FileReader reader = new FileReader("InforClient.json");
            Type type = new TypeToken<ArrayList<InforClient>>(){}.getType();
            clients = gson.fromJson(reader, type);
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file");
        }
        return clients;
    }

    public void show(ArrayList<InforClient> clients){
        for (InforClient i: clients){
            System.out.println(i);
        }
    }

}
