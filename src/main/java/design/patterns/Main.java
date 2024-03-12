package design.patterns;

import design.patterns.adapters.SquarePegAdapter;
import design.patterns.round.RoundHole;
import design.patterns.round.RoundPeg;
import design.patterns.square.SquarePeg;

public class Main {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(5);
        if (hole.fits(roundPeg)) {
            System.out.println("Round peg r5 fits round hole r5.");
        }

        SquarePeg smallSqPeg = new SquarePeg(2);
        SquarePeg largeSqPeg = new SquarePeg(20);
        // hole.fits(smallSqPeg); won't  compile

        // adapter solves the problem
        SquarePegAdapter smallSqAdapter = new SquarePegAdapter(smallSqPeg);
        SquarePegAdapter largeSqAdapter = new SquarePegAdapter(largeSqPeg);

        if (hole.fits(smallSqAdapter)) {
            System.out.println("Square peg w2 fits round hole r5.");
        }
        if (!hole.fits(largeSqAdapter)) {
            System.out.println("Square peg w20 does not fit into round hole r5.");
        }
    }
}