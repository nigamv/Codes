package designPatterns.builderDesignPattern;

public class RobotEngineer {

	private RobotBuilder  builder;
	
	public RobotEngineer( RobotBuilder robotBuilder){
		this.builder = robotBuilder;
	}
	public Robot getRobot(){
	
		
			return builder.getRobot();
	}
	
	public void makeRobot(){
		
		builder.buildRobotHead();
		builder.buildRobotArms();
		builder.buildRobotTorso();
		builder.buildRobotLegs();
	}
	
}
