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
@Entity
@EqualsAndHashCode(callSuper = true )

@Table(name="Utilisateur")


public class Utilisateur extends AbstractEntity{
	
	private String nom ;

}
