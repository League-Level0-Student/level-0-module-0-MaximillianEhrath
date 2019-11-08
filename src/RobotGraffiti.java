import org.jointheleague.graphical.robot.Robot;
import javax.swing.JOptionPane;

public class RobotGraffiti {
public static void main(String[] args) {
	Robot M = new Robot("mini");
M.setSpeed(200);
M.penDown();
M.move(50);
M.turn(144);
M.move(50);
M.turn(-144);
M.move(50);
}


}
