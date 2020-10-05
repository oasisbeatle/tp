package seedu.duke.template;

import seedu.duke.component.Inductor;
import seedu.duke.component.Resistor;

public class LrTemplate extends RTemplate {
    private static final String RL_TEMPLATE = "\t+---R-----L---+\n"
                                            + "\t|             |\n"
                                            + "\t|             |\n"
                                            + "\t+----+V_ac+---+\n";

    private Inductor inductor;

    public LrTemplate(double resistance, double inductance, double powerSupply) {
        super(resistance, powerSupply);
        inductor = new Inductor(inductance);
    }

    public LrTemplate() {
        this(0,0,0);
    }

    /**
     * Returns inductor object, an attribute of the instance of LrTemplate.
     *
     * @return inductor, an instance of the Inductor class.
     */
    public Inductor getInductor() {
        return inductor;
    }


    public double getImpedance(Inductor L, Resistor R){
        double Z = Math.sqrt(Math.pow(R.getValue(), 2) + Math.pow(L.getValue()*angularFrequency, 2));
        return Z;
    }

    /**
     * Returns String consisting of total inductance and resistance values of the LrTemplate object.
     *
     * @return String representation of LrTemplate object.
     */
    @Override
    public String toString() {
        return super.toString() + "Total Inductance: " + inductor + System.lineSeparator();
    }

}
