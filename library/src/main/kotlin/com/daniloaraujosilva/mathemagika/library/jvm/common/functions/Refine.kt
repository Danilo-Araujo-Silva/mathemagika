package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Refine
 *
 * Full name:        System`Refine
 *
 *                   Refine[expr, assum] gives the form of expr that would be obtained if symbols in it were replaced by explicit numerical expressions satisfying the assumptions assum.
 * Usage:            Refine[expr] uses default assumptions specified by any enclosing Assuming constructs.
 *
 *                   Assumptions :> $Assumptions
 * Options:          TimeConstraint -> 30
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Refine
 * Documentation:    web: http://reference.wolfram.com/language/ref/Refine.html
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
fun refine(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Refine", arguments.toMutableList(), options)
}
