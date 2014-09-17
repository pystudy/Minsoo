package springbook.user.dao;

public class DaoFactory {
	public UserDao userDao(){
		ConnectionMaker connectionMaker = new DconnectionMaker();
		UserDao userDao = new UserDao(connectionMaker);
		return userDao;
	}
}
