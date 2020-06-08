package li.STORMTROOPERS;

import li.ENUMS.MOS;
import li.ENUMS.Mobilization;
import li.ENUMS.STStatus;
import li.MAIN.Location;

public class Stormtrooper {

	private String STID;
	private String Rank;
	private String Gender;
	private int ServiceYears;
	private int Height;
	private int Weight;
	private Mobilization DutyCategory;
	private STStatus DutyStatus;
	private Location Position;
	private MOS Role;
	public int TrooperCount;
	public Stormtrooper(String sTID, String rank, String gender, int serviceYears, int height, int weight,
			Mobilization dutyCategory, STStatus dutyStatus, Location position, MOS role) {

		STID = sTID;
		Rank = rank;
		Gender = gender;
		ServiceYears = serviceYears;
		Height = height;
		Weight = weight;
		DutyCategory = dutyCategory;
		DutyStatus = dutyStatus;
		Position = position;
		Role = role;
	}
	
	public String getSTID() {
		return STID;
	}

	public void setSTID(String sTID) {
		STID = sTID;
	}

	public String getRank() {
		return Rank;
	}

	public void setRank(String rank) {
		Rank = rank;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public int getServiceYears() {
		return ServiceYears;
	}

	public void setServiceYears(int serviceYears) {
		ServiceYears = serviceYears;
	}

	public int getHeight() {
		return Height;
	}

	public void setHeight(int height) {
		Height = height;
	}

	public int getWeight() {
		return Weight;
	}

	public void setWeight(int weight) {
		Weight = weight;
	}

	public Mobilization getDutyCategory() {
		return DutyCategory;
	}

	public void setDutyCategory(Mobilization dutyCategory) {
		DutyCategory = dutyCategory;
	}

	public STStatus getDutyStatus() {
		return DutyStatus;
	}

	public void setDutyStatus(STStatus dutyStatus) {
		DutyStatus = dutyStatus;
	}

	public Location getPosition() {
		return Position;
	}

	public void setPosition(Location position) {
		Position = position;
	}

	public MOS getRole() {
		return Role;
	}

	public void setRole(MOS role) {
		Role = role;
	}

	public int getTrooperCount() {
		return TrooperCount;
	}

	public void setTrooperCount(int trooperCount) {
		TrooperCount = trooperCount;
	}

	public void displayStormtrooperInfo() {
		System.out.println(this.getRank() +" " + this.getSTID() + " Stormtrooper: " + this.Role);
		System.out.println("Height: " + this.Height + "\tWeight: " + this.Weight + "\tGender: " + this.Gender);
		System.out.println("Duty Cagetory: " + this.DutyCategory + "\tDuty Status: " + this.DutyStatus
				+ "\tCurrent Location: " + this.Position);
		System.out.println("__________________________________________");
	}
	
}
