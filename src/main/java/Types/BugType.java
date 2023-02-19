package Types;

public class BugType extends Type {
    public BugType() {
        this.typeName = "Bug";
    }

    public boolean checkEffectiveness(Type targetType){
        String otherType = targetType.getTypeName();
        switch (otherType){
            case "Psychic":
            case "Grass":
            case "Dark":
                this.isSuperEffective = true;
                break;
            case "Fire":
            case "Fighting":
            case "Poison":
            case "Flying":
            case "Ghost":
            case "Steel":
            case "Fairy":
                this.isNotVeryEffective = true;
                break;
        }
        return isSuperEffective;
    }
}
