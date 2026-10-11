package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.subsystems.Intake;
import org.firstinspires.ftc.teamcode.subsystems.MecanumDrive;

public class Robot {
    public final MecanumDrive drivetrain;
    public final Intake intake;

    public Robot(HardwareMap hardwareMap) {
        drivetrain = new MecanumDrive(hardwareMap);
        intake = new Intake(hardwareMap);
    }

    public void stop() {
        drivetrain.stop();
        intake.stop();
    }
}
