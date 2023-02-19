package Types;

public class FairyType extends Type {
    public FairyType() {
        this.typeName = "Fairy";
    }

    public boolean checkEffectiveness(Type targetType){
        String otherType = targetType.getTypeName();
        switch (otherType){
            case "Ice":
            case "Dragon":
            case "Dark":
                this.isSuperEffective = true;
                break;
            case "Fire":
            case "Poison":
            case "Steel":
                this.isNotVeryEffective = true;
                break;
        }
        return isSuperEffective;
    }
}
