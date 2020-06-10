package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             SystemModelLinearize
 * 
 * Full name:        System`SystemModelLinearize
 * 
 *                   SystemModelLinearize[model] gives a linearized StateSpaceModel for model at an equilibrium. 
 * Usage:            SystemModelLinearize[model, op] linearizes at the operating point op.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/SystemModelLinearize
 * Documentation:    web: http://reference.wolfram.com/language/ref/SystemModelLinearize.html
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
 * Default value:    Options[SystemModelLinearize] := SortBy[WSM`SystemModelLinearize`PackagePrivate`patchOpts[Options[WSMLink`WSMLinearize], False], ToString[#1[[1]]] & ]
 * 
 * Numeric values:   None
 */
fun systemModelLinearize(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SystemModelLinearize", arguments.toMutableList(), options)
}
