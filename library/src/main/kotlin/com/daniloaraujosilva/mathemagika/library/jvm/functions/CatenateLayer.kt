package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             CatenateLayer
 *
 * Full name:        System`CatenateLayer
 *
 *                   CatenateLayer[] represents a net layer that takes a list of input arrays and catenates them.
 * Usage:            CatenateLayer[n] represents a net layer that takes a list of input arrays and catenates them at level n.
 *
 *                   Inputs -> Automatic
 * Options:          Output -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CatenateLayer
 * Documentation:    web: http://reference.wolfram.com/language/ref/CatenateLayer.html
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
fun catenateLayer(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CatenateLayer", arguments.toMutableList(), options)
}
