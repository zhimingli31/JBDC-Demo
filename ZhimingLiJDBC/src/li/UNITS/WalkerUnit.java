package li.UNITS;

import li.INTERFACES.Tactical;
import li.MAIN.Location;

public class WalkerUnit implements Tactical{

	private String WUID;
	private BattleGroup HQ;
	private Location Position;
	
	
	public WalkerUnit(String wUID, BattleGroup hQ, Location position) {
		super();
		WUID = wUID;
		HQ = hQ;
		Position = position;
	}


	public String getWUID() {
		return WUID;
	}


	public void setWUID(String wUID) {
		WUID = wUID;
	}


	public BattleGroup getHQ() {
		return HQ;
	}


	public void setHQ(BattleGroup hQ) {
		HQ = hQ;
	}


	public Location getPosition() {
		return Position;
	}


	public void setPosition(Location position) {
		Position = position;
	}


	@Override
	public void moveTo(Location L) {
		// TODO Auto-generated method stub
		
	}
	
	public void displayWalkerUnitInfo() {
		System.out.println("Walker Unit: " + this.getWUID());
		System.out.println("Currently Located At: " + this.getPosition().toString());
		System.out.println();
	}
	
}
