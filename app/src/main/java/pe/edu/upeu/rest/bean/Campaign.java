package pe.edu.upeu.rest.bean;



/**
 * Created by Alumnos on 30/05/2017.
 */

public class Campaign {
    private int id;
    private String name;

    public Campaign(int id, String nameCampaign){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
