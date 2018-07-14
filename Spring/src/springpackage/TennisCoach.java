package springpackage;

public class TennisCoach implements Coach {

	private FortuneService fortuneService;
	private String email;
	private String teamName;

	public TennisCoach(FortuneService fs) {
		this.fortuneService = fortuneService;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getCandy() {
		return fortuneService.getFortune();
	}

	public FortuneService getFortuneService() {
		return fortuneService;
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("In Setter Method");
		this.fortuneService = fortuneService;
	}
	
	public void doMyStartUp() {
		System.out.println(" Creating a database connection ");
	}
	
	public void doMyShutDown() {
		System.out.println(" Closing a database connection ");
	}

	@Override
	public String getPracticeInfo() {
		return " Tennis : Practice for 2 hours a day ";
	}

}
