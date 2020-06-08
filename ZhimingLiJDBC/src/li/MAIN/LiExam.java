package li.MAIN;


import java.sql.SQLException;

import java.util.ArrayList;


import li.FACTORIES.BattleGroupFactory;
import li.FACTORIES.StormtrooperFactory;
import li.FACTORIES.StormtrooperUnitFactory;
import li.FACTORIES.WalkerFactory;
import li.FACTORIES.WalkerUnitFactory;
import li.STORMTROOPERS.STNonOfficer;
import li.STORMTROOPERS.STOfficer;
import li.UNITS.BattleGroup;
import li.UNITS.StormtrooperUnit;
import li.UNITS.WalkerUnit;
import li.WALKERS.ImperialWalker;

public class LiExam {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		ArrayList<BattleGroup> bg = BattleGroupFactory.buildBattleGroups();
		BattleGroupFactory.displayBattleGroups(bg);
		
		
		
		ArrayList<STOfficer> sto = StormtrooperFactory.buildOfficers();
		StormtrooperFactory.displayOfficer(sto, 2);
		
		
		ArrayList<STNonOfficer> stn = StormtrooperFactory.buildNonOfficer();
		StormtrooperFactory.displayNonOfficer(stn, 2);
	
		
		ArrayList<WalkerUnit> wu = WalkerUnitFactory.buildWalkerUnits(bg);
		WalkerUnitFactory.displayWalkerUnits(wu, 2);
		
		ArrayList<ImperialWalker> iw = WalkerFactory.buildWalkers(wu);
		WalkerFactory.displayWalkers(iw, 2);
		
		ArrayList<StormtrooperUnit> su = StormtrooperUnitFactory.buildSTUnits(bg, wu);
		StormtrooperUnitFactory.displaySTUnits(su, 2);
		
	}

}
