package li.UNITS;

import java.util.ArrayList;

import li.MAIN.Location;
import li.WALKERS.ATAT;

public class HeavyWalkerUnit extends WalkerUnit{

	private String UnitType;
	private ArrayList<ATAT> Walkers = new ArrayList<>();
	public HeavyWalkerUnit(String wUID, BattleGroup hQ, Location position) {
		super(wUID, hQ, position);
		this.UnitType = "Heavy";
	}
	public String getUnitType() {
		return UnitType;
	}
	public void setUnitType(String unitType) {
		UnitType = unitType;
	}
	public ArrayList<ATAT> getWalkers() {
		return Walkers;
	}
	public void setWalkers(ArrayList<ATAT> walkers) {
		Walkers = walkers;
	}
	
	public void displayAssignedWalkers() {
		for(int i = 0; i < this.Walkers.size(); i++) {
			System.out.println(this.Walkers.get(i).getWID());
		}
	}
}
