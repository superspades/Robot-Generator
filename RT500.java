//creation of a robot object and assignment of components
	public class RT500 extends Robot {
		public RT500(){
			frameMaterial = new SteelFrame();
			primaryService = new ServantRobot();
			equippedTool = new DishWasher();
		}
//override of the abstract report method to display robot object components
		@Override
		public void report() {
			System.out.println("RT500 model unit ready for deployment.\nInstalled components:");
			constructFrame();
			equipTool();			
			batteryPack();
			assignService();
		}
	}