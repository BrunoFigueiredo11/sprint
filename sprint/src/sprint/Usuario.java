package sprint;

public class Usuario {
	int id;
	String nome;
	String msg;
	String status;
	String feedBack;

	@Override
	public String toString() {
		return "Mensagem enviada : " + msg +  "\n\t  	   " + feedBack;
	}

	public Usuario(int id, String nome) {
		this.id = id;
		this.nome = nome;
		this.status = "ok";
		this.msg = null;
	}

	public void enviaMsg(String msg) {
		this.msg = msg;
		this.status = "não ok";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getFeedBack() {
		return feedBack;
	}

	public void setFeedBack(String feedBack) {
		this.feedBack = feedBack;
	}

}
