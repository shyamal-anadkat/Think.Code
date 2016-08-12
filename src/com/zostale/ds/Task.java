package com.zostale.ds;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * Represents a single Task. 
 * @author Shyamal Anadkat
 *
 */
public class Task {

	public boolean isDone;
	public boolean isImportant;
	public Date deadline;
	public Date createDate = new Date();
	public String description;
	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

	//empty constructor 
	//public Task(){}

	public Task(boolean isDone, boolean isImportant, String task) {
		this.isDone = isDone;
		this.isImportant = isImportant;
		this.description = task;
	}


	public void setDone(boolean val) {
		isDone = val;
	}

	public void setImportant(boolean val){
		isImportant = val;
	}

	public boolean getIsDone() {
		return this.isDone;
	}
	public String getDescription() {
		return this.description;
	}

	public boolean getIsImportant() {
		return this.isImportant;
	}

	public String getCreateDate() {
		return dateFormat.format(createDate);
	}


}
