package software.ulpgc.simulator.architecture.control;

import software.ulpgc.simulator.architecture.model.Pendulum;
import software.ulpgc.simulator.app.SwingPendulumDisplay;

import java.util.Timer;
import java.util.TimerTask;

public class PendulumPresenter {
    private final SwingPendulumDisplay view;
    private final PendulumSimulator simulator;
    private Pendulum pendulum;
    private final static int period = (int) (1000 * 0.001);

    public PendulumPresenter(SwingPendulumDisplay view, PendulumSimulator simulator, Pendulum pendulum) {
        this.view = view;
        this.simulator = simulator;
        this.pendulum = pendulum;
    }

    public  void execute() {
        new Timer().schedule(task(), 0, period);
    }

    private TimerTask task() {
        return new TimerTask() {
            @Override
            public void run() {
                updateView();
            }
        };
    }

    private void updateView() {
        pendulum = simulator.simulate(pendulum);
        double pendulumX = 400 + pendulum.L() * 200 * Math.sin(pendulum.theta());
        double pendulumY = 100 + pendulum.L() * 200 * Math.cos(pendulum.theta());
        view.updatePendulumPosition(pendulumX, pendulumY);
    }
}
