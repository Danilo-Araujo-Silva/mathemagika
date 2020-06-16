package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             QuantityVariableCanonicalUnit
 *
 * Full name:        System`QuantityVariableCanonicalUnit
 *
 * Usage:            QuantityVariableCanonicalUnit[quantityvariable] returns the canonical unit associated with the specified quantityvariable.
 *
 * Options:          None
 *
 *                   Listable
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/QuantityVariableCanonicalUnit
 * Documentation:    web: http://reference.wolfram.com/language/ref/QuantityVariableCanonicalUnit.html
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
fun quantityVariableCanonicalUnit(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("QuantityVariableCanonicalUnit", arguments.toMutableList(), options)
}
