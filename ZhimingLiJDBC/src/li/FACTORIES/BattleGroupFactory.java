package li.FACTORIES;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import li.DBSUPPORT.DBConnection;
import li.MAIN.Location;
import li.UNITS.BattleGroup;

public class BattleGroupFactory {

	public static ArrayList<BattleGroup> buildBattleGroups() throws ClassNotFoundException, SQLException{
		
		ArrayList<BattleGroup> bg = new ArrayList<>();
		Connection conn = DBConnection.establishDBConnection();
		Statement useStatement = conn.createStatement();
		useStatement.executeQuery("USE stormtrooper_java;");
		Statement querryStatement = conn.createStatement();
		String querry = "SELECT * FROM imperial_battlegroup;";
		ResultSet rsbg = querryStatement.executeQuery(querry);
		
		String BGID; String Designation; Location Position;
		
		while(rsbg.next()) {
			BGID = rsbg.getString("BGID");
			Designation = rsbg.getString("Designation");
			Position = new Location(rsbg.getInt("HQ_LocationX"), rsbg.getInt("HQ_LocationY"));
			
			BattleGroup bgroup = new BattleGroup(BGID, Designation, Position);
			bg.add(bgroup);
		}
		
		return bg;
	}
	
	public static void displayBattleGroups(ArrayList<BattleGroup> bg) {
		for(int i = 0; i < bg.size(); i++) {
			bg.get(i).displayBattleGroup();
		}
	}
}
