package Case_WarGame;

public abstract class Inventory {
    private String InvName;
    private String InvType;
    private int Id;
    private int damage;
    private int money;
    private int defense;

    public Inventory( String invType,String invName, int id, int damage, int money,int defense) {
        InvName = invName;
        InvType = invType;
        Id = id;
        this.damage = damage;
        this.money = money;
        this.defense =defense;
    }


    public String getInvName() {
        return InvName;
    }

    public String getInvType() {
        return InvType;
    }

    public int getId() {
        return Id;
    }

    public int getDamage() {
        return damage;
    }

    public int getMoney() {
        return money;
    }

    public int getDefense() {
        return defense;
    }
}
