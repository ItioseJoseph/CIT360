package edu.ItioseJoseph.test;

public class EmployeeController {
	private Employee model;
	private EmployeeView view;
	
	public EmployeeController(Employee model, EmployeeView view) {
		this.model = model;
		this.view = view;
	}
	
	public void setEmployeeName(String empName) {
		model.setName(empName);
	}
	
	public String getEmployeeName() {
		return model.getempName();
	}
	
	public void setempID(String empID) {
		model.setempID(empID);
	}
	
	public String getempID() {
		return model.getempID();
	}
	
	public void setempEmail(String empEmail) {
		model.setEmail(empEmail);
	}
	
	public String getempEmail() {
		return model.getempEmail();
	}
	
	public void updateView() {
		view.printEmployeeDetails(model.getempName(), model.getempID(), model.getempEmail());
	}

}
