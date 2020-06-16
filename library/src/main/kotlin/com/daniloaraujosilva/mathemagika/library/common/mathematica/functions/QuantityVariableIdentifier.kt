package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             QuantityVariableIdentifier
 *
 * Full name:        System`QuantityVariableIdentifier
 *
 * Usage:            QuantityVariableIdentifier[quantityvariable] returns the identifier associated with the specified quantityvariable.
 *
 * Options:          None
 *
 *                   Listable
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/QuantityVariableIdentifier
 * Documentation:    web: http://reference.wolfram.com/language/ref/QuantityVariableIdentifier.html
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
fun quantityVariableIdentifier(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("QuantityVariableIdentifier", arguments.toMutableList(), options)
}
