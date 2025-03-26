package Collection;

	import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import Examen_Ejercicio1.GuzmanitosExcepcion;

	public abstract class MiembroBase2 {
		private int contadorAmigo,id;
		private static int contadorIdentificador = 0;
		private String email,nombre;
		protected List <MiembroBase2> amigos; 
		public int getContadorAmigo() {
			return contadorAmigo;
		}
		public void setContadorAmigo(int contadorAmigo) {
			this.contadorAmigo = contadorAmigo;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public static int getContadorIdentificador() {
			return contadorIdentificador;
		}
		public static void setContadorIdentificador(int contadorIdentificador) {
			MiembroBase2.contadorIdentificador = contadorIdentificador;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public List<MiembroBase2> getAmigos() {
			return amigos;
		}
		public void setAmigos(List<MiembroBase2> amigos) {
			this.amigos = amigos;
		}
		public MiembroBase2(String email, String nombre) {
			super();
			this.contadorAmigo = 0;
			this.id = id + contadorIdentificador;
			this.contadorIdentificador += 1;
			this.email = email;
			this.nombre = nombre;
			// this.amigos = new ArrayList <MiembroBase>();
		}
		@Override
		public int hashCode() {
			return Objects.hash(email, id);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			MiembroBase2 other = (MiembroBase2) obj;
			return Objects.equals(email, other.email) && id == other.id;
		}
		public abstract String getTipoUsuario();
		@Override
		public String toString() {
			return "MiembroBase [id=" + id + ", email=" + email + ", nombre=" + nombre + "]";
		}
		public boolean isAmigo (MiembroBase2 miembro) {
				return amigos.contains(miembro);
			}
		
		public void addAmigo (MiembroBase2 m) throws GuzmanitosExcepcion {
			if (isAmigo(m)) {
				throw new GuzmanitosExcepcion ("Este amigo ya pertenece a la lista");
			}
			else {
				amigos.add(m);
			}
		}
			
		}
	
	


