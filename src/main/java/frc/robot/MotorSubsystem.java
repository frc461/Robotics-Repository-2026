package frc.robot;

import com.ctre.phoenix6.hardware.TalonFX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj2.command.Command;

public class MotorSubsystem extends SubsystemBase {
    private final TalonFX motor;

    public MotorSubsystem() {
        motor = new TalonFX(PortNumberConstants.MOTOR_PORT);
    }

    public Command setSpeed(double speed) {
        return runOnce(
            () -> {
                motor.set(speed);
            });
    } // sets motor speed

    @Override
    public void periodic() {}

    @Override
    public void simulationPeriodic() {}
}
