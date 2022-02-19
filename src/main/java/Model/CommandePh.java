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

@Table(name="CommandePh")


public class CommandePh  extends AbstractEntity{

}
