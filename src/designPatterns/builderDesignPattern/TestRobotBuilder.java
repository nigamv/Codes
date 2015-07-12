package designPatterns.builderDesignPattern;

public class TestRobotBuilder {
	
	public static void main (String [] args){
		
		RobotBuilder oldStyleRobot = new OldRobotBuilder();
		
		RobotEngineer engineer = new RobotEngineer(oldStyleRobot);
		engineer.makeRobot();
		
		Robot firstRobot = engineer.getRobot();
		
		System.out.println("Robot head type:"+ firstRobot.getRobotHead());
		System.out.println("Robot torso type:"+ firstRobot.getRobotTorso());
		System.out.println("Robot arms type:"+ firstRobot.getRobotArms());
		System.out.println("Robot legs type:"+ firstRobot.getRobotLegs());
	}

}
