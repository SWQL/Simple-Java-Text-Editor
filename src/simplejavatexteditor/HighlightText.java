package simplejavatexteditor;

import javax.swing.text.*;
import java.awt.*;

public class HighlightText extends DefaultHighlighter.DefaultHighlightPainter{

    public HighlightText(Color color) {
        super(color);
    }

    public void highLight(JTextComponent textComp, String[] patterns) {
        removeHighlights(textComp.getHighlighter());

        addHighlights(textComp, patterns);
    }

	private void addHighlights(JTextComponent textComp, String[] patterns) {
		try {
            Highlighter highlighter = textComp.getHighlighter();
            Document doc = textComp.getDocument();
            String text = doc.getText(0, doc.getLength());
            for (int i = 0; i < patterns.length; i++) {
                searchAndHighlight(highlighter, patterns[i], text);
            }
        } catch (BadLocationException e) {}
	}

	private void searchAndHighlight(Highlighter highlighter, String pattern,  String text)
			throws BadLocationException {
		int pos = 0;
		while ((pos = text.indexOf(pattern, pos)) >= 0) {
		    highlighter.addHighlight(pos, pos + pattern.length(), this);
		    pos += pattern.length();
		}
	}

    public void removeHighlights(Highlighter hilite) {

        Highlighter.Highlight[] hilites = hilite.getHighlights();

        for (int i = 0; i < hilites.length; i++) {
            if (hilites[i].getPainter() instanceof HighlightText) {
                hilite.removeHighlight(hilites[i]);
            }
        }
    }
}
