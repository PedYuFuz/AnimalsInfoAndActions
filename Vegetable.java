package JavaEx020;

public class Vegetable {
    private boolean alive;
    private int mass;

    public Vegetable(int mass){
        this.mass=mass;
        this.alive=true;
    }

    public int getMass(){
        return this.mass;
    }

    public void setAlive(boolean alive){
        this.alive=alive;
    }
}
