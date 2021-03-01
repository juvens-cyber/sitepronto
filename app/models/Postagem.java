package models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import play.db.jpa.Model;


@Entity
public class Postagem extends Model {

	public String texto; 
	@ManyToOne
	@JoinColumn()
	public Usuario donoDaPostagem;
	
	@OneToOne
	public String tituloPostagem;
}
