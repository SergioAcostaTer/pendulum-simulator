# Pendulum Simulator

## Overview
This project simulates a pendulum system using Java Swing for the graphical display and JFreeChart for data visualization. It models a pendulum's motion using Runge-Kutta numerical methods for accurate simulation.

## Features
- Real-time simulation of a pendulum's motion.
- Interactive graphical display to drag and adjust the pendulum.
- Data visualization using JFreeChart.

## Project Structure
```plaintext
sergioacostater-pendulum-simulator/
├── pom.xml
└── src/
    └── main/
        └── java/
            └── software/
                └── ulpgc/
                    └── simulator/
                        ├── app/
                        │   ├── Main.java
                        │   ├── PendulumGraph.java
                        │   └── SwingPendulumDisplay.java
                        └── architecture/
                            ├── DataView/
                            │   └── PendulumData.java
                            ├── control/
                            │   ├── PendulumPresenter.java
                            │   └── PendulumSimulator.java
                            └── model/
                                └── Pendulum.java
```

### Key Components

#### 1. `app/`
- **`Main.java`**: Entry point of the application. Sets up the GUI and starts the simulation.
- **`PendulumGraph.java`**: Handles the creation of graphs for visualizing pendulum motion data.
- **`SwingPendulumDisplay.java`**: Manages the graphical display and interaction with the pendulum.

#### 2. `architecture/DataView/`
- **`PendulumData.java`**: Stores simulation data (time, angle, and angular velocity).

#### 3. `architecture/control/`
- **`PendulumPresenter.java`**: Links the pendulum model, simulator, and display. Updates the view in real-time.
- **`PendulumSimulator.java`**: Simulates the pendulum's motion using the Runge-Kutta method.

#### 4. `architecture/model/`
- **`Pendulum.java`**: Represents the pendulum's state (length, gravity, angle, and angular velocity).

## Prerequisites
- Java 17
- Maven

## Setup
1. Clone the repository:
   ```bash
   git clone <repository-url>
   cd sergioacostater-pendulum-simulator
   ```
2. Install dependencies:
   ```bash
   mvn clean install
   ```
3. Run the application:
   ```bash
   mvn exec:java -Dexec.mainClass="software.ulpgc.simulator.app.Main"
   ```

## Usage
- **Run the Application**: The pendulum simulator window will open.
- **Interactivity**: Drag the pendulum bob with your mouse to adjust its position. The simulation will update accordingly.
- **Graph Visualization**: Modify the code to call `PendulumGraph.plotPendulumData()` for visualizing motion data.

## Dependencies
- **JFreeChart**: Used for data visualization.
  - Maven dependency:
    ```xml
    <dependency>
        <groupId>org.jfree</groupId>
        <artifactId>jfreechart</artifactId>
        <version>1.5.3</version>
    </dependency>
    ```

## Technical Details
- **Numerical Integration**: The simulation uses the Runge-Kutta method to solve the pendulum's equations of motion.
- **GUI**: Built using Java Swing, with customizable pendulum properties and interactive capabilities.

## Future Improvements
- Add user controls to modify pendulum parameters (e.g., length, gravity).
- Save and load simulation data.
- Extend visualizations with more charts (e.g., energy vs. time).

## License
This project is licensed under the MIT License.

## Author
Sergio Acosta

