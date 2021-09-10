package chap08test04;
//DAO( Data Access Object): java class ->db(oracle DB, MySQL)
public interface DataAccessObject {
	public void select();
	public void insert();
	public void update();
	public void delete();

}
