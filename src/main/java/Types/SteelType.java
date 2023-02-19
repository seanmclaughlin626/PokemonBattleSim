package Types;

public class SteelType extends Type{
    public SteelType() {
        this.typeName = "Steel";
    }

    public boolean checkEffectiveness(Type targetType){
        String otherType = targetType.getTypeName();
        switch (otherType){
            case "Ice":
            case "Rock":
            case "Fairy":
                this.isSuperEffective = true;
                break;
            case "Fire":
            case "Water":
            case "Electric":
            case "Steel":
                this.isNotVeryEffective = true;
                break;
        }
        return isSuperEffective;
    }
}
