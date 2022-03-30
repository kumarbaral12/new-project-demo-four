package com.employee.Rest.CollectionDTO;

public class DepartmentDTO {

	

	private int departId;
	
	private String departmentName;
	
	private double yearsExperience;

	public int getDepartId() {
		return departId;
	}

	public void setDepartId(int departId) {
		this.departId = departId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public double getYearsExperience() {
		return yearsExperience;
	}

	public void setYearsExperience(double yearsExperience) {
		this.yearsExperience = yearsExperience;
	}

	@Override
	public String toString() {
		return "DepartmentDTO [departId=" + departId + ", departmentName=" + departmentName + ", yearsExperience="
				+ yearsExperience + "]";
	}

}
