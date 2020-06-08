package li.WALKERS;

import li.ENUMS.WlkrStatus;
import li.MAIN.Location;
import li.STORMTROOPERS.Stormtrooper;
import li.UNITS.WalkerUnit;

public class ATAT extends ImperialWalker{

	private String WID;
	private WalkerUnit UnitAssigned;
	private Location Position;
	private WlkrStatus Status;
	private Stormtrooper[] TroopsOnBoard = new Stormtrooper[this.getTroopCapacity()];
	
	public ATAT(WalkerUnit unitAssigned, Location position,
			WlkrStatus status) {
		super("H1", "AT-AT", 20, 125, 22, 5, 5, 24, 12, 720);
		
		UnitAssigned = unitAssigned;
		Position = position;
		Status = status;
	}

	public String getWID() {
		return WID;
	}

	public void setWID(String wID) {
		WID = wID;
	}

	public WalkerUnit getUnitAssigned() {
		return UnitAssigned;
	}

	public void setUnitAssigned(WalkerUnit unitAssigned) {
		UnitAssigned = unitAssigned;
	}

	public Location getPosition() {
		return Position;
	}

	public void setPosition(Location position) {
		Position = position;
	}

	public WlkrStatus getStatus() {
		return Status;
	}

	public void setStatus(WlkrStatus status) {
		Status = status;
	}

	public void displayTroopsOnboard() {
	
		for(int i = 0; i < this.getCrew(); i++) {
			System.out.println(this.TroopsOnBoard[i].getSTID());
		}
	}
	
}
