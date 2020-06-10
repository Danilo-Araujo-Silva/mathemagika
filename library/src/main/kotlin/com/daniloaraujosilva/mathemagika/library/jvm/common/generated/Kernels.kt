package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Kernels
 * 
 * Full name:        System`Kernels
 * 
 * Usage:            Kernels[] gives the list of running kernels available for parallel computing.
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/Kernels
 * Documentation:    web: http://reference.wolfram.com/language/ref/Kernels.html
 * 
 * Definitions:      Kernels[] := Parallel`Protected`$kernels
 * 
 * Own values:       None
 * 
 * Down values:      Kernels[] := Parallel`Protected`$kernels
 * 
 * Up values:        None
 * 
 * Sub values:       None
 * 
 * Default value:    None
 * 
 * Numeric values:   None
 */
fun kernels(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Kernels", arguments.toMutableList(), options)
}
