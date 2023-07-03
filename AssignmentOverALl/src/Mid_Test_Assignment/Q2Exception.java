package Mid_Test_Assignment;

class NotEligibleForVaccineException extends Exception
{
	public NotEligibleForVaccineException()
	{
		super();
	}
	public NotEligibleForVaccineException(String ms)
	{
		super();
	}
	
}

public class Q2Exception {
	
	public static void checkEligibility(int age) throws NotEligibleForVaccineException
	{
		if(age<60)
		{
			throw new NotEligibleForVaccineException("Not Eligible");
		}
	}

	public static void main(String[] args) {
		// 2.Create Covin App, in which help a Person to book a slot for vaccination.
//		NotEligibleForVaccineException should be generated if flag for first_vaccine_taken is false or days_complete_after_first_dose is less than 60. 
//		Handle NotEligibleForVaccineException as  checked exception.
		
		try
		{
			checkEligibility(55);
		}
		catch(NotEligibleForVaccineException n)
		{
			System.out.println(n);
//			System.out.println(n.getMessage());
//			n.printStackTrace();
		}
		finally
		{
			System.out.println("Working");
		}
		System.out.println("All Done");

	}

}
