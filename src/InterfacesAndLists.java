/*
 * Copyright 2026 FRCSoftware
 *
 * SPDX-License-Identifier: BSD-3-Clause
 */

// Define an interface named `IntakeSensor` with a single method:
// `double distanceMillimeters();`

import java.util.ArrayList;

interface IntakeSensor {
    double distanceMillimeters();
}


// Create a `BeamBreak` class that implements `IntakeSensor`.
// The method `distanceMillimeters()` should return `3.0`.
class BeamBreak implements IntakeSensor {
    @Override
    public double distanceMillimeters() {
        return 3.0;
    }
}


// Create a `LaserCAN` class that implements `IntakeSensor`.
// The method `distanceMillimeters()` should return `5.0`.
class LaserCAN implements IntakeSensor {
    @Override
    public double distanceMillimeters() {
        return 5.0;
    }
}

public class Pair<A, B> {
        private final A first;
        private final B second;

        Pair(A first, B second) {
            this.first = first;
            this.second = second;
        }

        public A getFirst() {
            return first;
        }

        public B getSecond() {
            return second;
        }
    }
void main() {
    // Create a variable named `beamBreak` with type `IntakeSensor`, and assign it a new instance of BeamBreak.
    // Create a variable named `currentSensor` of type `IntakeSensor`, and assign it a new instance of CurrentSensor.
    // Print the result of calling `hasGamePiece()` on both sensors.
    BeamBreak beamBreak = new BeamBreak();
    LaserCAN lasercan = new LaserCAN();


    // Create a Pair of String and Integer (Pair<String, Integer>) with the values "Robot" and 254.
    // Print the first value and the second value separated by a space using getFirst() and getSecond().
    Pair<String, Integer> pair = new Pair<String,Integer>("Robot", 254);
    System.out.println(pair.getFirst() + ", " + pair.getSecond());


    // Create a List of Strings (`List<String>`) named `subsystems` using `new ArrayList<>()`.
    // Add the strings "Drivetrain", "Intake", and "Shooter" to `subsystems`.
    List<String> subsystems = new ArrayList<>();
    subsystems.add("Drivetrain");
    subsystems.add("Intake");
    subsystems.add("Shooter");


    // Print the size of the `subsystems` list.
    System.out.println(subsystems.size());

    // Using a for-each loop, iterate over `subsystems` and print each subsystem name.
    for (String name : subsystems) {
        System.out.println(name);
    }

}
