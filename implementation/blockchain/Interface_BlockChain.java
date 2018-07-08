import java.util.List;


public interface Interface_BlockChain {

    // Put data on the blockchain
     
    boolean put(String key, Record data);

//	Get data from the blockchain
    
    List<Record> get(String key);

    //Get all data from the blockchain
     
    List<Record> all();
}
