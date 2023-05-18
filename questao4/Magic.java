package questao4;

public class Magic {private String name;
    private TypeCard type;
    private int cost;
    private String efecct;
    
    public MagicCard(String name, TypeCard type, int cost, String efecct) {
        this.name = nome;
        this.type = tipo;
        this.cost = cost;
        this.effect = efecct;
    }

    public String getName() {
        return name;
    }

    public TypeCard getType() {
        return type;
    }

    public int getCusto() {
        return cost;
    }

    public String getEffect() {
        return effect;
    }

    @Override
    public String toString() {
        return "MagicCard [name=" + name + ", type=" + type + ", cost=" + cost + ", effect=" + effect + "]";
    }
}
    

