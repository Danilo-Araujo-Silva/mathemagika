package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             AbsoluteOptions
 * 
 * Full name:        System`AbsoluteOptions
 * 
 *                   AbsoluteOptions[expr] gives the absolute settings of options specified in an expression such as a graphics object. 
 *                   AbsoluteOptions[expr, name] gives the absolute setting for the option name. 
 *                   AbsoluteOptions[expr, {name , name , …}] gives a list of the absolute settings for the options name . 
 *                                              1      2                                                                i
 * Usage:            AbsoluteOptions[object] gives the absolute settings for options associated with an external object such as a NotebookObject. 
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/AbsoluteOptions
 * Documentation:    web: http://reference.wolfram.com/language/ref/AbsoluteOptions.html
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
fun absoluteOptions(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AbsoluteOptions", arguments.toMutableList(), options)
}
