

/**
 * The Modeler is responsible for consuming a stream of data produced by
 * the Arduino. This data stream will be used to produce a 3-dimensional
 * model of the user's limb in space during each time-slice. The 3-dimensional
 * model produced by the Modeler will be consumed by the Renderer.
 */
public class Modeler {
	
	private BothArms currentArms;
	private ArrayList<BothArms> pastArms = new ArrayList<BothArms>();
	private float secondsBetweenSamples = 0.25;//Currently four samples per second
	
<<<<<<< HEAD
	//takes an input of some kind and outputs the arm positions
	//currently assuming arms start relaxed
	public Modeler(){
		currentArms = new BothArms(new Arm(true), new Arm(false));//Create arms at rest
	}
	
	/**
	 * Basic wrapper class for two arms
	 */
	public class BothArms{
		private Arm leftArm;
		private Arm rightArm;
		
		public BothArms(Arm leftArm, Arm rightArm){
			this.leftArm = leftArm;
			this.rightArm = rightArm;
		}
		
		public Arm getLeftArm(){
			return leftArm;
		}
		
		public Arm getRightArm(){
			return rightArm;
		}
=======
	
	public Modeler() {
		
>>>>>>> 831a874af5e723d0edfc1308cf811c7bf1121d29
	}
	
	/** Please don't push unfinished code, or code that will not make the 
	 * project copmile */
	//takes an input of some kind and outputs the arm positions
//	public Modeler(Arm la, Arm ra){
//		leftArm = la;
//		rightArm = ra;
//	} 
	
}
