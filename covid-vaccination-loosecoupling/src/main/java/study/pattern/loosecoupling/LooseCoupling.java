package study.pattern.loosecoupling;

import java.time.LocalDate;

import study.pattern.loosecoupling.domain.Address;
import study.pattern.loosecoupling.domain.Person;
import study.pattern.loosecoupling.domain.Registration;
import study.pattern.loosecoupling.domain.clinic.impl.HougangPloyClinic;
import study.pattern.loosecoupling.domain.clinic.impl.RaffelsPolyClinic;
import study.pattern.loosecoupling.domain.clinic.impl.SengkangPolyClinic;
import study.pattern.loosecoupling.domain.vaccine.impl.CovaxinVaccine;
import study.pattern.loosecoupling.domain.vaccine.impl.ModernaVaccine;
import study.pattern.loosecoupling.domain.vaccine.impl.PfizerVaccine;

/**
 * The below example illustrates how to implement the loose coupling
 * 
 * @author madhukargunda
 *
 */
public class LooseCoupling {
	public static void main(String[] args) {
		
		//1.Dependency injection
		//2.Constructor/Setter based injection
		//3.interface and Implementation concepts .
		

		// Use Case 1 - Using constructor injecting dependencies dynamically

				// Step0 :  Identify and create dependency objects .
				Person johndoe = new Person("John", "Doe", new Address("Rivervale Drive", "SENGKANG", "SINGAPORE", "541191"));
		
				// step 1: Date of Registration
				LocalDate juneFirstSlot = LocalDate.of(20201, 06, 1);
		
				// step 3: Choose the clinic
				ModernaVaccine modernaVaccine = new ModernaVaccine();
				HougangPloyClinic punggolPolyClinic = new HougangPloyClinic(modernaVaccine);
				Registration registrationForVaccine = new Registration(johndoe, juneFirstSlot, punggolPolyClinic);
				printDetails(registrationForVaccine);			
				
		
				// Step0 : Register Object .
				Address jaineDoeAddresss = new Address("Rivervale Drive", "SENGKANG", "SINGAPROE", "5411191");
				Person jaineDoe = new Person("Jaine", "Doe", jaineDoeAddresss);
		
				// step 1: Date of Registration
				LocalDate june1OthSlot = LocalDate.of(20201, 06, 10);
		
				// step 3: Choose the clinic
				CovaxinVaccine covaxin = new CovaxinVaccine();
				SengkangPolyClinic jainePunngolPolyClinic = new SengkangPolyClinic(covaxin);
				Registration jaineRegistrationForVaccine = new Registration(jaineDoe, june1OthSlot, jainePunngolPolyClinic);
				printDetails(jaineRegistrationForVaccine);
		

		
	// Use Case 2 : Setter Injection and constructor injection , when optional or not mandatory 
		
				Registration babyDoeRegisterforvaccine = new Registration();
				
				// Step0 : Register Object .
				Person babyDoe = new Person("Baby", "Doe", new Address("Rivervale Drive", "SENGKANG", "SINGAPROE", "5411191"));
				babyDoeRegisterforvaccine.setPerson(babyDoe);
		
				// step 1: Date of Registration
				LocalDate june3oth = LocalDate.of(20201, 06, 30);
				babyDoeRegisterforvaccine.setDate(june3oth);
				
				// step 3: Choose the clinic
				PfizerVaccine pfizerVaccine = new PfizerVaccine();
				RaffelsPolyClinic babyDoeChoice = new RaffelsPolyClinic(pfizerVaccine);
				babyDoeRegisterforvaccine.setClinic(babyDoeChoice);
				
				
				printDetails(babyDoeRegisterforvaccine);
	
	}
	//lombok @slf4j not working hence using this method for temporary fix
	
	public static void printDetails(Registration registrationForVaccine) {
		System.out.println("**************************************************************************************");
		System.out.println("First Name  : "+registrationForVaccine.getPerson().getFirstName());
		System.out.println("Last Name  : "+registrationForVaccine.getPerson().getLastName());
		System.out.println("Registration Date : "+registrationForVaccine.getDate());
		System.out.println("Clinic and Vaccine Name  : "+registrationForVaccine.getClinic());
		System.out.println("**************************************************************************************");
	}
}
