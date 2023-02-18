package Types;

public class GhostType extends Type{
    public GhostType() {
        this.typeName = "Ghost";
    }

    public boolean checkEffectiveness(Type targetType){
        String otherType = targetType.getTypeName();
        switch (otherType){
            case "Psychic":
            case "Ghost":
                this.isSuperEffective = true;
                break;
            case "Dark":
                this.isNotVeryEffective = true;
                break;
            case "Normal":
                this.noEffect = true;
                break;
        }
        return isSuperEffective;
    }
}
