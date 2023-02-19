package Types;

public class PsychicType extends Type{
    public PsychicType() {
        this.typeName = "Psychic";
    }

    public boolean checkEffectiveness(Type targetType){
        String otherType = targetType.getTypeName();
        switch (otherType){
            case "Fighting":
            case "Poison":
                this.isSuperEffective = true;
                break;
            case "Psychic":
            case "Steel":
                this.isNotVeryEffective = true;
                break;
            case "Dragon":
                this.noEffect = true;
                break;
        }
        return isSuperEffective;
    }
}
