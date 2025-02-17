public class Archer implements CharacterType {
    private AttackStrategy attackStrategy = new ShootArrow();
    private DefenseStrategy defenseStrategy = new Dodge();

    @Override
    public void attack() {
        attackStrategy.attack();
    }

    @Override
    public void defend() {
        defenseStrategy.defend();
    }
}
