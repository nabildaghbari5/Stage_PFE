package Model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
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

@Table(name="pharmacien")


public class pharmacien extends AbstractEntity {
	
	
	
	@Column(name="nom")
	private String nom ;
	
	@Column(name="prenom")
	private String prenom ;
	
	@Column(name="photo")
	private String Photo ;
	
	@Column(name="mail")
	private String mail ;
	
	@Column(name="numtel")
	private String numTel ;
	
	 
	@OneToMany(mappedBy="pharmacien")
	private List<CommandeFournisseur> CommandePh ; 
	
	
	
	
	
	
	
	
	

}
