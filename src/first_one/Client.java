package first_one;

import java.time.LocalDate;

public class Client {
	
	int visitas;
	private LocalDate data;
	
	public int getVisitas() {
		return visitas;
	}
	public void setVisitas(int visitas) {
		this.visitas = visitas;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return "Client [visitas=" + visitas + ", data=" + data + "]";
	}
	
	

}
