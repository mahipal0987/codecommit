package mvn1;

import panda.dao.Dao;
import mvn1.tool.AppConsole;


public abstract class AppTestCase {
	protected Dao getDao() {
		return AppConsole.i().getDao();
	}
}
