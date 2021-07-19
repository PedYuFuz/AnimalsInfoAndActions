package JavaEx020;

public class Spider extends Animal{
    private int poison;

    public Spider(int vel, int strength, int mass, int poison) {
        super(vel, strength, mass);
        this.poison=poison;
    }
    
    @Override
    public void attack(Animal a){
        if(this.getAlive()){
            if((this.getStrength()+this.poison)>a.getStrength()){
                this.setStrength(this.getStrength()+a.getMass());
                a.setAlive(false);
            }else{
                this.setAlive(false);
            }
        }else{
            System.out.println("Animal is dead.");
        }
    }
}
