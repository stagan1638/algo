import java.lang.reflect.Array;
import java.util.ArrayList;

public class ChainHashTable<T1, T2> {
    private ArrayList<ArrayList<HashElement<T1, T2>>> table;

    public ChainHashTable(int amount){
        this.table = new ArrayList<>(amount);

        for(int i = 0; i < amount; i++){
            this.table.add(new ArrayList<HashElement<T1, T2>>());
        }
    }

    public HashElement<T1, T2> Search(T1 key)
    {
        int hash = key.hashCode() % table.size();
        if (table.get(hash) == null)
        {
            return null;
        }

        for(int i = 0; i < table.get(hash).size(); i++){
            if(table.get(hash).get(i).getKey() == key){
                return table.get(hash).get(i);
            }
        }
        return null;
    }

    public boolean Insert(T1 key, T2 value)
    {
        if(FillingCoefficicent() > 0.8){
            RebuildFunc();
        }

        if (Search(key) != null)
        {
            return false;
        }

        int hash = key.hashCode() % table.size();
        table.get(hash).add(new HashElement<>(key, value));
        return true;
    }

    public boolean Delete(T1 key)
    {
        int hash = key.hashCode() % table.size();
        if (table.get(hash) == null)
        {
            return false;
        }

        for(int i = 0; i < table.get(hash).size(); i++)
        {
            if (table.get(hash).get(i).getKey() == key)
            {
                return table.remove(table.get(hash).get(i));
            }
        }

        return false;
    }

    public double FillingCoefficicent(){
        int counter = 0;
        for (int i = 0; i < table.size(); i++){
            for(int j = 0; j < table.get(i).size(); j++){
                if(table.get(i).get(j) != null){
                    counter++;
                }
            }
        }
        return counter / (double)table.size();
    }

    public void RebuildFunc(){
        ArrayList<ArrayList<HashElement<T1, T2>>> temp = table;
        table = new ArrayList<>(temp.size() * 2);

        for(int i = 0; i < temp.size() * 2; i++) {
            table.add(null);
        }

        for (int i = 0; i < temp.size(); i++){
            if(temp.get(i) != null){
                for(int j = 0; j < temp.get(i).size(); j++){
                    Insert(temp.get(i).get(j).getKey(), temp.get(i).get(j).getValue());
                }
            }
        }
    }
}
