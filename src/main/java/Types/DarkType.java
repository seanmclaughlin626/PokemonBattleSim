package Types;

public class DarkType extends Type{
    public DarkType() {
        this.typeName = "Dark";
    }

    public boolean checkEffectiveness(Type targetType){
        String otherType = targetType.getTypeName();
        switch (otherType){
            case "Psychic":
            case "Ghost":
                this.isSuperEffective = true;
                break;
            case "Dark":
            case "Fairy":
            case "Fighting":
                this.isNotVeryEffective = true;
                break;
        }
        return isSuperEffective;
    }
}
