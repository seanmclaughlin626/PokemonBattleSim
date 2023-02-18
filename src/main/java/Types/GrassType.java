package Types;

public class GrassType extends Type{

    public GrassType() {
        this.typeName = "Grass";
    }

    public boolean checkEffectiveness(Type targetType){
        String otherType = targetType.getTypeName();
        switch (otherType){
            case "Ground":
            case "Rock":
            case "Water":
                this.isSuperEffective = true;
                break;
            case "Flying":
            case "Fire":
            case "Grass":
            case "Poison":
            case "Bug":
            case "Steel":
            case "Dragon":
                this.isNotVeryEffective = true;
                break;
        }
        return isSuperEffective;
    }
}
