public class Knight implements CharacterType {
    private AttackStrategy attackStrategy = new SwingSword();
    private DefenseStrategy[] defenseStrategies = {new Shield(), new Dodge(), new CreateMagic()};

    @Override
    public void attack() {
        attackStrategy.attack();
    }

    @Override
    public void defend() {
        for (DefenseStrategy strategy : defenseStrategies) {
            strategy.defend();
        }
    }
}
