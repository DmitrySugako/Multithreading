package com.tc.mr.task;

import java.util.Objects;

public class Task {
		private String action;

	public Task( String action) {
		this.action=action;
	}
	
	public void taskLaunch (String action) {
		System.out.println(action);
	}
	


	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	@Override
	public int hashCode() {
		return Objects.hash(action);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Task other = (Task) obj;
		return Objects.equals(action, other.action);
	}

	@Override
	public String toString() {
		return "Task [action=" + action + "]";
	}


}
