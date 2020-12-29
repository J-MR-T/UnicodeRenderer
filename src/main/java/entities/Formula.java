package entities;

import rendering.DisplayObjects;
import mainpack.Var;

public class Formula extends Entity {
    private DisplayedFormula displayForm;

    public Formula(int[] pos, DisplayObjects[][] charRepresentation, int[] bounds, int frequency) {
        super(pos, charRepresentation, bounds, frequency);
        displayForm = null;
    }

    public Formula(int[] pos, DisplayObjects[][] charRepresentation, int[] bounds, int frequency, DisplayedFormula displayForm) {
        super(pos, charRepresentation, bounds, frequency);
        this.displayForm = displayForm;
    }

    @Override
    protected void move(int[] newPos) {
        this.pos = newPos;
    }

    @Override
    public void updateInner() {
        //Collisions are checked in the Game Updater

    }

    public String toString() {
        if (displayForm != null) {
            StringBuilder render = new StringBuilder();
            render.append("So it seems you ran into me  -  now you got to solve me\nSolve me for an epic boost or fail and die miserably\n");
            render.append(displayForm);
            render.append(".\n");
            return render.toString();
        } else {
            return "";
        }
    }
}
