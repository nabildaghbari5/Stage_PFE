package Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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

@Table(name="LigneCdeFournisseur")

public class LigneCdeFournisseur extends AbstractEntity {
	
	@ManyToOne
	@JoinColumn(name="idmédicaments")
	private Médicaments médicaments ;
	
	@ManyToOne
	@JoinColumn(name="idcommandefournisseur")
	private List<CommandeFournisseur> CommandeFournisseur ;
	
}
