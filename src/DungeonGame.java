import java.util.Scanner;
public class DungeonGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        boolean keepGoing=true;
        int choice;
            System.out.println("What is your title, Paladin?");
            String charName= scan.next();
            System.out.println("Your adventure begins now, " + charName +". \nAre you ready to begin?");
            String embark = scan.next();

        boolean begin = embark.equalsIgnoreCase("yes") || embark.equalsIgnoreCase("y");
        int goblinHP=10;
        int playerHP=20;
        int goblinAC=15;
        int playerAC=15;
        int handsUses=2;
//        double goblinAttack;
//        double healing;
//        double playerAttack;
//        double goblinAttack= (Math.random()*((22-3)+1))+3;

            boolean combat=true;
        if (begin){
            System.out.println("A goblin appears!\n");
        do {
            System.out.println("Goblin Warrior");
            System.out.println("=========================");
            System.out.println("HP: " + goblinHP +   "/ Armor Class: "+ goblinAC);
            System.out.println("Rusty Dagger (+2 to hit. 1d4+2 Damage)");
            System.out.println();
            System.out.println(charName +" the Paladin");
            System.out.println("=========================");
            System.out.println("HP: " + playerHP +   "/ Armor Class: "+ playerAC);
            System.out.println("Longsword (+5 to hit. 1d6+2 Damage)");
            System.out.println();
            System.out.println("What would you like to do?");
            System.out.println("1. Attack (Longsword)");
            System.out.println("2. Lay on Hands (Restore 1d10 Health)");
            System.out.println("3. Run away");
            choice=scan.nextInt();

                    if (choice == 1) {
                        System.out.println("You attack the goblin!");
                        double playerAttack = (int) (Math.random() * ((25 - 6) + 1)) + 6;
                        System.out.println(playerAttack);
                        if (playerAttack >= goblinAC) {
                            System.out.println("You hit the goblin!");
                            double damage = (int) (Math.random() * ((10 - 3) + 1)) + 3;
                            goblinHP-=damage;
                            System.out.println("The goblin took " + damage + " damage.");
                                if (goblinHP<=0){
                                    System.out.println("You have slaughtered the goblin.");
                                    combat=false; }
                        } else {
                            System.out.println("Your attack missed!");
                            combat = true;
                        }
                    }

                    if (choice == 2) {
                        if (handsUses>=1){
                            System.out.println("You heal yourself with holy magic!");
                            double healing = (int) (Math.random() * ((10 - 1) + 1)) + 1;
                            playerHP+=healing;
                            handsUses-=1;
                            System.out.println("Holy light heals you for " + healing + " health.");
                        } else {
                            System.out.println("You have no more magic remaining.");
                        }

                        if (choice == 3) {
                        System.out.println("You coward! Paladins never run away!");
                    }
                }
                    if (goblinHP>0){
                    double goblinAttack = (int) (Math.random() * ((22 - 3) + 1)) + 3;
                    if (goblinAttack>=playerAC){
                        System.out.println("The goblin slashes you with a rusty dagger!");
                        double goblinDamage = (int) (Math.random() * ((6 - 3) + 1)) + 3;
                        playerHP-=goblinDamage;
                        if(playerHP<=0){
                            System.out.println("The goblin spits on your corpse. \"Weakling.\"");
                            combat=false;
                        }
                    } else {
                        System.out.println("The goblin swings his rusty dagger at you, but misses.");
                        combat=true;
                    }
                    } else {combat=false;}
        }while(combat);
        }

    }
}
