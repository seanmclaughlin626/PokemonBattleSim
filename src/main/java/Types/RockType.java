package Types;

public class RockType extends Type{
    public RockType() {
        this.typeName = "Rock";
    }

    public boolean checkEffectiveness(Type targetType){
        String otherType = targetType.getTypeName();
        switch (otherType){
            case "Fire":
            case "Grass":
            case "Flying":
            case "Bug":
                this.isSuperEffective = true;
                break;
            case "Fighting":
            case "Ground":
            case "Steel":
                this.isNotVeryEffective = true;
                break;
        }
        return isSuperEffective;
    }
}
