package Types;

public class FireType extends Type {

    public FireType() {
        this.typeName = "Fire";
    }

    public boolean checkEffectiveness(Type targetType){
        String otherType = targetType.getTypeName();
        switch (otherType){
            case "Grass":
            case "Ice":
            case "Steel":
            case "Bug":
                this.isSuperEffective = true;
                break;
            case "Rock":
            case "Fire":
            case "Water":
            case "Dragon":
                this.isNotVeryEffective = true;
                break;
        }
        return isSuperEffective;
    }
}
