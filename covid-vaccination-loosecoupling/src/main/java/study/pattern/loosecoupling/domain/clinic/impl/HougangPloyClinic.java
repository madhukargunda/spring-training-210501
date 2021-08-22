package study.pattern.loosecoupling.domain.clinic.impl;

import study.pattern.loosecoupling.domain.clinic.Clinic;
import study.pattern.loosecoupling.domain.vaccine.Vaccine;

public class HougangPloyClinic implements Clinic {
	
	private Vaccine vaccine;
	
	public HougangPloyClinic(Vaccine vaccine) {
		this.vaccine = vaccine;
	}

	public Vaccine getVaccine() {
		return vaccine;
	}

	@Override
	public String toString() {
		return "HougangPloyClinic [vaccine=" + vaccine + "]";
	}
}
