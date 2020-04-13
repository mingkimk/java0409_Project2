package Client;

import java.io.Serializable;

public class LoginDTO implements Serializable {
	String id;
	String pwd;

	// Object obj = new LoginDTO();
	// Object obj = new String();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public LoginDTO(String id, String pwd) {
		this.id = id;
		this.pwd = pwd;
	}

}