package WarriorGame;

import WarriorGame.Armor.Armor;
import WarriorGame.Weapon.Weapon;

public class User {
    private String userName;
    private int userId;
    private int userMoney;
    private int userHealth;


    public User(String userName, int userId,int Money) {
        this.userName = userName;
        this.userId = userId;
        this.userMoney=Money;
    }

































    ///

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getUserMoney() {
        return userMoney;
    }

    public void setUserMoney(int userMoney) {
        this.userMoney = userMoney;
    }

    public int getUserHealth() {
        return userHealth;
    }

    public void setUserHealth(int userHealth) {
        this.userHealth = userHealth;
    }
}
