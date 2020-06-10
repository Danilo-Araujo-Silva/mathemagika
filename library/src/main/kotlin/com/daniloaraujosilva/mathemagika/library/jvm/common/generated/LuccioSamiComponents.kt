package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             LuccioSamiComponents
 * 
 * Full name:        System`LuccioSamiComponents
 * 
 *                   LuccioSamiComponents[g] gives the Luccio–Sami components of the graph g.
 *                   LuccioSamiComponents[g, {v , v , …}] gives the components that include at least one of the vertices v , v , … .
 *                                             1   2                                                                      1   2
 * Usage:            LuccioSamiComponents[{v  w, …}, …] uses rules v  w to specify the graph g.
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/LuccioSamiComponents
 * Documentation:    web: http://reference.wolfram.com/language/ref/LuccioSamiComponents.html
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
fun luccioSamiComponents(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LuccioSamiComponents", arguments.toMutableList(), options)
}
