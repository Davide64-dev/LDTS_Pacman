package org.l11gr05.gui;

import org.l11gr05.model.elements.Pacman;
import org.l11gr05.model.elements.Position;
import org.l11gr05.model.elements.ghost.Blinky;
import org.l11gr05.model.elements.ghost.Clyde;
import org.l11gr05.model.elements.ghost.Inky;
import org.l11gr05.model.elements.ghost.Pinky;

import java.io.IOException;

public interface GUI {
    ACTION getNextAction() throws IOException;

    void drawPacman(Pacman pacman);

    void drawWall(Position position);

    void drawPacDot(Position position);

    void drawPowerPellet(Position position);

    void drawBlinky(Blinky blinky);

    void drawPinky(Pinky pinky);

    void drawInky(Inky inky);

    void drawClyde(Clyde clyde);

    void drawText(Position position, String text, String color);

    void clear();

    void refresh() throws IOException;

    void close() throws IOException;

    enum ACTION {UP, RIGHT, DOWN, LEFT, NONE, QUIT, SELECT}
}
