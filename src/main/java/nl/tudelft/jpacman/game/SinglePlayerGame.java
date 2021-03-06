package nl.tudelft.jpacman.game;

import java.util.Collection;

import nl.tudelft.jpacman.level.Level;
import nl.tudelft.jpacman.model.Direction;
import nl.tudelft.jpacman.model.PacMan;

/**
 * A {@link Game} with a single Pac-Man.
 * 
 * <ul>
 * Offers high level methods to manipulate the game:
 * <li>{@link #up()}
 * <li>{@link #down()}
 * <li>{@link #left()}
 * <li>{@link #right()}
 * </ul>
 * 
 * @author Jeroen Roosen
 */
public class SinglePlayerGame extends Game {

	/**
	 * The level being played.
	 */
	private final Level currentLevel;
	
	/**
	 * The Pac-Man that is being controlled by this game.
	 */
	private final PacMan pacMan;

	/**
	 * Creates a new single player game for a level.
	 * 
	 * @param level
	 *            A level with at least 1 Pac-Man on the board.
	 */
	public SinglePlayerGame(Level level) {
		super();
		Collection<PacMan> pacMans = level.getPacMans();
		assert pacMans.size() == 1;
		pacMan = pacMans.iterator().next();
		this.currentLevel = level;
	}

	/**
	 * Moves Pac-Man up 1 square.
	 */
	public void up() {
		move(pacMan, Direction.NORTH);
	}

	/**
	 * Moves Pac-Man down 1 square.
	 */
	public void down() {
		move(pacMan, Direction.SOUTH);
	}

	/**
	 * Moves Pac-Man left 1 square.
	 */
	public void left() {
		move(pacMan, Direction.WEST);
	}

	/**
	 * Moves Pac-Man square 1 square.
	 */
	public void right() {
		move(pacMan, Direction.EAST);
	}

	@Override
	public Level getCurrentLevel() {
		return currentLevel;
	}

}
