package Types;

public class NormalType extends Type{
    public NormalType() {
        this.typeName = "Normal";
    }

    public boolean checkEffectiveness(Type targetType){
        String otherType = targetType.getTypeName();
        switch(otherType){
            case "Rock":
            case "Steel":
                this.isNotVeryEffective = true;
                break;
            case "Ghost":
                this.noEffect = true;
                break;
        }
        return isSuperEffective;
    }
}
