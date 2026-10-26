package entities;

import java.util.Date;
import java.util.Objects;

public class LogUser {
	private String name;
	private Date moment;
	
	public LogUser(String name, Date date) {
		super();
		this.name = name;
		this.moment = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate() {
		return moment;
	}

	public void setDate(Date date) {
		this.moment = date;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LogUser other = (LogUser) obj;
		return Objects.equals(name, other.name);
	}
	
	
	
	

}
