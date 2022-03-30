package com.employee.Rest.CollectionDTO;

public class BaseExtraInfoDTO {

	private int id;
	// if commented, this field will not appear in Postman
	private String nickName;

//	public BaseEmpExtraInfoDTO() {
//		this.id = new BigInteger("34"); 
//		this.nickName = "Rithik"; 
//	}
//	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	@Override
	public String toString() {
		return "BaseExtraInfoDTO [id=" + id + ", nickName=" + nickName + "]";
	}

}
