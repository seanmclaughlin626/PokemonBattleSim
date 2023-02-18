package Types;

public class WaterType extends Type{
    public WaterType() {
        this.typeName = "Water";
    }

    public boolean checkEffectiveness(Type targetType){
        String otherType = targetType.getTypeName();
        switch (otherType){
            case "Ground":
            case "Rock":
            case "Fire":
                this.isSuperEffective = true;
                break;
            case "Water":
            case "Grass":
            case "Dragon":
                this.isNotVeryEffective = true;
                break;
        }
        return isSuperEffective;
    }
}
