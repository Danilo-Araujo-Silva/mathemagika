package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             DynamicSetting
 * 
 * Full name:        System`DynamicSetting
 * 
 *                   DynamicSetting[e] represents an object which displays as e, but is interpreted as the dynamically updated current value of Setting[e] if supplied as Wolfram Language input.
 * Usage:            DynamicSetting[f, e] displays as e, but is interpreted as f[e] if supplied as input.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/DynamicSetting
 * Documentation:    web: http://reference.wolfram.com/language/ref/DynamicSetting.html
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
fun dynamicSetting(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DynamicSetting", arguments.toMutableList(), options)
}
