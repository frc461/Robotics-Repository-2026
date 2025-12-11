package frc.robot;

import edu.wpi.first.wpilibj2.command.Command;

public class ControllerCommand extends Command {
    private final MotorSubsystem subsystem;

    public ControllerCommand(MotorSubsystem subsystem) {
        this.subsystem = subsystem;   
    }

    @Override
    public void initialize() {}

    @Override
    public void execute() {}

    @Override
    public void end(boolean interrupted) {}

    @Override
    public boolean isFinished() { return false; }
} // not used?
