
public class TypeQuestion {
	int typeID;
	TypeName typeName ; 
	enum TypeName{
		Essay , Multiple_Choice} ;
	public TypeQuestion(int typeID, TypeName typeName) {
		super();
		this.typeID = typeID;
		this.typeName = typeName;
	}
	public TypeQuestion() {
		super();
	}
    public String toString() {
        return "TypeQuestion{" +
                "typeID=" + typeID +
                ", typeName='" + typeName + '\'' +
                '}';
    }
}
