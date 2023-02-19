package Types;

public class DragonType extends Type{
    public DragonType() {
        this.typeName = "Dragon";
    }

    public boolean checkEffectiveness(Type targetType){
        String otherType = targetType.getTypeName();
        switch (otherType){
            case "Dragon":
                this.isSuperEffective = true;
                break;
            case "Steel":
                this.isNotVeryEffective = true;
                break;
            case "Fairy":
                this.noEffect = true;
                break;
        }
        return isSuperEffective;
    }
}
