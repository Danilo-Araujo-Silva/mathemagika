package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Opener
 *
 * Full name:        System`Opener
 *
 *                   Opener[x] represents an opener with setting x, displayed as OpenerBox[True] when x is True and OpenerBox[False] when x is False.
 * Usage:            Opener[Dynamic[x]] takes the setting to be the dynamically updated current value of x, with the value of x being toggled if the opener is clicked.
 *
 *                   Appearance -> Automatic
 *                   AutoAction -> False
 *                   Background -> Automatic
 *                   BaselinePosition -> Automatic
 *                   BaseStyle -> {}
 *                   ContentPadding -> True
 *                   ContinuousAction -> False
 *                   DefaultBaseStyle -> Opener
 *                   Enabled -> Automatic
 * Options:          ImageMargins -> 0
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Opener
 * Documentation:    web: http://reference.wolfram.com/language/ref/Opener.html
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
fun opener(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Opener", arguments.toMutableList(), options)
}
