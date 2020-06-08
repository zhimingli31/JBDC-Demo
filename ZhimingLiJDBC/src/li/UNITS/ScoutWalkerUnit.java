package li.UNITS;

import java.util.ArrayList;

import li.MAIN.Location;
import li.WALKERS.ATST;

public class ScoutWalkerUnit extends WalkerUnit{

	private String UnitType;
	private ArrayList<ATST> Walkers = new ArrayList<>();
	public ScoutWalkerUnit(String wUID, BattleGroup hQ, Location position) {
		super(wUID, hQ, position);
		this.UnitType = "Scout";
	}
	public String getUnitType() {
		return UnitType;
	}
	public void setUnitType(String unitType) {
		UnitType = unitType;
	}
	public ArrayList<ATST> getWalkers() {
		return Walkers;
	}
	public void setWalkers(ArrayList<ATST> walkers) {
		Walkers = walkers;
	}
	
	public void displayAssignedWalkers() {
		for(int i = 0; i < this.Walkers.size(); i++) {
			System.out.println(this.Walkers.get(i).getWID());
		}
	}
}
