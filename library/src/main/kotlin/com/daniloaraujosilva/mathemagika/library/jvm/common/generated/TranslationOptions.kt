package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             TranslationOptions
 * 
 * Full name:        System`TranslationOptions
 * 
 *                   TranslationOptions  {opt   val , opt   val , …} is an option for Style and Cell that controls how code translations are displayed.
 * Usage:                                     1      1     2      2
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/TranslationOptions
 * Documentation:    web: http://reference.wolfram.com/language/ref/TranslationOptions.html
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
fun translationOptions(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TranslationOptions", arguments.toMutableList(), options)
}
