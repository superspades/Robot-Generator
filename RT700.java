//creation of a robot object and assignment of components
	public class RT700 extends Robot {
		public RT700(){
			frameMaterial = new UnobtaniumFrame();
			primaryService = new DefensiveRobot();
			equippedTool = new RobotShield();
		}
//override of the abstract report method to display robot object components
		@Override
		public void report() {
			System.out.println("RT700 model unit ready for deployment.\nInstalled components:");
			constructFrame();
			equipTool();			
			batteryPack();
			assignService();
		}
	}
