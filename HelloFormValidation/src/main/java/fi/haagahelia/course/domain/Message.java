package fi.haagahelia.course.domain;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Message {
	@NotNull
	private Long id;
	
    @Size(min=5, max=30)
	private String msg;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	@Override
	public String toString() {
		return "Message [msg=" + msg + "]";
	}
}
