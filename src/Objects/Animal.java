package Objects;

public class Animal implements IAnimal {

	private boolean _hasHands;
	private boolean _hasLegs;
	private boolean _hasBody;
	private boolean _hasWings;
	private String _name;
	
	public Animal (boolean hasHands, boolean hasLegs, boolean hasBody, boolean hasWings){
		_hasHands = hasHands;
		_hasLegs = hasLegs;
		_hasBody = hasBody;
		_hasWings = hasWings;
		
	}
	
	/* (non-Javadoc)
	 * @see Objects.IAnimal#ToggleHands()
	 */
	@Override
	public void ToggleHands(){
		_hasHands = !_hasHands;
	}
	/* (non-Javadoc)
	 * @see Objects.IAnimal#ToggleLegs()
	 */
	@Override
	public void ToggleLegs(){
		_hasLegs = !_hasLegs;
	}
	/* (non-Javadoc)
	 * @see Objects.IAnimal#ToggleBody()
	 */
	@Override
	public void ToggleBody(){
		_hasBody = !_hasBody;
	}
	/* (non-Javadoc)
	 * @see Objects.IAnimal#ToggleWings()
	 */
	@Override
	public void ToggleWings(){
		_hasWings = !_hasWings;
	}
	/* (non-Javadoc)
	 * @see Objects.IAnimal#HasHands()
	 */
	@Override
	public boolean HasHands(){
		return _hasHands;
	}
	/* (non-Javadoc)
	 * @see Objects.IAnimal#HasLegs()
	 */
	@Override
	public boolean HasLegs(){
		return _hasLegs;
	}
	/* (non-Javadoc)
	 * @see Objects.IAnimal#HasBody()
	 */
	@Override
	public boolean HasBody(){
		return _hasBody;
	}
	/* (non-Javadoc)
	 * @see Objects.IAnimal#HasWings()
	 */
	@Override
	public boolean HasWings(){
		return _hasWings;
	}
	public String GetName(){
		return _name;
	}
	public void SetName(String name){
		_name = name;
	}
}
