package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             IncludeHydrogens
 * 
 * Full name:        System`IncludeHydrogens
 * 
 * Usage:            IncludeHydrogens is an option for Molecule and related functions that specifies whether hydrogen atoms should be explicitly included in the results.
 * 
 * Options:
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/IncludeHydrogens
 * Documentation:    web: http://reference.wolfram.com/language/ref/IncludeHydrogens.html
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
fun includeHydrogens(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("IncludeHydrogens", arguments.toMutableList(), options)
}
