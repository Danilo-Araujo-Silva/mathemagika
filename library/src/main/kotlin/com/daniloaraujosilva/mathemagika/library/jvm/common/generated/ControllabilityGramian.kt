package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             ControllabilityGramian
 * 
 * Full name:        System`ControllabilityGramian
 * 
 * Usage:            ControllabilityGramian[ssm] gives the controllability Gramian of the state-space model ssm.
 * 
 * Options:          Tolerance -> Automatic
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/ControllabilityGramian
 * Documentation:    web: http://reference.wolfram.com/language/ref/ControllabilityGramian.html
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
fun controllabilityGramian(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ControllabilityGramian", arguments.toMutableList(), options)
}
