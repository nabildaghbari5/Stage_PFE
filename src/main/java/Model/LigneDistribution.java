package Model;

import java.math.BigDecimal;

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

@Table(name="LigneDistribution")


public class LigneDistribution  extends AbstractEntity {
  
	
	@ManyToOne 
	@JoinColumn(name="iddistribution")
	private Distribution distribution ;
	
	private BigDecimal quantite ;
	
}
