package frc.robot;

import edu.wpi.first.math.geometry.Pose2d;
import edu.wpi.first.math.geometry.Translation2d;
import edu.wpi.first.math.kinematics.ChassisSpeeds;
import edu.wpi.first.math.kinematics.SwerveDriveKinematics;
import edu.wpi.first.math.util.Units;

public final class Constants {
    public static final class SwerveModuleConstants {
        public static final double WHEEL_DIAMETER = Units.inchesToMeters(4.0); // m
        public static final double WHEEL_CIRCUMFERENCE = Math.PI * WHEEL_DIAMETER; // m

        public static final double DRIVE_GEAR_RATIO = 6.75 / 1.0;
        public static final double STEER_GEAR_RATIO = 12.8 / 1.0;

        public static final double DRIVE_MOTOR_REVOLUTIONS_TO_METERS = WHEEL_CIRCUMFERENCE / DRIVE_GEAR_RATIO; // m / rot
        public static final double DRIVE_MOTOR_RPM_TO_METERS_PER_SECOND = WHEEL_CIRCUMFERENCE / (DRIVE_GEAR_RATIO * 60.0); // m/s / rpm

        public static final double DRIVE_MOTOR_KS = 0.0; // V
        public static final double DRIVE_MOTOR_KV = 0.0; // V / m/s

        public static final double DRIVE_MOTOR_KP = 0.0; // V / m/s
        public static final double DRIVE_MOTOR_KI = 0.0; // V / ∫ v(t) dt
        public static final double DRIVE_MOTOR_KD = 0.0; // V / a(t)

        public static final double STEER_MOTOR_KS = 0.07907; // V
        public static final double STEER_MOTOR_KV = 1.6004 / (2 * Math.PI); // V / rad/s

        public static final double STEER_MOTOR_KP = 0.0; // V / rad
        public static final double STEER_MOTOR_KI = 0.0; // V / ∫ θ(t) dt
        public static final double STEER_MOTOR_KD = 0.0; // V / ω(t)

        public static final double DRIVE_MOTOR_MAX_VELOCITY = 5.0; // m/s
        public static final double DRIVE_MOTOR_MAX_ACCELERATION = 2.5; // m/s^2

        public static final double STEER_MOTOR_MAX_VELOCITY = 3 * Math.PI; // rad/s
        public static final double STEER_MOTOR_MAX_ACCELERATION = (3 * Math.PI) / 2; // rad/s^2
    }

    public static final class SwerveConstants {
        public static final double TRACK_WIDTH = Units.inchesToMeters(22.5); // m

        public static final double WHEEL_BASE = Units.inchesToMeters(20.5); // m

        public static final SwerveDriveKinematics SWERVE_DRIVE_KINEMATICS = new SwerveDriveKinematics(
            new Translation2d[]{
                new Translation2d(WHEEL_BASE / 2, TRACK_WIDTH / 2), 
                new Translation2d(WHEEL_BASE / 2, -TRACK_WIDTH / 2), 
                new Translation2d(-WHEEL_BASE / 2, TRACK_WIDTH / 2),
                new Translation2d(-WHEEL_BASE / 2, -TRACK_WIDTH / 2)
            }
        );

        public static final int FRONT_LEFT_DRIVE_MOTOR_ID = 1;
        public static final int FRONT_RIGHT_DRIVE_MOTOR_ID = 3;
        public static final int BACK_LEFT_DRIVE_MOTOR_ID = 5;
        public static final int BACK_RIGHT_DRIVE_MOTOR_ID = 7;

        public static final int FRONT_LEFT_STEER_MOTOR_ID = 2;
        public static final int FRONT_RIGHT_STEER_MOTOR_ID = 4;
        public static final int BACK_LEFT_STEER_MOTOR_ID = 6;
        public static final int BACK_RIGHT_STEER_MOTOR_ID = 8;

        public static final boolean FRONT_LEFT_DRIVE_MOTOR_REVERSED = false;
        public static final boolean FRONT_RIGHT_DRIVE_MOTOR_REVERSED = true;
        public static final boolean BACK_LEFT_DRIVE_MOTOR_REVERSED = true;
        public static final boolean BACK_RIGHT_DRIVE_MOTOR_REVERSED = true;

        public static final boolean FRONT_LEFT_STEER_MOTOR_REVERSED = false;
        public static final boolean FRONT_RIGHT_STEER_MOTOR_REVERSED = false;
        public static final boolean BACK_LEFT_STEER_MOTOR_REVERSED = false;
        public static final boolean BACK_RIGHT_STEER_MOTOR_REVERSED = false;

        public static final int FRONT_LEFT_STEER_ABSOLUTE_ENCODER_ID = 9;
        public static final int FRONT_RIGHT_STEER_ABSOLUTE_ENCODER_ID = 10;
        public static final int BACK_LEFT_STEER_ABSOLUTE_ENCODER_ID = 11;
        public static final int BACK_RIGHT_STEER_ABSOLUTE_ENCODER_ID = 12;
        
        public static final double FRONT_LEFT_STEER_ABSOLUTE_ENCODER_OFFSET = 0.90045; // rad
        public static final double FRONT_RIGHT_STEER_ABSOLUTE_ENCODER_OFFSET = 2.13684; // rad
        public static final double BACK_LEFT_STEER_ABSOLUTE_ENCODER_OFFSET = 6.16660; // rad
        public static final double BACK_RIGHT_STEER_ABSOLUTE_ENCODER_OFFSET = 1.49717; // rad

        public static final boolean FRONT_LEFT_STEER_ABSOLUTE_ENCODER_REVERSED = false;
        public static final boolean FRONT_RIGHT_STEER_ABSOLUTE_ENCODER_REVERSED = false;
        public static final boolean BACK_LEFT_STEER_ABSOLUTE_ENCODER_REVERSED = false;
        public static final boolean BACK_RIGHT_STEER_ABSOLUTE_ENCODER_REVERSED = false;

        public static final double X_CONTROLLER_KP = 0.0; // m/s / m
        public static final double X_CONTROLLER_KI = 0.0; // m/s / ∫ s(t) dt
        public static final double X_CONTROLLER_KD = 0.0; // m/s / v(t)

        public static final double Y_CONTROLLER_KP = 0.0; // m/s / m
        public static final double Y_CONTROLLER_KI = 0.0; // m/s / ∫ s(t) dt
        public static final double Y_CONTROLLER_KD = 0.0; // m/s / v(t)

        public static final double THETA_CONTROLLER_KP = 0.0; // rad/s / rad
        public static final double THETA_CONTROLLER_KI = 0.0; // rad/s / ∫ θ(t) dt
        public static final double THETA_CONTROLLER_KD = 0.0; // rad/s / ω(t)

        public static final double MAX_VELOCITY = 5.0; // m/s
        public static final double MAX_ACCELERATION = 2.5; // m/s^2

        public static final double MAX_ROTATIONAL_VELOCITY = Math.PI; // rad/s
        public static final double MAX_ROTATIONAL_ACCELERATION = Math.PI / 2; // rad/s^2
    }

    public static final class IntakeConstants {
        public static final int INTAKE_MOTOR_ID = 13;

        public static final double INTAKE_MOTOR_VOLTAGE = 12.0; // V
    }

    public static final class ShooterConstants {
        public static final int LEFT_SHOOTER_MOTOR_ID = 14;
        public static final int RIGHT_SHOOTER_MOTOR_ID = 15;

        public static final int SHOOTER_LIMIT_SWITCH_ID = 0;

        public static final double LIFT_MOTOR_VOLTAGE = 6.0; // V
        public static final double SHOOTER_MOTOR_VOLTAGE = 12.0; // V
    }

    public static final class ClimbConstants {
        public static final int LEFT_CLIMB_MOTOR_ID = 16;
        public static final int RIGHT_CLIMB_MOTOR_ID = 17;

        public static final int LEFT_CLIMB_LIMIT_SWITCH_ID = 1;
        public static final int RIGHT_CLIMB_LIMIT_SWITCH_ID = 2;

        public static final double CLIMB_MOTOR_VOLTAGE = 5.0; // V

        public static enum CLIMB_POSITION {
            DOWN_POSITION,
            UP_POSITION
        }

        public static enum CLIMB_MOVEMENT_DIRECTION {
            TOWARDS_DOWN_POSITION,
            TOWARDS_UP_POSITION
        }

        public static final double CLIMB_POSITION_DELAY = 0.1; // s
    }

    public static final class AmpConstants {
        public static final int AMP_MOTOR_ID = 18;

        public static final int AMP_LIMIT_SWITCH_ID = 3;

        public static final double AMP_MOTOR_VOLTAGE = 6.0; // V

        public static enum AMP_POSITION {
            RECEIVE_POSITION,
            DROP_POSITION
        }

        public static enum AMP_MOVEMENT_DIRECTION {
            TOWARDS_RECEIVE_POSITION,
            TOWARDS_DROP_POSITION
        }

        public static final double AMP_POSITION_DELAY = 0.1; // s
    }

    public static final class AutoConstants {
        // Example autonomous constants.
        public static final String EXAMPLE_AUTO_PATH_FILE_NAME = "Example Path";
        public static final ChassisSpeeds EXAMPLE_AUTO_INITIAL_CHASSIS_SPEEDS = new ChassisSpeeds();
        public static final Pose2d EXAMPLE_AUTO_INITIAL_POSITION = new Pose2d();
    }

    public static final class ControllerConstants {
        // Drive controller IDs.
        public static final int DRIVER_CONTROLLER_ID = 0;
        public static final int MANIPULATOR_CONTROLLER_ID = 1;

        // Drive controller button IDs.
        public static final int BUTTON_A = 1;
        public static final int BUTTON_B = 2;
        public static final int BUTTON_X = 3;
        public static final int BUTTON_Y = 4;
        public static final int BUTTON_LB = 5;
        public static final int BUTTON_RB = 6;
        public static final int BUTTON_BACK = 7;
        public static final int BUTTON_START = 8;
        public static final int LEFT_STICK_PRESS_DOWN = 9;
        public static final int RIGHT_STICK_PRESS_DOWN = 10;

        // Drive controller axis IDs.
        public static final int LEFT_STICK_AXIS = 1;
        public static final int RIGHT_STICK_AXIS = 5;
        public static final int LEFT_TRIGGER_AXIS = 2;
        public static final int RIGHT_TRIGGER_AXIS = 3;

        // Defines the deadzone for the controller analog inputs.
        public static final double ANALOG_INPUT_DEADBAND = 0.05;
    }

    public static final class JoystickConstants {
        public static final int DRIVER_JOYSTICK_ID = 2;
        public static final int MANIPULATOR_JOYSTICK_ID = 3;
        
        public static final int BUTTON_TRIGGER = 1;
        public static final int BUTTON_THUMB = 2;
        public static final int BUTTON_3 = 3;
        public static final int BUTTON_4 = 4;
        public static final int BUTTON_5 = 5;
        public static final int BUTTON_6 = 6;
        public static final int BUTTON_7 = 7;
        public static final int BUTTON_8 = 8;
        public static final int BUTTON_9 = 9;
        public static final int BUTTON_10 = 10;
        public static final int BUTTON_11 = 11;
        public static final int BUTTON_12 = 12;
    }
}
