/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.JoinTable;

@Entity
@Table(name="filme")
public class FilmeEntity {
	
	public static final String SECURITY_RESOURCE = "res://senior.com.br/furb/basico/entities/filme";

	/**
	 * Chave primária
	 */
	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@Column(name = "id", updatable = false)
	private java.util.UUID id;
	
	/**
	 * nome
	 */
	@Column(name = "nome")
	private String nome;
	
	/**
	 * diretor
	 */
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "diretor")
	private DiretorEntity diretor;
	
	/**
	 * genero
	 */
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "genero")
	private GeneroEntity genero;
	
	/**
	 * atores
	 */
	@OneToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "filme_atores",
	          joinColumns = @JoinColumn(name = "filme_id", referencedColumnName = "id"),
	          inverseJoinColumns = @JoinColumn(name = "atores_id", referencedColumnName = "id"))
	private java.util.List<AtorEntity> atores;
	
	public java.util.UUID getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public DiretorEntity getDiretor() {
		return diretor;
	}
	
	public GeneroEntity getGenero() {
		return genero;
	}
	
	public java.util.List<AtorEntity> getAtores() {
		return atores;
	}
	
	public void setId(java.util.UUID id) {
		this.id = id;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setDiretor(DiretorEntity diretor) {
		this.diretor = diretor;
	}
	
	public void setGenero(GeneroEntity genero) {
		this.genero = genero;
	}
	
	public void setAtores(java.util.List<AtorEntity> atores) {
		this.atores = atores;
	}
	
	@Override
	public int hashCode() {
	    int ret = 1;
	    if (id != null) {
	        ret = 31 * ret + id.hashCode();
	    }
	    return ret;
	}
	
	@Override
	public boolean equals(Object obj) {
	    if (this == obj) {
	        return true;
	    }
	    if (!(obj instanceof FilmeEntity)) {
	        return false;
	    }
	    FilmeEntity other = (FilmeEntity) obj;
	    if ((id == null) != (other.id == null)) {
	        return false;
	    }
	    if ((id != null) && !id.equals(other.id)) {
	        return false;
	    }
	    return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		toString(sb, new ArrayList<>());
		return sb.toString();
	}
	
	void toString(StringBuilder sb, List<Object> appended) {
		sb.append(getClass().getSimpleName()).append(" [");
		if (appended.contains(this)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(this);
		sb.append("id=").append(id == null ? "null" : id).append(", ");
		sb.append("nome=").append(nome == null ? "null" : nome).append(", ");
		sb.append("diretor=<");
		if (diretor == null) {
			sb.append("null");
		} else {
			diretor.toString(sb, appended);
		}
		sb.append('>').append(", ");
		sb.append("genero=<");
		if (genero == null) {
			sb.append("null");
		} else {
			genero.toString(sb, appended);
		}
		sb.append('>').append(", ");
		sb.append("atores=<");
		if (atores == null) {
			sb.append("null");
		} else {
			sb.append('[');
			Iterator<AtorEntity> iterator = atores.iterator();
			while (iterator.hasNext()) {
				iterator.next().toString(sb, appended);
				if (iterator.hasNext()) {
					sb.append(", ");
				}
			}
			sb.append(']');
		}
		sb.append('>');
		sb.append(']');
	}
	
}
