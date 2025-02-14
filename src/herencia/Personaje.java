package herencia;

import java.util.Objects;

public class Personaje {
private String nombre;
private int nivel;
private int hp;
private String arma= getArma();



@Override
public String toString() {
	return "Personaje [nombre=" + nombre + ", nivel=" + nivel + ", hp=" + hp + ", arma=" + arma + "]";
}

@Override
public int hashCode() {
	return Objects.hash(arma, hp, nivel, nombre);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Personaje other = (Personaje) obj;
	return Objects.equals(arma, other.arma) && hp == other.hp && nivel == other.nivel
			&& Objects.equals(nombre, other.nombre);
}

public Personaje(String nombre, int nivel, int hp) {
	super();
	this.nombre = nombre;
	this.nivel = nivel;
	this.hp = hp;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public int getNivel() {
	return nivel;
}

public void setNivel(int nivel) {
	this.nivel = nivel;
}

public int getHp() {
	return hp;
}

public void setHp(int hp) {
	this.hp = hp;
}

public void setArma(String arma) {
	this.arma = arma;
}

protected String getArma () {
	;
	
    if (this instanceof Caballero) {
    	this.arma= "Espada";
    } else if (this instanceof Arquero) {
    	this.arma= "Flecha";
    } else if (this instanceof Mago) {
    	this.arma="Hechizo";
    } else {
    	
    	this.arma="vacio";
    }
    return arma;
}




}
