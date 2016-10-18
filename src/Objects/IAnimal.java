package Objects;

public interface IAnimal {

	void ToggleHands();

	void ToggleLegs();

	void ToggleBody();

	void ToggleWings();

	boolean HasHands();

	boolean HasLegs();

	boolean HasBody();

	boolean HasWings();
	
	String GetName();
	
	void SetName(String name);
	

}