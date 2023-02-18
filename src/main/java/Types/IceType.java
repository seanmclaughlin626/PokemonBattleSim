package Types;

public class IceType extends Type{
    public IceType() {
        this.typeName = "Ice";
    }
    public boolean checkEffectiveness(Type targetType){
        String otherType = targetType.getTypeName();
        switch (otherType){
            case "Grass":
            case "Ground":
            case "Flying":
            case "Dragon":
                this.isSuperEffective = true;
                break;
            case "Fire":
            case "Water":
            case "Ice":
            case "Steel":
                this.isNotVeryEffective = true;
                break;
        }
        return isSuperEffective;
    }
}
