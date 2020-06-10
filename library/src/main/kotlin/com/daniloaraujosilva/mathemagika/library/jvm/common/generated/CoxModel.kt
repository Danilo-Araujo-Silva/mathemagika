package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             CoxModel
 * 
 * Full name:        System`CoxModel
 * 
 * Usage:            CoxModel[…] represents the symbolic proportional hazards model obtained from CoxModelFit.
 * 
 *                                      19
 *                   ConfidenceLevel -> --
 *                                      20
 *                   ConfidenceRange -> All
 * Options:          ConfidenceTransform -> LogLog
 * 
 *                   HoldAll
 *                   NHoldAll
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/CoxModel
 * Documentation:    web: http://reference.wolfram.com/language/ref/CoxModel.html
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
fun coxModel(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CoxModel", arguments.toMutableList(), options)
}
