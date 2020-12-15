import java.util.ArrayList;

public class ProbingHashTable<T1, T2> {
    private ArrayList<HashElement<T1, T2>> table;
    private ArrayList<T1> deletedKeys;

    public ProbingHashTable(int amount){
        this.table = new ArrayList<>(amount);

        for(int i = 0; i < amount; i++){
            this.table.add(null);
        }

        this.deletedKeys = new ArrayList<>();
    }

    public HashElement<T1, T2> Search(T1 key){
        int hash = key.hashCode() % table.size();

        for (int i = hash; i < table.size(); i++){

            if(table.get(i) == null){
                return null;
            }

            if(table.get(i).getKey() == key){
                return table.get(hash);
            }
        }

        for(int i = 0; i < hash; i++){

            if(table.get(i) == null){
                return null;
            }

            if(table.get(i).getKey() == key){
                return table.get(hash);
            }
        }
        return null;
    }

    public boolean Insert(T1 key, T2 value){
        if(FillingCoefficicent() > 0.8){
            RebuildFunc();
        }

        if (Search(key) != null)
        {
            return false;
        }

        int hash = key.hashCode() % table.size();

        for(int i = hash; i < table.size(); i++){

            if(table.get(i) == null){
                table.set(i, new HashElement<T1, T2>(key, value));
                return true;
            }
        }

        for(int i = 0; i < hash; i++){

            if(table.get(i).getValue() == null){
                table.set(i, new HashElement<T1, T2>(key, value));
                return true;
            }
        }
        return false;
    }

    public boolean Delete(T1 key){
        if(Search(key) != null){
            deletedKeys.add(key);
            return true;
        }
        return false;
    }

    public double FillingCoefficicent(){
        int counter = 0;
        for (int i = 0; i < table.size(); i++){
            if(table.get(i) != null){
                counter++;
            }
        }
        return counter / (double)table.size();
    }

    public void RebuildFunc(){
        ArrayList<HashElement<T1, T2>> temp = table;
        table = new ArrayList<>(temp.size() * 2);

        for(int i = 0; i < temp.size() * 2; i++) {
            table.add(null);
        }

        for(int i = 0; i < temp.size(); i++){
            if(temp.get(i) != null){
                Insert(temp.get(i).getKey(), temp.get(i).getValue());
            }
        }
    }
}
