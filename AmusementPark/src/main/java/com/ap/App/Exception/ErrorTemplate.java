package com.ap.App.Exception;

public class ErrorTemplate {
	private String actionType;
	public ErrorTemplate() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public ErrorTemplate( String actionType) {
		super();
		this.actionType = actionType;
	}

	public String getActionType() {
		return actionType;
	}
	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

}
