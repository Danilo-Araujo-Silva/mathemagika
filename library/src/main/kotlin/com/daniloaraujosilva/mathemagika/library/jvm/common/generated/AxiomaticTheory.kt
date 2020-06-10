package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             AxiomaticTheory
 * 
 * Full name:        System`AxiomaticTheory
 * 
 *                   AxiomaticTheory["theory"] gives an axiomatic representation of the specified axiomatic theory.
 *                   AxiomaticTheory[{"theory",  op   s , op   s , … }] uses s  to represent the operator op  in the theory.
 *                                                  1    1    2    2              i                             i
 * Usage:            AxiomaticTheory[theory, "property"] gives the specified property of an axiomatic theory.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/AxiomaticTheory
 * Documentation:    web: http://reference.wolfram.com/language/ref/AxiomaticTheory.html
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
fun axiomaticTheory(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AxiomaticTheory", arguments.toMutableList(), options)
}
