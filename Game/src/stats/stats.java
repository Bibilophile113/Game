package stats;

public class stats {
    
    private int health = 1;
    private int maxHealth = 1;
    private int pAttack = 1;
    private int pDefence = 1;
    private int mAttack = 1;
    private int mDefence = 1;
    private int speed = 1;

    public int getHealth(){
        return health;
    }

    public void setHealth(int n){
        health = n;
    }

    public void printHealth(){
        System.out.print(health);
    }

    public int getMaxHealth(){
        return maxHealth;
    }

    public void setMaxHealth(int n){
        maxHealth = n;
    }

    public void printMaxHealth(){
        System.out.print(maxHealth);
    }

    public int getpAttack(){
        return pAttack;
    }

    public void setpAttack(int n){
        pAttack = n;
    }

    public void printpAttack(){
        System.out.print(pAttack);
    }

    public int getpDefence(){
        return pDefence;
    }

    public void setpDefence(int n){
        pDefence = n;
    }

    public void printpDefence(){
        System.out.print(pDefence);
    }

    public int getmAttack(){
        return mAttack;
    }

    public void setmAttack(int n){
        mAttack = n;
    }

    public void printmAttack(){
        System.out.print(mAttack);
    }

    public int getmDefence(){
        return mDefence;
    }

    public void setmDefence(int n){
        mDefence = n;
    }

    public void printmDefence(){
        System.out.print(mDefence);
    }

    public int getSpeed(){
        return speed;
    }

    public void setSpeed(int n){
        speed = n;
    }

    public void printSpeed(){
        System.out.print(speed);
    }

}
