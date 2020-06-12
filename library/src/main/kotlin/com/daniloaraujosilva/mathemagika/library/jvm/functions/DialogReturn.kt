package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             DialogReturn
 *
 * Full name:        System`DialogReturn
 *
 *                   DialogReturn[expr] closes a dialog window, returning the expression expr from the dialog.
 * Usage:            DialogReturn[] closes a dialog window, returning Null.
 *
 * Options:          None
 *
 *                   HoldFirst
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DialogReturn
 * Documentation:    web: http://reference.wolfram.com/language/ref/DialogReturn.html
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
fun dialogReturn(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DialogReturn", arguments.toMutableList(), options)
}
