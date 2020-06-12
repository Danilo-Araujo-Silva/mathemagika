package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             QuantityVariableDimensions
 *
 * Full name:        System`QuantityVariableDimensions
 *
 * Usage:            QuantityVariableDimensions[quantityvariable] returns a list of base dimensions associated with the specified quantityvariable.
 *
 * Options:          None
 *
 *                   Listable
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/QuantityVariableDimensions
 * Documentation:    web: http://reference.wolfram.com/language/ref/QuantityVariableDimensions.html
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
fun quantityVariableDimensions(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("QuantityVariableDimensions", arguments.toMutableList(), options)
}
