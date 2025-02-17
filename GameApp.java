public class GameApp {
    public static void main(String[] args) {
        Character knight = new Character(new Knight());
        System.out.println("Knight:");
        knight.performAttack();
        knight.performDefense();

        Character wizard = new Character(new Wizard());
        System.out.println("\nWizard:");
        wizard.performAttack();
        wizard.performDefense();

        Character archer = new Character(new Archer());
        System.out.println("\nArcher:");
        archer.performAttack();
        archer.performDefense();
    }
}
