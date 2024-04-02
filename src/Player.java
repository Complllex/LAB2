abstract class Player {
    protected int health;

    protected int attackRange;
    protected int movement;
    protected int cost;
    private boolean alive;
    protected int defense;
    protected int attackDamage;
    protected int x;
    protected int y;

    public Player(int health,int attackDamage, int attackRange, int defense , int movement, int cost, int x, int y) {
        this.health = health;
        this.attackDamage = attackDamage;
        this.attackRange = attackRange;
        this.defense = defense;
        this.movement = movement;
        this.cost = cost;
        this.alive = true;
        this.x = x;
        this.y = y;
    }

    public int getAttack() {
        return attackDamage;
    }
    public int getAttackRange() {
        return attackRange;
    }
    public void attack(Player target) {
        int damageDealt = Math.max(0, attackDamage - target.defense);
        target.health -= damageDealt;
        System.out.println("Player dealt " + damageDealt + " damage to the enemy!");
    }
    public void takeDamage(int damage) {
        health -= damage;
        if (health <= 0) {
            alive = false;
        }
    }
    public int getDefense() {
        return this.defense;
    }
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    public void move(int newX, int newY) {
        x = newX;
        y = newY;
    }
    public  boolean  checkMove(int newX, int newY, int FIELD_SIZE, int fine){
        int deltaX = Math.abs(newX - x);
        int deltaY = Math.abs(newY - y);
        if (deltaX+deltaY+fine <= this.movement && deltaX >= 0 && deltaX <= FIELD_SIZE && deltaY >= 0 && deltaY <= FIELD_SIZE) {
            return true;
        } else {
            System.out.println("Юнит не может переместиться на столь дальнее расстояние");
            return false;
        }
    }
    public boolean isAlive() {
        return health > 0;
    }
}
