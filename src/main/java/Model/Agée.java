package Model;

import javax.persistence.Entity;
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
@Table(name="agée")

public class Agée extends AbstractEntity {
	
	
	
	
	

}
