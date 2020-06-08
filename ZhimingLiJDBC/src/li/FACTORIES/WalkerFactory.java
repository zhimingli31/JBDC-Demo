package li.FACTORIES;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import li.DBSUPPORT.DBConnection;
import li.ENUMS.WlkrStatus;
import li.MAIN.Location;
import li.UNITS.WalkerUnit;
import li.WALKERS.ATAT;
import li.WALKERS.ATST;
import li.WALKERS.ImperialWalker;

public class WalkerFactory {

	public static ArrayList<ImperialWalker> buildWalkers(ArrayList<WalkerUnit> wu) throws ClassNotFoundException, SQLException {
		ArrayList<ImperialWalker> iw = new ArrayList<>();
		
		Connection conn = DBConnection.establishDBConnection();
		Statement useStatement = conn.createStatement();
		useStatement.executeQuery("USE stormtrooper_java;");
		Statement querryStatement = conn.createStatement();
		String querry = "SELECT * " + 
				"FROM imperial_walkers_assign, walker_units " + 
				"WHERE imperial_walkers_assign.WUID = walker_units.WUID;"; 
		ResultSet resultset = querryStatement.executeQuery(querry);
		
		WalkerUnit UnitAssigned = null; Location Position = null; WlkrStatus Status = null;
		int count = 0;
		
		while(resultset.next()) {
			
			try {
				if(wu.get(count).getWUID().equals(resultset.getString("WUID"))) {
					UnitAssigned = wu.get(count);
					Position = wu.get(count).getPosition();
					Status = WlkrStatus.valueOf(resultset.getString("Status"));
					count++;
					
					if(resultset.getString("WalkerType").contains("ST")) {
						ATST st = new ATST(UnitAssigned, Position, Status);
						st.setWID(resultset.getString("WID"));
						iw.add(st);
					}else {
						ATAT at = new ATAT(UnitAssigned, Position, Status);
						at.setWID(resultset.getString("WID"));
						iw.add(at);
					}
				}
			}catch(Exception e) {
				
			}
			

		}
		
		return iw;
	}
	
	public static void displayWalkers(ArrayList<ImperialWalker> iw, int c) {
		for(int i = 0; i < c; i++) {
			if(iw.get(i).getWType().equals("AT-AT")) {
				System.out.println(((ATAT)iw.get(i)).getWID() + " Imperial Walker: " + iw.get(i).getWType());
				iw.get(i).displayWalkerInfo();
			}else {
				System.out.println(((ATST)iw.get(i)).getWID() + " Imperial Walker: " + iw.get(i).getWType());
				iw.get(i).displayWalkerInfo();
			}

		}
	}
}
