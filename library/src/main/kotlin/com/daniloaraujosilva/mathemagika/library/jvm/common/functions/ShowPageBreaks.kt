package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ShowPageBreaks
 *
 * Full name:        System`ShowPageBreaks
 *
 * Usage:            ShowPageBreaks is a notebook option that specifies whether to indicate in the on‐screen display of a notebook where page breaks would occur if the notebook were printed.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ShowPageBreaks
 * Documentation:    web: http://reference.wolfram.com/language/ref/ShowPageBreaks.html
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
fun showPageBreaks(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ShowPageBreaks", arguments.toMutableList(), options)
}
