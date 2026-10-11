package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.subsystems.Intake;

@TeleOp(name = "Main TeleOp")
public class ExampleTeleOp extends OpMode {
    private Robot robot;

    @Override
    public void init() {
        robot = new Robot(hardwareMap);

        telemetry.addLine("finished init");
        telemetry.update();
    }

    @Override
    public void loop() {
        robot.drivetrain.drive(
                -gamepad1.left_stick_y,
                gamepad1.left_stick_x,
                gamepad1.right_stick_x
        );

        if (gamepad2.a) {
            robot.intake.setPower(0.8);
        } else {
            robot.intake.stop();
        }
    }
}
