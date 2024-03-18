package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.FunctionalCommand;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj2.command.RunCommand;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.subsystems.Intake;
import frc.robot.subsystems.Shooter;

public class ShooterCommands {
    public static Command getRunLiftForwardsCommand() {
        return new RunCommand(
            () -> Shooter.getInstance().runLiftForwards(),
            Shooter.getInstance()
        );
    }

    public static Command getRunLiftBackwardsCommmand() {
        return new RunCommand(
            () -> Shooter.getInstance().runLiftBackwards(), 
            Shooter.getInstance()
        );
    }

    public static Command getStopLiftCommand() {
        return new InstantCommand(
            () -> Shooter.getInstance().stopLift(),
            Shooter.getInstance()
        );
    }

    public static Command getRunShooterForwardsCommand() {
        return new RunCommand(
            () -> Shooter.getInstance().runShooterForwards(),
            Shooter.getInstance()
        );
    }

    public static Command getRunShooterBackwardsCommand() {
        return new RunCommand(
            () -> Shooter.getInstance().runShooterBackwards(),
            Shooter.getInstance()
        );
    }

    public static Command getStopShooterCommand() {
        return new InstantCommand(
            () -> Shooter.getInstance().stopShooter(),
            Shooter.getInstance()
        );
    }

    public static Command getRunShooterAndLiftForwardsCommand() {
        return new RunCommand(
            () -> {
                Shooter.getInstance().runShooterForwards();
                Shooter.getInstance().runLiftForwards();
            },
            Shooter.getInstance()
        );
    }

    public static Command getShootNoteCommand() {
        return new SequentialCommandGroup(
            getRunShooterForwardsCommand().withTimeout(0.7),
            getRunShooterAndLiftForwardsCommand().withTimeout(1.3),
            getStopShooterCommand(),
            getStopLiftCommand()
        );
    }

    public static Command getStopShootNoteCommand() {
        return new InstantCommand(
            () -> {
                Shooter.getInstance().stopShooter();
                Shooter.getInstance().stopLift();
            },
            Shooter.getInstance()
        );
    }

    public static Command getEjectNoteCommand() {
        return new RunCommand(
            () -> {
                Intake.getInstance().runIntakeBackwards();
                Shooter.getInstance().runLiftBackwards();
            },
            Intake.getInstance(),
            Shooter.getInstance()
        );
    }

    public static Command getStopEjectNoteCommand() {
        return new InstantCommand(
            () -> {
                Intake.getInstance().stopIntake();
                Shooter.getInstance().stopLift();
            },
            Intake.getInstance(),
            Shooter.getInstance()
        );
    }

    public static Command getIntakeNoteCommand() {
        return new FunctionalCommand(
            () -> {},
            () -> {
                Intake.getInstance().runIntakeForwards();
                Shooter.getInstance().runLiftForwards();
            },
            (isFinished) -> {
                Intake.getInstance().stopIntake();
                Shooter.getInstance().stopLift();
            },
            () -> Shooter.getInstance().isLimitSwitchPressed(),
            Intake.getInstance(),
            Shooter.getInstance()
        );
    }

    public static Command stopIntakeNoteCommand() {
        return new InstantCommand(
            () -> {
                Intake.getInstance().stopIntake();
                Shooter.getInstance().stopLift();
            },
            Intake.getInstance(),
            Shooter.getInstance()
        );
    }
}
