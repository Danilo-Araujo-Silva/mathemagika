package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             NetInformation
 * 
 * Full name:        System`NetInformation
 * 
 *                   NetInformation[net] gives a report about the neural network net.
 *                   NetInformation[net, "prop"] gives the value of property property "prop" of net.
 *                   NetInformation[{net , net , …}, "prop"] gives a list containing the result for each net .
 * Usage:                               1     2                                                             i
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/NetInformation
 * Documentation:    web: http://reference.wolfram.com/language/ref/NetInformation.html
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
fun netInformation(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NetInformation", arguments.toMutableList(), options)
}
