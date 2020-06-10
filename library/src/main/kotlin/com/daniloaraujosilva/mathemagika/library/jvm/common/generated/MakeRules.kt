package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             MakeRules
 * 
 * Full name:        System`MakeRules
 * 
 * Usage:            MakeRules is an option to Solve and related functions. With MakeRules -> True, the result is presented as an AlgebraicRulesData object. With MakeRules -> False, the result is presented as a list of rules.
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: <>None[Local]
 * Documentation:    web: <>None[Web]
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
fun makeRules(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MakeRules", arguments.toMutableList(), options)
}
