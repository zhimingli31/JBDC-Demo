package li.FACTORIES;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


import li.DBSUPPORT.DBConnection;
import li.ENUMS.Cypher;
import li.ENUMS.MOS;
import li.ENUMS.Mobilization;
import li.ENUMS.Pack;
import li.ENUMS.Radio;
import li.ENUMS.STStatus;
import li.ENUMS.Weapon;
import li.MAIN.Location;
import li.STORMTROOPERS.STNonOfficer;
import li.STORMTROOPERS.STOfficer;

public class StormtrooperFactory {

	public static ArrayList<STOfficer> buildOfficers() throws SQLException, ClassNotFoundException{
		ArrayList<STOfficer> sto = new ArrayList<>();
		Connection conn = DBConnection.establishDBConnection();
		Statement useStatement = conn.createStatement();
		useStatement.executeQuery("USE stormtrooper_java;");
		Statement querryStatement = conn.createStatement();
		String querry = "SELECT * " + 
				"FROM st_officer_assign, stormtroopers_officer " + 
				"WHERE st_officer_assign.STID = stormtroopers_officer.STID;";
		ResultSet resultset = querryStatement.executeQuery(querry);
		
		String STID = null; String Rank = null; String Gender = null; int ServiceYears = 0;
		int Height = 0; int Weight = 0; Mobilization DutyCategory = null; STStatus DutyStatus = null;
		Location Position = null; Weapon WeaponCarried = null; Pack PackCarried = null;
		Radio RadioCarried = null; Cypher DecryptionCarried = null; MOS Role = null;
		
		while(resultset.next()) {
			STID = resultset.getString("STID");
			Rank = resultset.getString("Rank");
			Gender = resultset.getString("Gender");
			ServiceYears = resultset.getInt("ServiceYears");
			Height = resultset.getInt("Height");
			Weight = resultset.getInt("Weight");
			DutyCategory = Mobilization.valueOf(resultset.getString("DutyCategory"));
			DutyStatus = STStatus.valueOf(resultset.getString("DutyStatus").replaceAll("\\s", ""));
			Position = new Location();
			WeaponCarried = Weapon.valueOf("Blaster");
			PackCarried = Pack.valueOf("PatrolPack");
			RadioCarried = Radio.valueOf("RTS_1");
			
			if(resultset.getString("Rank").equals("CMDR")) {
				DecryptionCarried = Cypher.valueOf("Omega");
			}else {
				DecryptionCarried = Cypher.valueOf("Alpha");
			}
			
			Role = MOS.valueOf(resultset.getString("Role"));
			
			STOfficer officer = new STOfficer(STID, Rank, Gender, ServiceYears, Height, Weight, DutyCategory,
					DutyStatus, Position, WeaponCarried, PackCarried, RadioCarried, DecryptionCarried, Role);
			
			sto.add(officer);
		}
		
		return sto;
	}
	
	public static ArrayList<STNonOfficer> buildNonOfficer() throws ClassNotFoundException, SQLException{
		ArrayList<STNonOfficer> stn = new ArrayList<>();
		
		Connection conn = DBConnection.establishDBConnection();
		Statement useStatement = conn.createStatement();
		useStatement.executeQuery("USE stormtrooper_java;");
		Statement querryStatement = conn.createStatement();
		String querry = "SELECT * " + 
				"FROM st_nco_assign, stormtroopers_nco " + 
				"WHERE st_nco_assign.STID = stormtroopers_nco.STID;";
		ResultSet resultset = querryStatement.executeQuery(querry);
		
		String STID = null; String Rank = null; String Gender = null; int ServiceYears = 0;
		int Height = 0; int Weight = 0; Mobilization DutyCategory = null; STStatus DutyStatus = null;
		Location Position = null; Weapon WeaponCarried = null; Pack PackCarried = null;
		Radio RadioCarried = null; MOS Role = null;
		
		while(resultset.next()) {
			STID = resultset.getString("STID");
			Rank = resultset.getString("Rank");
			Gender = resultset.getString("Gender");
			ServiceYears = resultset.getInt("ServiceYears");
			Height = resultset.getInt("Height");
			Weight = resultset.getInt("Weight");
			DutyCategory = Mobilization.valueOf(resultset.getString("DutyCategory"));
			DutyStatus = STStatus.valueOf(resultset.getString("DutyStatus").replaceAll("\\s", ""));
			Position = new Location();
			WeaponCarried = Weapon.valueOf("Blaster_Rifle");
			PackCarried = Pack.valueOf("AssaultPack");
			RadioCarried = Radio.valueOf("RTS_L2");
			
			Role = MOS.valueOf(resultset.getString("Role"));
			
			STNonOfficer officer = new STNonOfficer(STID, Rank, Gender, ServiceYears, Height, Weight, DutyCategory,
					DutyStatus, Position, WeaponCarried, PackCarried, RadioCarried, Role);
			
			stn.add(officer);
		}
		
		return stn;
	}
	
	public static void displayOfficer(ArrayList<STOfficer> sto, int c) {
		for(int i = 0; i < c; i++) {
			sto.get(i).displayStormtrooperInfo();
		}
	}
	
	public static void displayNonOfficer(ArrayList<STNonOfficer> stn, int c) {
		for(int i = 0; i < c; i++) {
			stn.get(i).displayStormtrooperInfo();
		}
	}
}
