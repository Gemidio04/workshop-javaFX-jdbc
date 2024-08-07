package model.services;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class DepartmentService {

	private DepartmentDao dpDAO = DaoFactory.createDepartmentDao();
	
	public List<Department> findAll(){
		 return dpDAO.findAll(); 
	}
	
	public void saveOrUpdate(Department dep) {
		if(dep.getId()==null) {
			dpDAO.insert(dep);
		}else {
			dpDAO.update(dep);
		}
	}
	
	public void remove(Department dep) {
		dpDAO.deleteById(dep.getId()); 
	}
}
