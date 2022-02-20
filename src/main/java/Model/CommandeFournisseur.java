package Model;

import java.time.Instant;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor 
@AllArgsConstructor 
@Entity
@EqualsAndHashCode(callSuper = true )

@Table(name="commandefournisseur")


public class CommandeFournisseur  extends AbstractEntity{
	
	@Column(name="code")
	private String code;
	
	@Column(name="datecommande")
	private Instant dateCommande ;
	
	@ManyToOne
	@JoinColumn(name="idFournisseur")
	private Fournisseur fournisseur ;
	
	@OneToMany(mappedBy="commandeFournisseur")
	@JoinColumn(name="LigneCdeFournisseur")
	private List<LigneCdeFournisseur> LigneCdeFournisseur ;
	
	

}
