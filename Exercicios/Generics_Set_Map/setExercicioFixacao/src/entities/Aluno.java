package entities;

import java.util.Objects;

public class Aluno {
	private Integer cod;
	
	public Aluno(Integer cod) {
		this.cod = cod;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cod);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(cod, other.cod);
	}
	
	
	
	

}
