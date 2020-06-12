package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SelectComponents
 *
 * Full name:        System`SelectComponents
 *
 *                   SelectComponents[{image, lmat}, crit] selects components of image indicated by the label matrix lmat that satisfy crit, replacing other parts with black.
 *                   SelectComponents[image, crit] selects connected components of image.
 *                   SelectComponents[…, "prop", n] computes the property "prop" and selects the first n in sorted order.
 * Usage:            SelectComponents[…, "prop", n, p] sorts computed properties using the ordering function p.
 *
 * Options:          CornerNeighbors -> True
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SelectComponents
 * Documentation:    web: http://reference.wolfram.com/language/ref/SelectComponents.html
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
fun selectComponents(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SelectComponents", arguments.toMutableList(), options)
}
