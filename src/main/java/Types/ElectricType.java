package Types;

public class ElectricType extends Type{
    public ElectricType() {
        this.typeName = "Electric";
    }

    public boolean checkEffectiveness(Type targetType){
        String otherType = targetType.getTypeName();
        switch (otherType){
            case "Water":
            case "Flying":
                this.isSuperEffective = true;
                break;
            case "Electric":
            case "Grass":
            case "Dragon":
                this.isNotVeryEffective = true;
                break;
            case "Ground":
                this.noEffect = true;
                break;
        }
        return isSuperEffective;
    }
}
