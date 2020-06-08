package li.STORMTROOPERS;

import li.ENUMS.Cypher;
import li.ENUMS.MOS;
import li.ENUMS.Mobilization;
import li.ENUMS.Pack;
import li.ENUMS.Radio;
import li.ENUMS.STStatus;
import li.ENUMS.Weapon;
import li.MAIN.Location;

public class STOfficer extends Stormtrooper{
	
	private Weapon WeaponCarried;
	private Pack PackCarried;
	private Radio RadioCarried;
	private Cypher DecryptionCarried;
	
	public STOfficer(String sTID, String rank, String gender, int serviceYears, int height, int weight,
			Mobilization dutyCategory, STStatus dutyStatus, Location position, Weapon weaponCarried,
			Pack packCarried, Radio radioCarried, Cypher decryptionCarried, MOS role) {
		super(sTID, rank, gender, serviceYears, height, weight, dutyCategory, dutyStatus, position, role);
		WeaponCarried = weaponCarried;
		PackCarried = packCarried;
		RadioCarried = radioCarried;
		DecryptionCarried = decryptionCarried;
	}

	public void displayCarriedItems() {
		System.out.println("Weapon: " + this.WeaponCarried);
		System.out.println("Pack: " + this.PackCarried);
		System.out.println("Radio: " + this.RadioCarried);
		System.out.println("Cypher: " + this.DecryptionCarried);
	}

}
