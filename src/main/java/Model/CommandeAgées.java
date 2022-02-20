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

@Table(name="CommandeAgées ")

public class CommandeAgées extends AbstractEntity {
	
	
	@Column(name="code ")
	private String code ;
	
	@Column(name="datecammnade")
	private Instant dateCommande ; 
	
	@ManyToOne 
	@JoinColumn(name="idAgée")
	private Agée agée ;
	
	@OneToMany(mappedBy = "commandeAgées")
	private List<LigneCdeA> LigneCommandeAgées ;
	
	

}
