package Model;

import java.math.BigDecimal;

import javax.persistence.Column;
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
@EqualsAndHashCode(callSuper = true )
@Entity

@Table(name="Médicaments")

public class Médicaments  extends AbstractEntity{
	
	
	
	
	
	
	@Column(name="codemédicamnt ")
	private String codeMedicament ;
	
	@Column(name="name")
	private String name ;
	
	
	@Column(name="Classification")
	private String  Classification ;
	
	@Column(name="designation")
	private String designation; 
	
	@Column(name="prixunitaire")
	private BigDecimal prixUnitaire ;
	
	
	@Column(name="photo")
	private String Photo ;
	
	@ManyToOne
	@JoinColumn(name="idCategory")
	private Category category ;
   
}
