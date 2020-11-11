package DAO;

import java.sql.ResultSet;

public interface daoim {
	void add(Object o);
	ResultSet queryAll();
	void update(int id, Object o);
	void delete(int id);

}
