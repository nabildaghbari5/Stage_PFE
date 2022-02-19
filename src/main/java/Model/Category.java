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

@Table(name="Category")

public class Category extends AbstractEntity {
	
	@Column(name="code")
	private String code ;
	
	@Column(name="designation")
	private String designation ;
	
	
	
	@OneToMany(mappedBy = "Category")
	private List<Médicaments> medicaments ;

}
