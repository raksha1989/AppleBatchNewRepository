package abstraction;

public class ProjectMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(VaccinationProject.compname);
		
		VaccinationProject vp= new VaccinationProject();
		vp.requirements();
		vp.feedback();
		Project.staticDemo();
		
		
		Project bp= new BankProject();
		 bp.requirements();

	}

}
