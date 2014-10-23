package models.DAO.mem;

import models.DAO.DAOFactory;
import models.DAO.RoundDAO;
import models.DAO.UserDAO;

public class MemDAOFactory extends DAOFactory {

	private static MemDAOFactory factory = new MemDAOFactory();
	
	private MemDAOFactory(){}
	
	public MemDAOFactory getFactory(){
		return factory;
	}
	
	@Override
	public UserDAO getUserDAO() {
		return new MemUserDAO();
	}

	@Override
	public RoundDAO getRoundDAO() {
		return new MemRoundDAO();
	}
	
	

}
