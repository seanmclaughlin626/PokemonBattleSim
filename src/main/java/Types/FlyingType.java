package Types;

public class FlyingType extends Type{
    public FlyingType() {
        this.typeName = "Flying";
    }

    public boolean checkEffectiveness(Type targetType){
        String otherType = targetType.getTypeName();
        switch (otherType){
            case "Bug":
            case "Grass":
            case "Fighting":
                this.isSuperEffective = true;
                break;
            case "Rock":
            case "Steel":
            case "Electric":
                this.isNotVeryEffective = true;
                break;
        }
        return isSuperEffective;
    }
}
