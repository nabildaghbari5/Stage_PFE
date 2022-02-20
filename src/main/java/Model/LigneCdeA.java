package Model;

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

@Table(name="Lignecdeagée")


public class LigneCdeA extends AbstractEntity {
	
	
	@ManyToOne
	@JoinColumn(name="idmédicaments")
	private Médicaments médicaments ;
	
	@ManyToOne
	@JoinColumn(name="idcommandeAgées")
	private CommandeAgées commandeAgées ;

}
