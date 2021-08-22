package study.pattern.vaccination.domain.clinic;

import lombok.Data;
import lombok.Getter;
import study.pattern.vaccination.domain.vaccine.PfizerVaccination;

@Data
public class RaffelClinic {

	@Getter
	private PfizerVaccination pfizerVaccination;
		
	public RaffelClinic() {
		this.pfizerVaccination = new PfizerVaccination(); // tight coupling
	}

}
