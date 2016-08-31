//creation of a robot object and assignment of components
	public class RT600 extends Robot {
		public RT600(){
			frameMaterial = new TitaniumFrame();
			primaryService = new OffensiveRobot();
			equippedTool = new AttackBot();
		}
//override of the abstract report method to display robot object components
		@Override
		public void report() {
			System.out.println("RT600 model unit ready for deployment.\nInstalled components:");
			constructFrame();
			equipTool();			
			batteryPack();
			assignService();
		}
	}