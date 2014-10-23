package models.DAO;

public abstract class DAOFactory {
	
	
	public abstract UserDAO getUserDAO();
	
	public abstract RoundDAO getRoundDAO();
}
