package frc.robot.commands.Hopper;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Hopper;

public class Spin extends Command{
    public Hopper hopperSubsystem;
    public double speed;

    public Spin(Hopper hopperSubsystem) {
        this.hopperSubsystem = hopperSubsystem;
        this.speed = speed;
    }

    @Override
    public void initialize() {
        hopperSubsystem.setIdle();
    }

    @Override
    public void execute() {
        hopperSubsystem.setSpeed(0.12);
    }

    @Override
    public void end(boolean interrupted) {
        hopperSubsystem.setIdle();
    }

    @Override
    public boolean isFinished(){
        return false;
    }
}

