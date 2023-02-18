package Types;

public class FightingType extends Type{
    public FightingType() {
        this.typeName = "Fighting";
    }

    public boolean checkEffectiveness(Type targetType){
        String otherType = targetType.getTypeName();
        switch (otherType){
            case "Normal":
            case "Ice":
            case "Rock":
            case "Dark":
            case "Steel":
                this.isSuperEffective = true;
                break;
            case "Poison":
            case "Flying":
            case "Psychic":
            case "Bug":
            case "Fairy":
                this.isNotVeryEffective = true;
                break;
            case "Ghost":
                this.noEffect = true;
                break;
        }
        return isSuperEffective;
    }
}
