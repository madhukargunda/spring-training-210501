package study.pattern.loosecoupling.domain.clinic.impl;

import study.pattern.loosecoupling.domain.clinic.Clinic;
import study.pattern.loosecoupling.domain.vaccine.Vaccine;

public class SengkangPolyClinic implements Clinic {
	
	private Vaccine vaccine;
	
	public SengkangPolyClinic(Vaccine vaccine) {
		this.vaccine = vaccine;
	}

	public Vaccine getVaccine() {
		return vaccine;
	}

	@Override
	public String toString() {
		return "SengkangPolyClinic [vaccine=" + vaccine + "]";
	}
	
}
