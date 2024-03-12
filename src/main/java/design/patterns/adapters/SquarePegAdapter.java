package design.patterns.adapters;

import design.patterns.round.RoundPeg;
import design.patterns.square.SquarePeg;

/**
 * Adapter allows fitting square pegs into round holes.
 */
public class SquarePegAdapter extends RoundPeg {

    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        // calculate a min circle radius which acn fit this peg
        return Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2);
    }
}
