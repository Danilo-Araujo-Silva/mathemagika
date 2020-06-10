package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Transliterate
 * 
 * Full name:        System`Transliterate
 * 
 *                   Transliterate["string"] attempts to transliterate string into plain ASCII.
 *                   Transliterate["string", script] attempts to transliterate string into the specified writing script script.
 *                   Transliterate["string", script   script ] attempts to transliterate string from script  to script .
 * Usage:                                          1         2                                              1          2
 * 
 * Options:          Variant -> Automatic
 * 
 *                   Listable
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/Transliterate
 * Documentation:    web: http://reference.wolfram.com/language/ref/Transliterate.html
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
fun transliterate(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Transliterate", arguments.toMutableList(), options)
}
