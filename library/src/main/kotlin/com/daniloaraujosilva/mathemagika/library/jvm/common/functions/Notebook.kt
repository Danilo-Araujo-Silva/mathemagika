package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Notebook
 *
 * Full name:        System`Notebook
 *
 *                   Notebook[{cell , cell , …}] is the low‐level construct that represents a notebook manipulated by the Wolfram System front end.
 * Usage:                          1      2
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Notebook
 * Documentation:    web: http://reference.wolfram.com/language/ref/Notebook.html
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
fun notebook(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Notebook", arguments.toMutableList(), options)
}
