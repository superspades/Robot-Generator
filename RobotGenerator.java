/********             Eric Madsen Robot Generator Tool                 ********/
/******** This program generates robots for use in gaming applications ********/

public class RobotGenerator {

	public static void main(String[] args) {
//generate a default model 500 robot		
		Robot model500 = new RT500();
		model500.report();
		System.out.println("--------------------");
//reassign attributes of model 500 robot
		model500.setAssignService(new OffensiveRobot());
		model500.setEquipTool(new AttackBot());
		model500.report();
		System.out.println("--------------------");
//generate a default model 600 robot
		Robot model600 = new RT600();
		model600.report();
		System.out.println("--------------------");
//generate a default model 700 robot
		Robot model700 = new RT700();
		model700.report();
		System.out.println("--------------------");
//reassign attributes of model 700 robot
		model700.setConstructFrame(new SteelFrame());
		model700.report();
	}
}
