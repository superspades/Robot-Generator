//abstract class for generating robot frames, service types, and tools
public abstract class Robot {
	FrameMaterial frameMaterial;
	PrimaryService primaryService;
	EquippedTool equippedTool;
//default robot constructor	
	public Robot() {		
	}
//abstract report method	
	public abstract void report();
//frame construction method calling the frame material interface	
	public void constructFrame() {
		frameMaterial.frame();
	}
//service type method calling the primary service interface	
	public void assignService() {
		primaryService.service();
	}
//tool equip method calling the equip tool interface	
	public void equipTool() {
		equippedTool.tool();
	}
//battery pack method that installs a battery into all constructed robot objects	
	public void batteryPack() {
		System.out.println("NuclearLowRad lifetime battery pack installed.");
	}
//method to reassign a robot object's default frame material	
	public void setConstructFrame(FrameMaterial fm) {
		frameMaterial = fm;
	}
//method to reassign a robot object's default service type	
	public void setAssignService(PrimaryService ps) {
		primaryService = ps;
	}
//method to reassign a robot object's default equipped tool	
	public void setEquipTool(EquippedTool et) {
		equippedTool = et;
	}	
}
//frame material interface with frame method to be implemented for robot object
interface FrameMaterial {
	public void frame();
}
//primary service interface with service method to be implemented for robot object
interface PrimaryService {
	public void service();
}
//equipped tool interface with tool method to be implemented for robot object
interface EquippedTool {
	public void tool();
}
//frame type implementing FrameMaterial interface
class SteelFrame implements FrameMaterial {
	public void frame() {
		System.out.println("Reinforced steel frame installed.");
	}
}
//frame type implementing FrameMaterial interface
class TitaniumFrame implements FrameMaterial {
	public void frame() {
		System.out.println("Polished titanium frame installed.");
	}
}
//frame type implementing FrameMaterial interface
class UnobtaniumFrame implements FrameMaterial {
	public void frame() {
		System.out.println("Tempered unobtanium frame installed.");
	}
}
//service type implementing PrimaryService interface
class ServantRobot implements PrimaryService {
	public void service() {
		System.out.println("This unit is programmed for residential service.");
	}
}
//service type implementing PrimaryService interface
class DefensiveRobot implements PrimaryService {
	public void service() {
		System.out.println("This unit is programmed for heavy guard duty.");
	}
}
//service type implementing PrimaryService interface
class OffensiveRobot implements PrimaryService {
	public void service() {
		System.out.println("This unit is programmed for telling inapropriate jokes.");
	}
}
//equipped tool implementing EquippedTool interface
class DishWasher implements EquippedTool {
	public void tool() {
		System.out.println("Dishwashing protocols installed.");
	}
}
//equipped tool implementing EquippedTool interface
class RobotShield implements EquippedTool {
	public void tool() {
		System.out.println("Human protection protocols installed.");
	}
}
//equipped tool implementing EquippedTool interface
class AttackBot implements EquippedTool {
	public void tool() {
		System.out.println("...You're mama.");
	}
}
