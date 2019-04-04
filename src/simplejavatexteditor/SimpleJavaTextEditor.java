/**
 * @name        Simple Java NotePad
 * @package     ph.notepad
 * @file        UI.java
 * @author      SORIA Pierre-Henry
 * @email       pierrehs@hotmail.com
 * @link        http://github.com/pH-7
 * @copyright   Copyright Pierre-Henry SORIA, All Rights Reserved.
 * @license     Apache (http://www.apache.org/licenses/LICENSE-2.0)
 * @create      2012-05-04
 * @update      2016-21-03
 *
 *
 * @modifiedby  Achintha Gunasekara
 * @modweb      http://www.achinthagunasekara.com
 * @modemail    contact@achinthagunasekara.com
 */

package simplejavatexteditor;

import javax.swing.JTextPane;

public class SimpleJavaTextEditor extends JTextPane {

	public static final String AUTHOR_EMAIL = "hi@ph7.me";
	public static final String APPLICATION_NAME = "PHNotePad";
	public static final String EDITOR_EMAIL = "contact@achinthagunasekara.com";
	public static final double VERSION = 3.0;
	
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		new UI().setVisible(true);
	}

}
