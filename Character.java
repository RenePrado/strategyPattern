public class Character {
    private CharacterType character;

    public Character(CharacterType character) {
        this.character = character;
    }

    public void performAttack() {
        character.attack();
    }

    public void performDefense() {
        character.defend();
    }
}
