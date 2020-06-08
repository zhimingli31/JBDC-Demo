package li.FACTORIES;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import li.DBSUPPORT.DBConnection;
import li.ENUMS.Units;
import li.MAIN.Location;
import li.UNITS.AssaultInfantryUnit;
import li.UNITS.BattleGroup;
import li.UNITS.InfantryUnit;
import li.UNITS.ReconnaissanceUnit;
import li.UNITS.StormtrooperUnit;
import li.UNITS.WalkerUnit;

public class StormtrooperUnitFactory {

	public static ArrayList<StormtrooperUnit> buildSTUnits(ArrayList<BattleGroup> bg, ArrayList<WalkerUnit> wu) throws ClassNotFoundException, SQLException {
		ArrayList<StormtrooperUnit> stu = new ArrayList<>();
		
		Connection conn = DBConnection.establishDBConnection();
		Statement useStatement = conn.createStatement();
		useStatement.executeQuery("USE stormtrooper_java;");
		Statement querryStatement = conn.createStatement();
		String querry = "SELECT * FROM stormtrooper_unit;";
		ResultSet resultset = querryStatement.executeQuery(querry);
		
		
		String STUID; BattleGroup UnitCmd; Units UnitType; int AssignedStrength;
		Location Position;
		
		while(resultset.next()) {
			STUID = resultset.getString("STUID");
			if(resultset.getString("UnitCmd").equals("BG_1")) {
				UnitCmd = wu.get(0).getHQ();
			}else {
				UnitCmd = wu.get(1).getHQ();
			}
			
			
			if(resultset.getString("UnitType").equals("Aslt Infantry")) {
				UnitType = Units.valueOf("Assault_Infantry");
			}else {
				UnitType = Units.valueOf(resultset.getString("UnitType"));
			}

			AssignedStrength = resultset.getInt("AssignedStrength");
			Position = new Location(resultset.getInt("Location_X"), resultset.getInt("Location_Y"));
			
			if(UnitType.equals(Units.Assault_Infantry)) {				
				AssaultInfantryUnit assault = new AssaultInfantryUnit(STUID, UnitCmd, UnitType, AssignedStrength, Position);
				stu.add(assault);
			}
			else if(UnitType.equals(Units.Infantry)) {
				InfantryUnit infantry = new InfantryUnit(STUID, UnitCmd, UnitType, AssignedStrength, Position);
				stu.add(infantry);
			}
			else if(UnitType.equals(Units.Reconnaissance)) {
				ReconnaissanceUnit recon = new ReconnaissanceUnit(STUID, UnitCmd, UnitType, AssignedStrength, Position);
				stu.add(recon);
			}
			
			
		}
		
		
		return stu;
	}
	
	public static void displaySTUnits(ArrayList<StormtrooperUnit> su, int c) {
		for(int i = 0; i < c; i++) {
			su.get(i).displayUnitInfo();
		}
	}
}
