package JavaEx020;

public class Animal implements Alive{
    //variables
    private boolean alive;
    private int mass;
    private int vel;
    private int x;
    private int y;
    private int strength;

    //contructor method
    public Animal(int vel, int strength, int mass){
        this.vel=vel;
        this.strength=strength;
        this.mass=mass;
        this.alive=true;
        this.x=0;
        this.y=0;
    }

    public void setMass(int mass){
        this.mass=mass;
    }
    public int getMass(){
        return this.mass;
    }

    public void setStrength(int strength){
        this.strength=strength;
    }
    public int getStrength(){
        return this.strength;
    }

    public void setVel(int vel){
        this.vel=vel;
    }
    public int getVel(){
        return this.vel;
    }

    public void setAlive(boolean alive){
        this.alive=alive;
    }
    public boolean getAlive(){
        return this.alive;
    }

    public void attack(Animal a){
        if(this.alive){
            if(this.strength>a.getStrength()){
                this.strength+=a.getMass();
                a.alive=false;
            }else{
                this.alive=false;
                a.setStrength(strength+=this.mass);
            }
        }else{
            System.out.println("Animal is dead!");
        }
    }

    @Override
    public void eat(int mass) {
        if(this.alive){
            this.strength+=mass;
        }else{
            System.out.println("Animal is dead!");
        }
        
    }

    @Override
    public void move() {
        if(this.alive){
            this.x+=this.vel;
            this.y+=this.vel;
        }else{
            System.out.println("Animal is dead!");
        }
        
    }

    @Override
    public void info() {
        System.out.printf("---------------------------------------");
        System.out.printf("\nType: %s\n", getClass().toGenericString());
        System.out.printf("Alive: %s\n", this.alive ? "Yes" : "No");
        System.out.printf("Mass: %s\n", this.mass);
        System.out.printf("Velocity: %s\n", this.vel);
        System.out.printf("Strength: %s\n", this.strength);
        System.out.printf("---------------------------------------");
        
    }
    
}
