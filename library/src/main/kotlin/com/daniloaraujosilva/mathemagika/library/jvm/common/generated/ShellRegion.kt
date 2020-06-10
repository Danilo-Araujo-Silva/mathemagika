package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             ShellRegion
 * 
 * Full name:        System`ShellRegion
 * 
 *                   ShellRegion[reg] gives a solid shell of a 3D region reg.
 * Usage:            ShellRegion[reg, t] gives a solid shell of reg with minimal thickness t.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/ShellRegion
 * Documentation:    web: http://reference.wolfram.com/language/ref/ShellRegion.html
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
fun shellRegion(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ShellRegion", arguments.toMutableList(), options)
}
