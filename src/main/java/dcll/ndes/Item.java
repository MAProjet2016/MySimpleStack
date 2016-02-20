package dcll.ndes;

/**
 * Created by Nico on 17/02/2016.
 */
public class Item {
    private int id;
    private String name;

    Item(){
        this.id = 0;
        this.name = "";
    }

    Item(int identifiant, String name){
        this.id = identifiant;
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }
}
