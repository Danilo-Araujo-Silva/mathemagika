package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             SymmetrizedDependentComponents
 * 
 * Full name:        System`SymmetrizedDependentComponents
 * 
 * Usage:            SymmetrizedDependentComponents[comp, sym] gives the list of components that are equivalent to the component comp by the symmetry sym.
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/SymmetrizedDependentComponents
 * Documentation:    web: http://reference.wolfram.com/language/ref/SymmetrizedDependentComponents.html
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
fun symmetrizedDependentComponents(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SymmetrizedDependentComponents", arguments.toMutableList(), options)
}
