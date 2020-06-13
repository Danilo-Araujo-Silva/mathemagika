package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             PrependLayer
 *
 * Full name:        System`PrependLayer
 *
 * Usage:            PrependLayer[] represents a net layer that takes an input array and prepends another array to it.
 *
 *                   Element -> Automatic
 *                   Input -> Automatic
 * Options:          Output -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/PrependLayer
 * Documentation:    web: http://reference.wolfram.com/language/ref/PrependLayer.html
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
fun prependLayer(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PrependLayer", arguments.toMutableList(), options)
}
