package Types;

public abstract class Type {
    protected String typeName;
    protected boolean isSuperEffective = false;
    protected boolean isNotVeryEffective = false;
    protected boolean noEffect = false;

    public String getTypeName() {
        return this.typeName;
    }

    public boolean checkEffectiveness(Type targetType){
        return isSuperEffective;
    }
}
