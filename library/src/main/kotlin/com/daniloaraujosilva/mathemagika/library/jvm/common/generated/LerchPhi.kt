package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             LerchPhi
 * 
 * Full name:        System`LerchPhi
 * 
 * Usage:            LerchPhi[z, s, a] gives the Lerch transcendent Φ (z, s, a). 
 * 
 *                   DoublyInfinite -> False
 * Options:          IncludeSingularTerm -> False
 * 
 *                   Listable
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/LerchPhi
 * Documentation:    web: http://reference.wolfram.com/language/ref/LerchPhi.html
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
fun lerchPhi(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LerchPhi", arguments.toMutableList(), options)
}
