public class Wizard implements CharacterType {
    private AttackStrategy attackStrategy = new CastSpell();
    private DefenseStrategy defenseStrategy = new CreateMagic();

    @Override
    public void attack() {
        attackStrategy.attack();
    }

    @Override
    public void defend() {
        defenseStrategy.defend();
    }
}
