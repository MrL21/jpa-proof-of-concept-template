package utn.dds.persistencia.futbol.persistence;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Formacion {

	@Id
	@GeneratedValue
	private Long id;
	private Long goles;

	@ManyToOne
	private Equipo equipo; //Formacion->Equipo es de muchos a uno, un equipo puede tener varias formaciones

	@ManyToMany
	private List<Jugador> jugadores = new ArrayList<Jugador>();

	public Equipo getEquipo() {
		return equipo;
	}

	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}

	public List<Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugadores(List<Jugador> jugadores) {
		this.jugadores = jugadores;
	}

	public Long getGoles() {
		return goles;
	}

	public void setGoles(Long goles) {
		this.goles = goles;
	}

}
