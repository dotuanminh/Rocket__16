
public class Position {
	int positionID;
	String positionName;
	public Position(int positionID, String positionName) {
		super();
		this.positionID= positionID; 
		this.positionName= positionName;
	}
	public Position() {
		super(); 
	}
	@Override
	public String toString() {
		return "Position{" +	
				"positionID=" + positionID +
				", positionName='" + positionName + '\'' +
				'}';
	    }
}

