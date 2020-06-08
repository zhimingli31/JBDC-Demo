package li.FACTORIES;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import li.DBSUPPORT.DBConnection;
import li.MAIN.Location;
import li.UNITS.BattleGroup;
import li.UNITS.WalkerUnit;

public class WalkerUnitFactory {

	public static ArrayList<WalkerUnit> buildWalkerUnits(ArrayList<BattleGroup> bg) throws ClassNotFoundException, SQLException{
		ArrayList<WalkerUnit> wu = new ArrayList<>();
		
		Connection conn = DBConnection.establishDBConnection();
		Statement useStatement = conn.createStatement();
		useStatement.executeQuery("USE stormtrooper_java;");
		Statement querryStatement = conn.createStatement();
		String querry = "SELECT * FROM walker_units;";
		ResultSet resultset = querryStatement.executeQuery(querry);
		
		String WUID = ""; BattleGroup HQ = null; Location Position = null;
		
		while(resultset.next()) {
			

			WUID = resultset.getString("WUID");
			if(resultset.getString("BattleGroup").equals(bg.get(0).getBGID())) {
				HQ = bg.get(0);
			}
			else if(resultset.getString("BattleGroup").equals(bg.get(1).getBGID())) {
				HQ = bg.get(1);
			}
			Position = new Location(resultset.getInt("Location_X"), resultset.getInt("Location_Y"));
			
			WalkerUnit walker = new WalkerUnit(WUID, HQ, Position);
			wu.add(walker);
		}
		
		return wu;
	}
	
	public static void displayWalkerUnits(ArrayList<WalkerUnit> wu, int c) {
		for(int i = 0; i < c; i++) {
			wu.get(i).displayWalkerUnitInfo();
		}
	}
}
