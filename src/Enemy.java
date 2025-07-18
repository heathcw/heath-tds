public class Enemy {
    private int health;
    private int x,y;

    public Enemy(int health, int x, int y) {
        this.health = health;
        this.x = x;
        this.y = y;
    }

    public int getHealth() { return this.health; }
    public int getX() { return this.x; }
    public int getY() { return this.y; }

    public void loseHealth(int lose) { this.health -= lose; }
    public void updateX(int x) { this.x += x; }
    public void updateY(int y) { this.y += y; }
}
