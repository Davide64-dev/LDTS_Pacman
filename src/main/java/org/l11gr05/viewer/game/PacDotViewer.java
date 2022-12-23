package org.l11gr05.viewer.game;

import org.l11gr05.model.elements.PacDot;
import org.l11gr05.gui.GUI;

public class PacDotViewer implements IElementViewer<PacDot> {
    @Override
    public void draw(PacDot pacDot, GUI gui) {
        gui.drawPacDot(pacDot.getPosition());
    }
}
