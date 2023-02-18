package Types;

public class PoisonType extends Type{
    public PoisonType() {
        this.typeName = "Poison";
    }

    public boolean checkEffectiveness(Type targetType){
        String otherType = targetType.getTypeName();
        switch (otherType){
            case "Grass":
            case "Fairy":
                this.isSuperEffective = true;
                break;
            case "Poison":
            case "Ground":
            case "Rock":
            case "Ghost":
                this.isNotVeryEffective = true;
                break;
            case "Steel":
                this.noEffect = true;
                break;
        }
        return isSuperEffective;
    }
}
