package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ChoiceButtons
 *
 * Full name:        System`ChoiceButtons
 *
 *                   ChoiceButtons[] represents a pair of OK and Cancel buttons that close a dialog.
 *                   ChoiceButtons[{act  , act      }] represents OK and Cancel buttons that evaluate the corresponding act  when clicked.
 *                                     ok     cancel                                                                       i
 *                   ChoiceButtons[{lbl  , lbl      }, {act  , act      }] uses the lbl  to label the buttons.
 * Usage:                              ok     cancel       ok     cancel               i
 *
 * Options:          None
 *
 *                   HoldAll
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ChoiceButtons
 * Documentation:    web: http://reference.wolfram.com/language/ref/ChoiceButtons.html
 *
 * Definitions:      None
 *
 * Own values:       None
 *
 * Down values:      None
 *
 * Up values:        None
 *
 * Sub values:       None
 *
 * Default value:    None
 *
 * Numeric values:   None
 */
fun choiceButtons(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ChoiceButtons", arguments.toMutableList(), options)
}
