public class Player {
    private int health;
    private int x,y;

    Player(int health, int x, int y) {
        this.health = health;
        this.x = x;
        this.y = y;
    }

    public int getHealth() { return this.health; }
    public int getX() { return this.x; }
    public int getY() { return this.y; }

    public void loseHealth(int lose) { this.health -= lose; }
}
