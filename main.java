package JavaEx020;

public class main {
    public static void main(String[] args) {
        Ant ant=new Ant(1, 1, 1);
        Spider spider=new Spider(5,5,5,5);
        Vegetable veget=new Vegetable(10);

        ant.attack(spider);
        spider.eat(veget.getMass());

        spider.info();
        ant.info();
    }
}
