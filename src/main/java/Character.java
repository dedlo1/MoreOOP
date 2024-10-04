import lombok.Getter;
import lombok.Setter;


@Getter @Setter
public class Character {
    private int power;
    private int hp;

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " {power=" + power + ", hp=" + hp + "}";
    }

    public Character(int i, int j) {
        this.power = i;
        this.hp = j;
    }

    public void kick(Character c) {
        c.hp -= this.power;
    }

    public boolean isAlive() {
        return hp > 0;
    }
}