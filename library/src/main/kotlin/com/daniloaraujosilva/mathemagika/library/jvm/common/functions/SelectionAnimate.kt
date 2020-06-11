package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SelectionAnimate
 *
 * Full name:        System`SelectionAnimate
 *
 *                   SelectionAnimate[notebook] animates graphics in the current selection in a notebook.
 * Usage:            SelectionAnimate[notebook, t] animates graphics for t seconds.
 *
 *                   AnimationDirection -> Forward
 * Options:          AnimationDisplayTime -> 0
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SelectionAnimate
 * Documentation:    web: http://reference.wolfram.com/language/ref/SelectionAnimate.html
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
fun selectionAnimate(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SelectionAnimate", arguments.toMutableList(), options)
}
