package WarriorGame.Monster;

public abstract class Monster {
    private String monsterName;
    private int id;
    private int monsterDamage;
    private int monsterHealth;
    private int monsterPower;

    public Monster(String monsterName, int id, int monsterDamage, int monsterHealth, int monsterPower) {
        this.monsterName = monsterName;
        this.id = id;
        this.monsterDamage = monsterDamage;
        this.monsterHealth = monsterHealth;
        this.monsterPower = monsterPower;



    }




























    //Getter setter
    public String getMonsterName() {
        return monsterName;
    }

    public void setMonsterName(String monsterName) {
        this.monsterName = monsterName;
    }

    public int getId() {
        return id;
    }

    public void setId(int ıd) {
        this.id = ıd;
    }

    public int getMonsterDamage() {
        return monsterDamage;
    }

    public void setMonsterDamage(int monsterDamage) {
        this.monsterDamage = monsterDamage;
    }

    public int getMonsterHealth() {
        return monsterHealth;
    }

    public void setMonsterHealth(int monsterHealth) {
        this.monsterHealth = monsterHealth;
    }

    public int getMonsterPower() {
        return monsterPower;
    }

    public void setMonsterPower(int monsterPower) {
        this.monsterPower = monsterPower;
    }
}
