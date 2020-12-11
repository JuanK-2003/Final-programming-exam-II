package Clases;

/**
 *
 * @author Juan_K
 */
public class Contactos {
    protected String name;
    protected int numbreCel;
    protected String email;

    public Contactos(String name, int numbreCel, String email) {
        this.name = name;
        this.numbreCel = numbreCel;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumbreCel() {
        return numbreCel;
    }

    public void setNumbreCel(int numbreCel) {
        this.numbreCel = numbreCel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public Object[] getinfo(){
        Object[] inf = new Object[3];
        inf[0] = this.name;
        inf[1] = this.numbreCel;
        inf[2] = this.email;
        return inf;
    }
}
