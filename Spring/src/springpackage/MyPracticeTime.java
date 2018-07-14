package springpackage;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyPracticeTime {
	public static void main(String[] args) {
		/*Coach c = new CricketCoach();
		System.out.println(c.getPracticeInfo());
		Coach t = new TennisCoach();
		System.out.println(t.getPracticeInfo());
		Coach f = new FootballCoach();
		System.out.println(f.getPracticeInfo());*/
		ClassPathXmlApplicationContext cpac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//Coach c = cpac.getBean("Cricket_Coach", Coach.class);
		TennisCoach t = cpac.getBean("Tennis_Coach", TennisCoach.class);
		//TennisCoach t_copy = cpac.getBean("Tennis_Coach", TennisCoach.class); // By Default, it is singleton.
		//Coach f = cpac.getBean("Football_Coach", Coach.class);
		//System.out.println(c.getPracticeInfo());
		//System.out.println(t + "\n" + t_copy);
		/*System.out.println(t.getCandy());
		System.out.println(t.getPracticeInfo());
		System.out.println(t_copy.getCandy());
		System.out.println(t_copy.getPracticeInfo());*/
		//System.out.println(f.getPracticeInfo());
		System.out.println(t.getEmail());
		System.out.println(t.getTeamName());
	}
}
