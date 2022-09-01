public class App {
    public static void main(String[] args) {

        // Character Class
        Character knight = new Character();

        knight.strength = 10;
        knight.agility = 5;
        knight.intelligence = 0;
        knight.name = "Chen";
        knight.sayMyName();

        Character mage = new Character();

        mage.strength = 0;
        mage.agility = 5;
        mage.intelligence = 10;
        mage.name = "Akasha";
        mage.sayMyName();

        Character thief = new Character();

        thief.strength = 5;
        thief.agility = 10;
        thief.intelligence = 0;
        thief.name = "Gondar";
        thief.sayMyName();

        // Enemy Class
        Enemy boss = new Enemy();

        boss.damage = 50;
        boss.health = 500;
        boss.armor = 100;
        boss.hasMagicImmunity = true;
        boss.name = "Roshan";
        boss.enemyDialogue();

        Enemy skeleton = new Enemy();

        skeleton.damage = 5;
        skeleton.health = 10;
        skeleton.armor = 5;
        skeleton.hasMagicImmunity = false;
        skeleton.name = "Common Skeleton Warrior";
        skeleton.enemyDialogue();

        Enemy dragon = new Enemy();

        dragon.damage = 40;
        dragon.health = 400;
        dragon.armor = 75;
        dragon.hasMagicImmunity = false;
        dragon.name = "Ancient Wyvern";
        dragon.enemyDialogue();
    
        //Weaponaries Class
        Weaponaries Sword = new Weaponaries();

        Sword.damage = 150;
        Sword.name = "Myles's Sword";
        Sword.weight = 5.5f;
        Sword.rarity = "Epic";
        Sword.hasElementalDamage = false;
        Sword.description = "A rare sword owned by Myles";

        Sword.showWeaponariesDescription();

        //Gear Class
        Gear Helmet = new Gear();

        Helmet.name = "Myles's Helmet";
        Helmet.defense = 40;
        Helmet.weight = 8.5f;
        Helmet.description = "A helmet owned by Myles";
        Helmet.rarity = "Rare";
        Helmet.hasElementalResistance = true;

        Helmet.showGearDescription();

    }
}